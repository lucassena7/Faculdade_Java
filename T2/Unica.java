public class Unica {
    
    private static Unica instancia = new Unica();
 
    private Unica() {
       // construtor privado vazio
    }
    public static Unica pegaInstancia() {
       return instancia;
    }
 }
 
