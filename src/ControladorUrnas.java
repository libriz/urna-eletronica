
import java.util.ArrayList;
import java.util.List;

public class ControladorUrnas implements IControladorUrnas{
    public List<Urna> urnas = new ArrayList();
    
    public IUrna incluiUrna(String estadoFederativo, int zonaEleitoral, int secaoEleitoral, 
            String cidade, int turno, int numeroDeEleitores){
        Urna urna = new Urna();
        
        urna.setEstadoFederativo(estadoFederativo);
        urna.setZonaEleitoral(zonaEleitoral);
        urna.setSecaoEleitoral(secaoEleitoral);
        urna.setCidade(cidade);
        urna.setTurno(turno);
        urna.setNumeroDeEleitores(numeroDeEleitores);
        
        urnas.add(urna);
        
        return urna;
    }
}
