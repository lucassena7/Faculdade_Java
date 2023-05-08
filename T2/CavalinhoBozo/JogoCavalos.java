public class JogoCavalos {
    public static void main(String[] args) {
        Cavalo pretinho = new Cavalo("pretinho");
        Cavalo branquinho = new Cavalo("branquinho");
        Cavalo malhadinho = new Cavalo("malhadinho");

        while (pretinho.getDistancia() < 60.0 && branquinho.getDistancia() < 60.0 && malhadinho.getDistancia() < 60.0) {
            pretinho.correr();
            branquinho.correr();
            malhadinho.correr();
            
            for (int i = 0; i < 25; i++) {
                System.out.println();
            }
        }

        if (pretinho.getDistancia() >= 60.0) {
            System.out.println("PRETINHO GANHOU !!!");
        } else if (branquinho.getDistancia() >= 60.0) {
            System.out.println("BRANQUINHO GANHOU !!!");
        } else if (malhadinho.getDistancia() >= 60.0) {
            System.out.println("MALHADINHO GANHOU !!!");
        }
    }
}