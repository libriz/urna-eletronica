import java.util.List;

public interface IUrna {
    public Candidato incluirCandidato(Candidato candidato) throws ErroNoCandidatoException;
    public int votar(int numeroCandidato);
    public List<Candidato> getCandidatos();
    public List<Integer> getVotos();
    public void setEstadoFederativo(String estadoFederativo);
    public void setZonaEleitoral(int zonaEleitoral);
    public void setSecaoEleitoral(int secaoEleitoral);
    public void setCidade(String cidade);
    public void setNumeroDeEleitores(int numeroDeEleitores);
    public String getEstadoFederativo();
    public int getZonaEleitoral();
    public int getSecaoEleitoral();
    public String getCidade();
    public int getNumeroDeEleitores();
}
