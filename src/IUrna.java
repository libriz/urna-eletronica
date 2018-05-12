
import java.util.List;

public interface IUrna {
    public Candidato incluirCandidato(Candidato candidato) throws ErroNoCandidatoException;
    public void setNumeroDeEleitores(int numeroDeEleitores);
    public void setCidade(String cidade);
    public void setEstadoFederativo(String estadoFederativo);
    public void setZonaEleitoral(int zonaEleitoral);
    public void setSecaoEleitoral(int secaoEleitoral);
    public void setTurno(int turno);
    public int votar(int numeroCandidato);
    public int getNumeroDeEleitores();
    public List<Candidato> getCandidatos();
    public List<Integer> getVotos();
}
