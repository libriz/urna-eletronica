
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Eleicao{
    public String turno;
    
    public List<Urna> todasUrnas = new ArrayList();
    public List<Urna> urnas = new ArrayList();
    public List<Integer> votos = new ArrayList();
    public List<Candidato> candidatos = new ArrayList();
    
    public void setTurno(String turno){
        this.turno = turno;
    }
    
    public String getTurno(){
        return turno;
    }
    
    public Eleicao(String turno){
        this.turno = turno;
    }
    
    public Urna incluirUrna(String estadoFederativo, int zonaEleitoral, int secaoEleitoral, 
            String cidade, int numeroDeEleitores){
        Urna urna = new Urna();
        
        urna.setEstadoFederativo(estadoFederativo);
        urna.setZonaEleitoral(zonaEleitoral);
        urna.setSecaoEleitoral(secaoEleitoral);
        urna.setCidade(cidade);
        urna.setNumeroDeEleitores(numeroDeEleitores);
        
        todasUrnas.add(urna);
        
        return urna;
    }
    
    public void coletarUrnas(String cidade){
        
        if(cidade.equals("todas")){
            urnas=todasUrnas;
        }else
        {
            for(int i = 0; i < todasUrnas.size(); i++){
                Urna urna = todasUrnas.get(i);
                    if(urna.getCidade().equals(cidade))
                        urnas.add(urna);
            }
        }
    }
    
    public void coletarVotos(){
        List<Integer> votosTemp = new ArrayList();
        int v = -1;
        
        for(int i = 0; i < urnas.size(); i++){
            Urna urna = urnas.get(i);
                votosTemp = urna.getVotos();
                    for(int y = 0; y < votosTemp.size(); y++){
                        v = votosTemp.get(y);
                        votos.add(v);
                    }
        }
    }
    
    public void coletarCandidatos(){
        List<Candidato> candidatosTemp = new ArrayList();
        Candidato candidato;
        
        for(int i = 0; i < urnas.size(); i++){
            Urna urna = urnas.get(i);
            candidatosTemp = urna.getCandidatos();
                for(int y = 0; y < candidatosTemp.size(); y++){
                    candidato = candidatosTemp.get(y);
                    if(!candidatos.contains(candidato))
                        candidatos.add(candidato);
                }
        }
    }
    
    public String resultado(String cidade){
        coletarUrnas(cidade);
        coletarCandidatos();
        coletarVotos();
        
        String resultado = "";
        
        if(cidade.equals("todas"))
            resultado += "Resultado geral "+ turno + " turno: " + "\n\n";
        else
            resultado += "Resultado de " + cidade + " " + turno + " turno: " + "\n\n";
        
        resultado+= "Urnas cadastradas: " + urnas.size() + "\n\n";
        
        resultado+= "Candidatos(as) cadastrados(as): " + candidatos.size() + "\n\n";
        
        Set<Integer> uniqueSet = new HashSet<Integer>(votos);
        
	for (Integer temp : uniqueSet) {
                if(temp!=00 && temp!=99){
                    Candidato candidato = null;
                    for(int i = 0; i < candidatos.size(); i++){
                        candidato = candidatos.get(i);
                        if(temp==candidato.getNumero())
                            resultado+= candidato.getNome() + ": " + Collections.frequency(votos, temp) + " votos" + "\n";
                    }
                }
	}
        
        resultado+= "\n";
        
        for (Integer temp : uniqueSet) {
            if(temp==00)
                resultado+= "Votos em branco: " + Collections.frequency(votos, temp) + " votos" + "\n";
            else if(temp==99)
                resultado+= "Votos nulos: " + Collections.frequency(votos, temp) + " votos" + "\n";
	}
        
        return resultado;
    }
    
    public static void main(String[] args){
        
        //Eleicao eleicao = new Eleicao(primeiro);
        //Eleicao eleicao = new Eleicao(segundo);
        
        //resultado
        //System.out.println(eleicao.resultado("todas"));
    }
}
