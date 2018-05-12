
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

public class Eleicao{
    
    public List<Urna> urnas = new ArrayList();
    public List<Integer> votos = new ArrayList();
    
    
    public Urna incluirUrna(String estadoFederativo, int zonaEleitoral, int secaoEleitoral, 
            String cidade, int turno, int numeroDeEleitores){
        Urna urna = new Urna();
        
        urna.setEstadoFederativo(estadoFederativo);
        urna.setZonaEleitoral(zonaEleitoral);
        urna.setSecaoEleitoral(secaoEleitoral);
        urna.setCidade(cidade);
        urna.setTurno(turno);
        urna.setNumeroDeEleitores(numeroDeEleitores);
        
        urnas.add(urna);
        
        return urna;
    }
    
    public int totalizarUrnas(){
        return urnas.size();
    }
    
    public void coletarVotos(){
        List<Integer> votosTemp = new ArrayList();
        int v;
        
        for(int i = 0; i < urnas.size(); i++){
            Urna urna = urnas.get(i);
            votosTemp = urna.getVotos();
                for(int y = 0; y < votosTemp.size(); y++){
                    v = votosTemp.get(y);
                    votos.add(v);
                }
        }
    }
    
    public int getVotosEmBranco(){
        int voto = 0;
        
        for(int i = 0; i < votos.size(); i++){
            if(votos.get(i)==00)
            voto++;
        }
        
        return voto;
    }
    
    public int getVotosNulo(){
        int voto = 0;
        
        for(int i = 0; i < votos.size(); i++){
            if(votos.get(i)==99)
            voto++;
        }
        
        return voto;
    }
    
    public String getGovernadorMaisVotado(){
        String governador = null;
        
        //
        
        return governador;
    }
    
    public String getDeputadosMaisVotados(){
        String deputados = null;
        
        //
        
        return deputados;
    }
    
    public static void main(String[] args){
        
        Eleicao eleicao = new Eleicao();
        
        //resultado parcial:
        
        //encerrar eleicao?
        
        //resultado
        eleicao.coletarVotos();
        System.out.println("Resultado: ");
        System.out.println("Urnas cadastradas: "+ eleicao.totalizarUrnas());
        System.out.println("votos em branco: " + eleicao.getVotosEmBranco());
        System.out.println("votos nulo: " + eleicao.getVotosNulo());
        System.out.println("Governador vencedor do turno: " + eleicao.getGovernadorMaisVotado());
        System.out.println("Deputados vencedores do turno: " + eleicao.getDeputadosMaisVotados());
        // 
    }
}
