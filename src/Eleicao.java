import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Eleicao {
    public String turno;
    public List<IUrna> todasUrnas = new ArrayList();
    public List<IUrna> urnas = new ArrayList();
    public List<Integer> votos = new ArrayList();
    public List<Candidato> candidatos = new ArrayList();

    public Eleicao() {
    }
    
    public Eleicao(String turno) {
        this.turno = turno;
    }
    
    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getTurno() {
        return turno;
    }

    public IUrna incluirUrna(IUrna urna) throws ErroNaUrnaException {
        if (todasUrnas.contains(urna))
            throw new ErroNaUrnaException();
        else
            todasUrnas.add(urna);
        return urna;
    }

    public void coletarUrnas(String cidade) {
        if (cidade.equals("todas")) {
            urnas = todasUrnas;
        } else {
            for (int i = 0; i < todasUrnas.size(); i++) {
                IUrna urna = todasUrnas.get(i);
                if (urna.getCidade().equals(cidade))
                    urnas.add(urna);
            }
        }
    }

    public void coletarVotos() {
        List<Integer> votosTemp = new ArrayList();
        int v = -1;
        
        for (int i = 0; i < urnas.size(); i++) {
            IUrna urna = urnas.get(i);
            votosTemp = urna.getVotos();
            for (int y = 0; y < votosTemp.size(); y++) {
                v = votosTemp.get(y);
                votos.add(v);
            }
        }
    }

    public void coletarCandidatos() {
        List<Candidato> candidatosTemp = new ArrayList();
        Candidato candidato;
        
        for (int i = 0; i < urnas.size(); i++) {
            IUrna urna = urnas.get(i);
            candidatosTemp = urna.getCandidatos();
            for (int y = 0; y < candidatosTemp.size(); y++) {
                candidato = candidatosTemp.get(y);
                if (!candidatos.contains(candidato))
                    candidatos.add(candidato);
            }
        }
    }

    public String resultado(String cidade) {
        coletarUrnas(cidade);
        coletarCandidatos();
        coletarVotos();
        
        String resultado = "";
        
        if (cidade.equals("todas"))
            resultado += "Resultado geral " + turno + " turno: " + "\n\n";
        else
            resultado += "Resultado de " + cidade + " " + turno + " turno: " + "\n\n";
       
        resultado += "Urnas cadastradas: " + urnas.size() + "\n\n";
        
        resultado += "Candidatos(as) cadastrados(as): " + candidatos.size() + "\n\n";
        
        int votosTemp = 0;
        int votosTemp1 = 0;
        int votosTemp2 = 0;
        int votosTemp3 = 0;
        String governador = null;
        List<String> deputadosVencedores = new ArrayList();
        
        Set<Integer> uniqueSet = new HashSet<Integer>(votos);
        
        for (Integer temp : uniqueSet) {
            if (temp != 00 && temp != 99) {
                Candidato candidato = null;
                for (int i = 0; i < candidatos.size(); i++) {
                    candidato = candidatos.get(i);
                    if ((temp == candidato.getNumero())&&candidato.getCargo().equals(Cargo.GOVERNADOR)){
                        votosTemp = Collections.frequency(votos, temp);
                        resultado += candidato.getNome() + ": " + votosTemp + " votos" + "\n";
                            if(votosTemp>votosTemp1){
                                governador = candidato.getNome();
                                votosTemp1=votosTemp;
                            }
                    }
                    if ((temp == candidato.getNumero())&&candidato.getCargo().equals(Cargo.DEPUTADO_ESTADUAL)){
                        votosTemp2 = Collections.frequency(votos, temp);
                        resultado += candidato.getNome() + ": " + votosTemp2 + " votos" + "\n";
                        if(deputadosVencedores.size()<4) {
                            if(votosTemp2>=votosTemp3){
                                deputadosVencedores.add(candidato.getNome());
                                votosTemp3=votosTemp2;
                            }
                        }
                    }
                }
            }
        }
        
        resultado += "\n";
        
        for (Integer temp : uniqueSet) {
            if (temp == 00)
                resultado += "Votos em branco: " + Collections.frequency(votos, temp) + " votos" + "\n";
            else if (temp == 99)
                resultado += "Votos nulos: " + Collections.frequency(votos, temp) + " votos" + "\n";
        }
        
        resultado += "\n";
        
        if (cidade.equals("todas") && turno == "primeiro") {
            resultado += "Governador vencedor: " + governador + "\n\n";
            resultado += "Deputados vencedores: " + "\n";
            for(String d : deputadosVencedores) {
                resultado += d + "\n";
            }
        } else if (cidade.equals("todas") && turno == "segundo") {
            resultado += "Governador eleito: " + governador + "\n\n";
            resultado += "Deputados eleitos: " + "\n";
            for(String d : deputadosVencedores) {
                resultado += d + "\n";
            }
        }
        
        return resultado;
    }
}
