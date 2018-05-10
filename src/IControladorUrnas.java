
public interface IControladorUrnas {
    
    public IUrna incluiUrna(String estadoFederativo, int zonaEleitoral, int secaoEleitoral, 
            String cidade, int turno, int numeroDeEleitores);
    
    /**
     * @param candidato 
     * @return retorna o voto
     */
    //public String votar();
    
     /**
     * @return retorna o total de votos
     */
    //public String totalizar()
}
