
public interface IUrna {
    public Candidato incluirCandidato(int id, String nome, String cargo, String partido);
    public void setNumeroDeEleitores(int numeroDeEleitores);
    public void setCidade(String cidade);
    public void setEstadoFederativo(String estadoFederativo);
    public void setZonaEleitoral(String zonaEleitoral);
    public void setSecaoEleitoral(String secaoEleitoral);
    public void setTurno(int turno);
}
