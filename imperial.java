/* 1. [IMPERIAL] No sistema imperial são utilizadas as seguintes medidas lineares:
                        1 pé = 12 polegadas
                        1 jarda = 3 pés
                        1 milha = 1760 jardas
                        1 polegada = 25,3995 milímetros
Considerando que 1 polegada equivale a 25,3995 milímetros no sistema métrico, faça o programa que converta um valor informado
em centímetros para cada uma das unidades do sistema imperial citadas acima. */

public class imperial {
    public static void main(String[] args) {
        double centimetro = 1.0f;

        System.out.println(centimetro+" centimetro equivale a "+ centimetro/30.48+" pés");
        System.out.println(centimetro+" centimetro equivale a "+ centimetro/2.54+" polegadas");
        System.out.println(centimetro+" centimetro equivale a "+ centimetro/91.44+" jardas");
        System.out.println(centimetro+" centimetro equivale a aproximadamente "+ centimetro/160900+" milhas");
        System.out.println(centimetro+" centimetro equivale a "+ centimetro*10+" milímetros");
    }
}
