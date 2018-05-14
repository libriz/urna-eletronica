
import java.util.List;
import java.util.Scanner;

public class Principal{
        public static void main(String[] args){
            boolean exit = false;
                
            Scanner sc=new Scanner(System.in); 
            
            Eleicao eleicao = new Eleicao(null);
            
            List<IUrna> urnas = null;
            
            boolean votacaoEmAndamento = false;
            
            boolean todosEleitoresJaVotaram = false;
            
            do{
            
            System.out.println("escolha uma opcao:");
            System.out.println("1 iniciar nova eleicao");
            System.out.println("2 cadastrar urna");
            System.out.println("3 cadastrar candidato");
            System.out.println("4 configurar ou iniciar votacao");
            System.out.println("5 encerrar eleicao ou mostrar resultados");
            System.out.println("6 sair \n");
            if(eleicao.getTurno()!=null){
                System.out.println("*** Eleicao em andamento *** \n");
            }

            int opcao=sc.nextInt();
            
            switch(opcao)
            {
                case 1:
                    if(eleicao.getTurno()==null){
                        System.out.println("Iniciar nova eleicao \n");
                        System.out.println("Digite o turno: (primeiro ou segundo)\n");
                        String turno=sc.next();

                        eleicao = new Eleicao(turno);

                        //if()
                        System.out.println("*** Eleicao iniciada! ***\n");
                    }else{
                         System.out.println("*** Eleicao ja foi iniciada! ***\n");
                    }
                break;
                
                case 2:
                    if(eleicao.getTurno()!=null){
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
                        
                        IUrna urna = new Urna(estadoFederativo, zonaEleitoral, secaoEleitoral, cidade, numeroDeEleitores);
                        eleicao.incluirUrna(urna);
                        //if()
                        System.out.println("*** Urna cadastrada! ***\n");
                    }else{
                         System.out.println("*** Eleicao precisa ser iniciada antes! ***\n");
                    }
                break;
                    
                case 3:
                    if(eleicao.getTurno()!=null){
                        System.out.println("Cadastrar candidato \n");
                        System.out.println("Digite o numero \n");
                        int numero = -1;
                        int numeroTZ=sc.nextInt();
                        if(numeroTZ==1) numero=0x01;
                        if(numeroTZ==2) numero=0x02;
                        if(numeroTZ==3) numero=0x03;
                        if(numeroTZ==4) numero=0x04;
                        if(numeroTZ==5) numero=0x05;
                        if(numeroTZ==6) numero=0x06;
                        if(numeroTZ==7) numero=0x07;
                        if(numeroTZ==8) numero=0x08;
                        if(numeroTZ==9) numero=0x09;
                        System.out.println("Digite o nome \n");
                        String nome=sc.next();
                        System.out.println("Digite o cargo (GOVERNADOR ou DEPUTADO_ESTADUAL)\n");
                        Cargo cargo=Cargo.valueOf(sc.next().toUpperCase());
                        System.out.println("Digite o partido \n");
                        String partido=sc.next();
                        Candidato candidato = new Candidato(numero, nome, cargo, partido);
                        //if()
                        System.out.println("*** Candidato cadastrado! ***\n");
                        //
                        
                        System.out.println("Digite a cidade que o candidato deve ser incluido\n");
                        String cidade=sc.next();
                        urnas = eleicao.coletarUrnas(cidade);
                        for (int i = 0; i < urnas.size(); i++) {
                            IUrna urnaT1 = urnas.get(i);
                            urnaT1.incluirCandidato(candidato);
                        }
                        
                        System.out.println("*** Candidato incluido na(s) urna(s) de " + cidade + " ***\n");
                    }else{
                         System.out.println("*** Eleicao precisa ser iniciada antes! ***\n");
                    }
                break;
                    
                //votacao
                case 4:
                if(eleicao.getTurno()!=null&&!votacaoEmAndamento){
                    System.out.println("configurar urna / escolha uma opcao:");
                    System.out.println("digitar a cidade de votacao");
                
                    String cidadeT=sc.next();
                
                    urnas = eleicao.coletarUrnas(cidadeT);
                    //System.out.println("n urnas: " + urnas.size() + "\n");
                    votacaoEmAndamento = true;
                
                    System.out.println("*** votacao em andamento! *** \n");
                
                }else
                {
                    if(!todosEleitoresJaVotaram){
                        for (int i = 0; i < urnas.size(); i++) {
                            int numeroDeVotos = 0;
                            IUrna urnaT = urnas.get(i);
                            while(numeroDeVotos<urnaT.getNumeroDeEleitores()){
                                System.out.println("escolha uma opcao:");
                                System.out.println("1 digitar o numero do candidato");
                                System.out.println("2 voto em branco");
                                System.out.println("3 voto nulo \n");

                                int opcao2=sc.nextInt();

                                switch(opcao2){
                                    case 1:
                                        System.out.println("Digite o numero \n");
                                        int numeroT=sc.nextInt();

                                        urnaT.votar(numeroT);
                                        numeroDeVotos++;
                                        System.out.println("*** voto efetuado! *** \n");
                                        break;

                                    case 2:
                                        urnaT.votar(00);
                                        numeroDeVotos++;
                                        System.out.println("*** voto efetuado! *** \n");
                                        break;

                                    case 3:
                                        urnaT.votar(99);
                                        numeroDeVotos++;
                                        System.out.println("*** voto efetuado! *** \n");
                                        break;
                                }
                            }
                        }
                        todosEleitoresJaVotaram = true;
                    }else{
                        System.out.println("*** todos os eleitores ja votaram! *** \n");
                    }
                }
                break;

                case 5:
                    if(eleicao.getTurno()!=null){
                        System.out.println("encerrar eleicao ou mostrar resultados \n");
                        System.out.println("escolha uma opcao:");
                        System.out.println("1 encerrar eleicao");
                        System.out.println("2 resultado geral(todas cidades)");
                        System.out.println("3 escolher cidade \n");

                        int opcao3=sc.nextInt();

                        switch(opcao3){
                            case 1:
                                    eleicao.setTurno(null);
                                    System.out.println("*** eleicao encerrada *** \n");
                            break;
                            case 2:
                                    System.out.println(eleicao.resultado("todas"));
                            break;
                            case 3: 
                                System.out.println("Digite a cidade \n");
                                String cidade2=sc.next();

                                System.out.println(eleicao.resultado(cidade2));
                            break;
                        }
                    }else{
                         System.out.println("*** Eleicao nao iniciada! ***\n");
                    }
                    break;
                    
                case 6:
                    exit = true;
                    sc.close();
                    break;
            }
            
        }while (!exit);
    }
}
