
public interface IUrna {
    public Candidato incluirCandidato(int id, String nome, Cargo cargo, String partido);
    public void setNumeroDeEleitores(int numeroDeEleitores);
    public void setCidade(String cidade);
    public void setEstadoFederativo(String estadoFederativo);
    public void setZonaEleitoral(int zonaEleitoral);
    public void setSecaoEleitoral(int secaoEleitoral);
    public void setTurno(int turno);
}
