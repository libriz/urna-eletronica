
public class Test {
    public static void main(String[] args){
        
        Eleicao eleicao = new Eleicao();
        
        //cadastrar urna
        IUrna urna1 = eleicao.incluirUrna("SC", 1, 1, "Florianopolis", 1, 5);
        //cadastrar canditado
        urna1.incluiCandidato(01, "candidato01", Cargo.GOVERNADOR, "partido1");
        //urna1.incluiCandidato(02, "candidato02", Cargo.GOVERNADOR, "partido1");
        urna1.incluiCandidato(03, "candidato03", Cargo.GOVERNADOR, "partido2");
        urna1.incluiCandidato(04, "candidato04", Cargo.DEPUTADO_ESTADUAL, "partido1");
        urna1.incluiCandidato(05, "candidato05", Cargo.DEPUTADO_ESTADUAL, "partido2");
            
        IUrna urna2 = eleicao.incluirUrna("SC", 2, 1, "Florianopolis", 1, 5);
        urna2.incluiCandidato(01, "candidato01", Cargo.GOVERNADOR, "partido1");
        //urna2.incluiCandidato(02, "candidato02", Cargo.GOVERNADOR, "partido1");
        urna2.incluiCandidato(03, "candidato03", Cargo.GOVERNADOR, "partido2");
        urna2.incluiCandidato(04, "candidato04", Cargo.DEPUTADO_ESTADUAL, "partido1");
        urna2.incluiCandidato(05, "candidato05", Cargo.DEPUTADO_ESTADUAL, "partido2");
        
        IUrna urna3 = eleicao.incluirUrna("SC", 3, 1, "Sao Jose", 1, 5);
        urna3.incluiCandidato(01, "candidato01", Cargo.GOVERNADOR, "partido1");
        //urna3.incluiCandidato(02, "candidato02", Cargo.GOVERNADOR, "partido1");
        urna3.incluiCandidato(03, "candidato03", Cargo.GOVERNADOR, "partido2");
        urna3.incluiCandidato(04, "candidato04", Cargo.DEPUTADO_ESTADUAL, "partido1");
        urna3.incluiCandidato(05, "candidato05", Cargo.DEPUTADO_ESTADUAL, "partido2");
        
        IUrna urna4 = eleicao.incluirUrna("SC", 4, 1, "Sao Jose", 1, 5);
        urna4.incluiCandidato(01, "candidato01", Cargo.GOVERNADOR, "partido1");
        //urna4.incluiCandidato(02, "candidato02", Cargo.GOVERNADOR, "partido1");
        urna4.incluiCandidato(03, "candidato03", Cargo.GOVERNADOR, "partido2");
        urna4.incluiCandidato(04, "candidato04", Cargo.DEPUTADO_ESTADUAL, "partido1");
        urna4.incluiCandidato(05, "candidato05", Cargo.DEPUTADO_ESTADUAL, "partido2");
        
        //candidato do mesmo partido e permitido? se nao, entao implementar erro
        
        //votacao
        urna1.votar(00); //voto branco
        urna1.votar(99); //voto nulo
        urna1.votar(01); //candidato numero 01
        urna1.votar(02); 
        urna1.votar(03); 
        
        urna2.votar(04);
        urna2.votar(05);
        urna2.votar(03);
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
        eleicao.coletarVotos();
        System.out.println("Resultado: ");
        System.out.println("Urnas cadastradas: "+ eleicao.totalizarUrnas());
        System.out.println("votos em branco: " + eleicao.getVotosEmBranco());
        System.out.println("votos nulo: " + eleicao.getVotosNulo());
        System.out.println("Governador vencedor do turno: " + eleicao.getGovernadorMaisVotado());
        System.out.println("Deputados vencedores do turno: " + eleicao.getDeputadosMaisVotados());
        // 
    }
}
