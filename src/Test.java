
public class Test {
    public static void main(String[] args){
        
        //cadastrar canditados
        Candidato candidato1 = new Candidato(01, "candidato01", Cargo.GOVERNADOR, "partido1");
        Candidato candidato2 = new Candidato(02, "candidato02", Cargo.GOVERNADOR, "partido1");
        Candidato candidato3 = new Candidato(03, "candidato03", Cargo.GOVERNADOR, "partido2");
        Candidato candidato4 = new Candidato(04, "candidato04", Cargo.DEPUTADO_ESTADUAL, "partido1");
        Candidato candidato5 = new Candidato(05, "candidato05", Cargo.DEPUTADO_ESTADUAL, "partido2");
        
        //candidato do mesmo partido e permitido? se nao, entao implementar erro
        
        //eleicao, turno
        Eleicao eleicao = new Eleicao("primeiro");
        
        //cadastrar urnas
        IUrna urna1 = eleicao.incluirUrna("SC", 1, 1, "Florianopolis", 5);
        urna1.incluirCandidato(candidato1);
        urna1.incluirCandidato(candidato2);
        urna1.incluirCandidato(candidato3);
        urna1.incluirCandidato(candidato4);
        urna1.incluirCandidato(candidato5);
        
        IUrna urna2 = eleicao.incluirUrna("SC", 2, 1, "Florianopolis", 5);
        urna2.incluirCandidato(candidato1);
        urna2.incluirCandidato(candidato2);
        urna2.incluirCandidato(candidato3);
        urna2.incluirCandidato(candidato4);
        urna2.incluirCandidato(candidato5);
        
        IUrna urna3 = eleicao.incluirUrna("SC", 3, 1, "Sao Jose", 5);
        urna3.incluirCandidato(candidato1);
        urna3.incluirCandidato(candidato2);
        urna3.incluirCandidato(candidato3);
        urna3.incluirCandidato(candidato4);
        urna3.incluirCandidato(candidato5);
        
        IUrna urna4 = eleicao.incluirUrna("SC", 4, 1, "Sao Jose", 5);
        urna4.incluirCandidato(candidato1);
        urna4.incluirCandidato(candidato2);
        urna4.incluirCandidato(candidato3);
        urna4.incluirCandidato(candidato4);
        urna4.incluirCandidato(candidato5);
        
        //votacao
        urna1.votar(00); //voto branco
        urna1.votar(99); //voto nulo
        urna1.votar(01); //candidato numero 01
        urna1.votar(02);
        urna1.votar(00);
        
        urna2.votar(04);
        urna2.votar(05);
        urna2.votar(00);
        urna2.votar(03);
        urna2.votar(03);
        
        urna3.votar(05);
        urna3.votar(05);
        urna3.votar(01);
        urna3.votar(01);
        urna3.votar(03);
        
        urna4.votar(02);
        urna4.votar(05);
        urna4.votar(01);
        urna4.votar(05);
        urna4.votar(03);
        
        //resultado
        //requisitar um resultado por vez
        
        System.out.println(eleicao.resultado("todas"));
        //System.out.println(eleicao.resultado("Florianopolis"));
    }
}
