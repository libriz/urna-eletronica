
public class Test {
    public static void main(String[] args){
        
        ControladorUrnas controladorUrnas = new ControladorUrnas();
        IUrna urna1 = controladorUrnas.incluiUrna("SC", 1, 1, "Florianopolis", 1, 5);
        urna1.incluirCandidato(01, "candidato01", Cargo.GOVERNADOR, "partido1");
        urna1.incluirCandidato(02, "candidato02", Cargo.GOVERNADOR, "partido1");
        urna1.incluirCandidato(03, "candidato03", Cargo.GOVERNADOR, "partido2");
        urna1.incluirCandidato(04, "candidato04", Cargo.DEPUTADO_ESTADUAL, "partido1");
        urna1.incluirCandidato(05, "candidato05", Cargo.DEPUTADO_ESTADUAL, "partido2");
        

        
    }
}
