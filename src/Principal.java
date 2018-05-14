
import java.util.Scanner;

public class Principal{
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in); 
            
            Eleicao eleicao = new Eleicao();
            
            System.out.println("escolha uma opcao:");
            System.out.println("1 cadastrar candidato");
            System.out.println("2 cadastrar urna");
            System.out.println("3 iniciar eleicao");
            System.out.println("4 encerrar eleicao e mostrar resultado");

            int opcao=sc.nextInt();
            
            switch(opcao)
            {
                case 1:
                    System.out.println("Cadastrar candidato \n");
                    System.out.println("Digite o numero \n");
                    int numero=sc.nextInt();
                    System.out.println("Digite o nome \n");
                    String nome=sc.next();
                    System.out.println("Digite o cargo (GOVERNADOR ou DEPUTADO_ESTADUAL)\n");
                    Cargo cargo=Cargo.valueOf(sc.next().toUpperCase());
                    System.out.println("Digite o partido \n");
                    String partido=sc.next();
                    Candidato candidato = new Candidato(numero, nome, cargo, partido);
                    //if()
                    System.out.println("Candidato cadastrado! \n");
                    break;
                
                case 2:
                    System.out.println("Cadastrar urna \n");
                    System.out.println("Digite o estado federativo \n");
                    String estadoFederativo=sc.next();
                    System.out.println("Digite a zona eleitoral \n");
                    int zonaEleitoral=sc.nextInt();
                    System.out.println("Digite a secao eleitoral\n");
                    int secaoEleitoral=sc.nextInt();
                    System.out.println("Digite a cidade \n");
                    String cidade=sc.next();
                    System.out.println("Digite o numero de eleitores \n");
                    int numeroDeEleitores=sc.nextInt();
                    Urna urna = new Urna(estadoFederativo, zonaEleitoral, secaoEleitoral, cidade, numeroDeEleitores);
                    //if()
                    System.out.println("Urna cadastrada! \n");
                    break;
                    
                case 3:
                    System.out.println("Iniciar eleicao \n");
                    System.out.println("Digite o turno: (primeiro ou segundo)\n");
                    String turno=sc.next();
                    
                    
                    eleicao = new Eleicao(turno);
                    
                    //if()
                    System.out.println("Eleicao iniciada! \n");
                    break;
                    
                //votacao

                case 4:
                    System.out.println("Encerrar eleicao \n");
                    System.out.println("escolha uma opcao:");
                    System.out.println("1 resultado geral(todas cidades) \n");
                    System.out.println("2 escolher cidade \n");
                    
                    int opcao2=sc.nextInt();
                    
                    switch(opcao2){
                        case 1:
                            //if()
                            System.out.println(eleicao.resultado("todas"));
                        case 2: 
                            System.out.println("Digite a cidade \n");
                            String cidade2=sc.next();
                            
                            System.out.println(eleicao.resultado(cidade2));
                        break;
                    }
            }
            
            sc.close();
    }
}
