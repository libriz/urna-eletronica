public class Test {

    public static void main(String[] args) {
        
        //boolean exit = false;
        
        //do{
            
        //switch(1){
            //case 1:
        
            Candidato candidato1 = new Candidato(0x01, "candidato01", Cargo.GOVERNADOR, "partido1");
            Candidato candidato2 = new Candidato(0x02, "candidato02", Cargo.GOVERNADOR, "partido1");
            Candidato candidato3 = new Candidato(0x03, "candidato03", Cargo.GOVERNADOR, "partido2");
            Candidato candidato4 = new Candidato(0x04, "candidato04", Cargo.GOVERNADOR, "partido2");
            Candidato candidato5 = new Candidato(0x05, "candidato05", Cargo.GOVERNADOR, "partido2");
            Candidato candidato6 = new Candidato(0x06, "candidato06", Cargo.DEPUTADO_ESTADUAL, "partido1");
            Candidato candidato7 = new Candidato(0x07, "candidato07", Cargo.DEPUTADO_ESTADUAL, "partido1");
            Candidato candidato8 = new Candidato(0x08, "candidato08", Cargo.DEPUTADO_ESTADUAL, "partido2");
            Candidato candidato9 = new Candidato(0x09, "candidato09", Cargo.DEPUTADO_ESTADUAL, "partido2");
            Candidato candidato10 = new Candidato(10, "candidato10", Cargo.DEPUTADO_ESTADUAL, "partido2");

            IUrna urna1 = new Urna("SC", 1, 1, "Florianopolis", 5);
            IUrna urna2 = new Urna("SC", 2, 1, "Florianopolis", 5);
            IUrna urna3 = new Urna("SC", 3, 1, "Sao Jose", 5);
            IUrna urna4 = new Urna("SC", 4, 1, "Sao Jose", 5);

            Eleicao eleicao = new Eleicao("primeiro");
            //Eleicao eleicao = new Eleicao("segundo");

            eleicao.incluirUrna(urna1);
            urna1.incluirCandidato(candidato1);
            urna1.incluirCandidato(candidato2);
            urna1.incluirCandidato(candidato3);
            urna1.incluirCandidato(candidato4);
            urna1.incluirCandidato(candidato5);
            urna1.incluirCandidato(candidato6);
            urna1.incluirCandidato(candidato7);
            urna1.incluirCandidato(candidato8);
            urna1.incluirCandidato(candidato9);
            urna1.incluirCandidato(candidato10);

            eleicao.incluirUrna(urna2);
            urna2.incluirCandidato(candidato1);
            urna2.incluirCandidato(candidato2);
            urna2.incluirCandidato(candidato3);
            urna2.incluirCandidato(candidato4);
            urna2.incluirCandidato(candidato5);
            urna2.incluirCandidato(candidato6);
            urna2.incluirCandidato(candidato7);
            urna2.incluirCandidato(candidato8);
            urna2.incluirCandidato(candidato9);
            urna2.incluirCandidato(candidato10);

            eleicao.incluirUrna(urna3);
            urna3.incluirCandidato(candidato1);
            urna3.incluirCandidato(candidato2);
            urna3.incluirCandidato(candidato3);
            urna3.incluirCandidato(candidato4);
            urna3.incluirCandidato(candidato5);
            urna3.incluirCandidato(candidato6);
            urna3.incluirCandidato(candidato7);
            urna3.incluirCandidato(candidato8);
            urna3.incluirCandidato(candidato9);
            urna3.incluirCandidato(candidato10);

            eleicao.incluirUrna(urna4);
            urna4.incluirCandidato(candidato1);
            urna4.incluirCandidato(candidato2);
            urna4.incluirCandidato(candidato3);
            urna4.incluirCandidato(candidato4);
            urna4.incluirCandidato(candidato5);
            urna4.incluirCandidato(candidato6);
            urna4.incluirCandidato(candidato7);
            urna4.incluirCandidato(candidato8);
            urna4.incluirCandidato(candidato9);
            urna4.incluirCandidato(candidato10);

            urna1.votar(0x00);
            urna1.votar(99);
            urna1.votar(0x01);
            urna1.votar(0x02);
            urna1.votar(0x00);

            urna2.votar(0x06);
            urna2.votar(0x07);
            urna2.votar(0x08);
            urna2.votar(0x03);
            urna2.votar(0x03);

            urna3.votar(0x07);
            urna3.votar(0x07);
            urna3.votar(0x06);
            urna3.votar(0x09);
            urna3.votar(0x03);

            urna4.votar(00);
            urna4.votar(10);
            urna4.votar(0x01);
            urna4.votar(0x08);
            urna4.votar(0x08);

            //um de cada vez
            System.out.println(eleicao.resultado("todas"));
            //System.out.println(eleicao.resultado("Florianopolis"));
            //System.out.println(eleicao.resultado("Sao Jose"));
        //break;
        //}
        
        //}while(!exit);
    }
}
