
import java.util.ArrayList;
import java.util.List;

public class Urna implements IUrna{
    public String estadoFederativo;
    public int zonaEleitoral;
    public int secaoEleitoral;
    public String cidade;
    public int turno;
    public int numeroDeEleitores;
    public List<Candidato> candidatos = new ArrayList();
    public int voto;
    
    public Candidato incluiCandidato(int numero, String nome, Cargo cargo, String partido) throws ErroNoCandidatoException{
        Candidato candidato = new Candidato();
        
        candidato.setNumero(numero);
        candidato.setNome(nome);
        candidato.setCargo(cargo);
        candidato.setPartido(partido);
        
        candidatos.add(candidato);
        
        return candidato;
    }
    
    public int votar(int numeroCandidato){
        for(int i=0;i<candidatos.size();i++){
            if(numeroCandidato==00)
                voto = 00;
            else if(numeroCandidato==99)
                voto = 99;
            else if(candidatos.get(i).getNumero()==numeroCandidato)
                voto = numeroCandidato;
        }
        
        return voto;
    }
    
    public String totalizar(){
        //
        
        return null;
    }
    
    public void setEstadoFederativo(String estadoFederativo){
        this.estadoFederativo = estadoFederativo;
    }
    
    public void setZonaEleitoral(int zonaEleitoral){
        this.zonaEleitoral = zonaEleitoral;
    }
    
    public void setSecaoEleitoral(int secaoEleitoral){
        this.secaoEleitoral = secaoEleitoral;
    }
    
    public void setCidade(String cidade){
        this.cidade = cidade;
    }
    
    public void setTurno(int turno){
        this.turno = turno;
    }
    
    public void setNumeroDeEleitores(int numeroDeEleitores){
        this.numeroDeEleitores = numeroDeEleitores;
    }
    
    public String getEstadoFederativo(){
        return estadoFederativo;
    }
    
    public int getZonaEleitoral(){
        return zonaEleitoral;
    }
    
    public int getSecaoEleitoral(){
        return secaoEleitoral;
    }
    
    public String getCidade(){
        return cidade;
    }
    
    public int getTurno(){
        return turno;
    }
    
    public int getNumeroDeEleitores(){
        return numeroDeEleitores;
    }
}
