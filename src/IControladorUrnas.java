
public interface IControladorUrnas {
    public IUrna incluiUrna(String estadoFederativo, int zonaEleitoral, int secaoEleitoral, 
            String cidade, int turno, int numeroDeEleitores);
}
