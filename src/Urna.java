
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
    public List<Integer> votos = new ArrayList();
    
    public Candidato incluirCandidato(Candidato candidato) throws ErroNoCandidatoException{
        if(candidatos.contains(candidato))
            throw new ErroNoCandidatoException();
        else
            candidatos.add(candidato);
        
        return candidato;
    }
    
    public int votar(int numero){
        int voto = -1; // voto invalido
        
        if(numero==00){
            voto=00;
            votos.add(voto);
        }else if(numero==99){
            voto=99;
            votos.add(voto);
        }else{
            for(int i=0;i<candidatos.size();i++){
                Candidato candidatoTemp = candidatos.get(i);
                if(candidatoTemp.getNumero()==numero)
                    voto = numero;
            }
            votos.add(voto);
        }
        
        return voto;
    }
    
    public List<Candidato> getCandidatos(){
        return candidatos;
    }
    
    public List<Integer> getVotos(){
        return votos;
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
