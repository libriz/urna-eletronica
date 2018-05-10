
import java.util.ArrayList;
import java.util.List;

public class Urna implements IUrna{
    public List<Candidato> candidatos = new ArrayList();
    public int numeroDeEleitores;
    public String cidade;
    public String estadoFederativo;
    public String zonaEleitoral;
    public String secaoEleitoral;
    public int turno;
    
    public Candidato incluirCandidato(int id, String nome, String cargo, String partido){
        Candidato candidato = new Candidato();
        
        candidato.setId(id);
        candidato.setNome(nome);
        candidato.setCargo(cargo);
        candidato.setPartido(partido);
        
        candidatos.add(candidato);
        
        return candidato;
    }
    
    public void setNumeroDeEleitores(int numeroDeEleitores){
        this.numeroDeEleitores = numeroDeEleitores;
    }
    
    public void setCidade(String cidade){
        this.cidade = cidade;
    }
    
    public void setEstadoFederativo(String estadoFederativo){
        this.estadoFederativo = estadoFederativo;
    }
    
    public void setZonaEleitoral(String zonaEleitoral){
        this.zonaEleitoral = zonaEleitoral;
    }
    
    public void setSecaoEleitoral(String secaoEleitoral){
        this.secaoEleitoral = secaoEleitoral;
    }
    
    public void setTurno(int turno){
        this.turno = turno;
    }
}
