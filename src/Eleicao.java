
public class Eleicao {
    public static void main(String[] args){
        
        //resultado parcial:
        
        //encerrar eleicao? ---> resultado();
        
        IControladorUrnas controladorUrnas = new ControladorUrnas();
        
        //Resultado();
        System.out.printf("%s",
                "Urnas cadastradas: "+controladorUrnas.totalizarUrnas()
                //"votos em branco: " + 
                //"votos nulo: " + 
                //"Governador eleito: " + 
                //"Deputados eleitos: " + 
                );
    }
}
