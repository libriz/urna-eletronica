
public class Test {
    public static void main(String[] args){
        
        ControladorUrnas controladorUrnas = new ControladorUrnas();
        
        IUrna urna1 = controladorUrnas.incluiUrna("SC", 1, 1, "Florianopolis", 1, 5);
        urna1.incluiCandidato(01, "candidato01", Cargo.GOVERNADOR, "partido1");
        //urna1.incluirCandidato(02, "candidato02", Cargo.GOVERNADOR, "partido1");
        urna1.incluiCandidato(03, "candidato03", Cargo.GOVERNADOR, "partido2");
        urna1.incluiCandidato(04, "candidato04", Cargo.DEPUTADO_ESTADUAL, "partido1");
        urna1.incluiCandidato(05, "candidato05", Cargo.DEPUTADO_ESTADUAL, "partido2");
        
        /*        
        IUrna urna2 = controladorUrnas.incluiUrna("SC", 2, 1, "Florianopolis", 1, 5);
        urna2.incluiCandidato(01, "candidato01", Cargo.GOVERNADOR, "partido1");
        //urna2.incluiCandidato(02, "candidato02", Cargo.GOVERNADOR, "partido1");
        urna2.incluiCandidato(03, "candidato03", Cargo.GOVERNADOR, "partido2");
        urna2.incluiCandidato(04, "candidato04", Cargo.DEPUTADO_ESTADUAL, "partido1");
        urna2.incluiCandidato(05, "candidato05", Cargo.DEPUTADO_ESTADUAL, "partido2");
        
        IUrna urna3 = controladorUrnas.incluiUrna("SC", 3, 1, "Sao Jose", 1, 5);
        urna3.incluiCandidato(01, "candidato01", Cargo.GOVERNADOR, "partido1");
        //urna3.incluiCandidato(02, "candidato02", Cargo.GOVERNADOR, "partido1");
        urna3.incluiCandidato(03, "candidato03", Cargo.GOVERNADOR, "partido2");
        urna3.incluiCandidato(04, "candidato04", Cargo.DEPUTADO_ESTADUAL, "partido1");
        urna3.incluiCandidato(05, "candidato05", Cargo.DEPUTADO_ESTADUAL, "partido2");
        
        IUrna urna4 = controladorUrnas.incluiUrna("SC", 4, 1, "Sao Jose", 1, 5);
        urna4.incluiCandidato(01, "candidato01", Cargo.GOVERNADOR, "partido1");
        //urna4.incluiCandidato(02, "candidato02", Cargo.GOVERNADOR, "partido1");
        urna4.incluiCandidato(03, "candidato03", Cargo.GOVERNADOR, "partido2");
        urna4.incluiCandidato(04, "candidato04", Cargo.DEPUTADO_ESTADUAL, "partido1");
        urna4.incluiCandidato(05, "candidato05", Cargo.DEPUTADO_ESTADUAL, "partido2");
        */
        
        //candidato do mesmo partido e permitido? se nao, entao implementar erro
        
        urna1.votar(00); //voto branco
        urna1.votar(99); //voto nulo
        urna1.votar(01); //candidato numero 01
    }
}
