
import java.util.Scanner;

public class Votacao {

    public static void main(String[] args) {
        boolean exit = false;
                
        Scanner sc=new Scanner(System.in);
        
        do{
            //if(){
                System.out.println("configurar urna / escolha uma opcao:");
                System.out.println("digitar a cidade de votacao");
                String cidade=sc.next();
                //
                
            //}else{
                System.out.println("escolha uma opcao:");
                System.out.println("1 digitar o numero do candidato");
                System.out.println("2 voto em branco");
                System.out.println("3 voto nulo");
            
                int opcao=sc.nextInt();
                
                switch(opcao){
                    case 1:
                        System.out.println("Digite o numero \n");
                        int numero=sc.nextInt();
                        
                        //urna.votar(numero);
                        exit = true;
                        break;
                    
                    case 2:
                        //urna.votar(00);
                        exit = true;
                        break;
                        
                    case 3:
                        //urna.votar(99);
                        exit = true;
                        break;
            //}
                }
        }while (!exit);
    }
}
