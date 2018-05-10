
import java.util.ArrayList;
import java.util.List;

public class Urna implements IUrna{
    public List<Candidato> candidatos = new ArrayList();
    public String estadoFederativo;
    public int zonaEleitoral;
    public int secaoEleitoral;
    public String cidade;
    public int turno;
    public int numeroDeEleitores;
    
    public Candidato incluirCandidato(int numero, String nome, Cargo cargo, String partido) throws ErroNoCandidatoException{
        Candidato candidato = new Candidato();
        
        candidato.setNumero(numero);
        candidato.setNome(nome);
        candidato.setCargo(cargo);
        candidato.setPartido(partido);
        
        candidatos.add(candidato);
        
        return candidato;
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
}
