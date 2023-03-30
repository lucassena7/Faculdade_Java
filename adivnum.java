/* [ADIVNUM] O jogo Adivinha Número consiste de dois participantes que devem adivinhar um número sorteado de 1 a 1000. A cada turno, um jogador tem a chance de tentar adivinhar o número. Ao errar o palpite, o computador indica se o número secreto é maior ou menor e passa a vez para o oponente. Seu programa deverá perguntar o nome dos dois jogadores e sortear um deles para iniciar o jogo. Use a função estática random() da classe Math contida no pacote java.util;

Abaixo o exemplo de um jogo. Em negrito o que é fornecido como entrada pelo console para o programa.

Jogador 1: Ana

Jogador 2: Pedro

Jogador sorteado para comecar: Ana

Palpite Ana: 300

Computador: numero eh maior

Palpite Pedro: 700

Computador: numero eh maior

Palpite Ana: 600

Computador: numero eh maior

Palpite Pedro: 800

Computador: numero eh menor

Palpite Ana: 750

Computador: numero eh maior

Palpite Pedro: 755

Computador: numero eh menor

Palpite Ana: 751

Computador: Ana ganhou! */

import java.util.Scanner;
import java.util.Random;

public class adivnum {
    public static void main(String[] args) {
        String fraseUm, fraseDois;
        int palpite;

        Scanner texto = new Scanner(System.in); //Instanciando e criando um objeto Scanner
        Scanner palp = new Scanner(System.in);
        Random r = new Random();

        System.out.println("Digite o nome do 1° jogador:"); 
        fraseUm = texto.nextLine();
        
        System.out.println("Digite o nome do 2° jogador:"); 
        fraseDois = texto.nextLine();

        System.out.println("\n1° jogador: " + fraseUm + " 2° jogador: " + fraseDois+"\n");


        int valor = (r.nextInt(1000)+1); //Gerando um número aleatório entre 1 e 1000;

       System.out.println("O número aleatório gerado é: " + valor); //Testando para ver se o valor foi gerado

        do {
            System.out.println("Digite o seu palpite ("+fraseUm+")");
            palpite = palp.nextInt();

            if (palpite > valor) {
                System.out.println("Seu palpite é maior que o número sorteado.");
            } 
            else if (palpite < valor) {
                    System.out.println("Seu palpite é menor que o número sorteado.");
                } else {
                    System.out.println("Parabéns jogador, "+fraseUm+"!! Você acertou! O número era " + valor);
                    System.exit(0);
                }

            System.out.println("\nDigite o seu palpite ("+fraseDois+")");
            palpite = palp.nextInt();

            if (palpite > valor) {
                System.out.println("Seu palpite é maior que o número sorteado.");
            }
           else if(palpite < valor) {
                System.out.println("Seu palpite é menor que o número sorteado.");
            } else {
                System.out.println("Parabéns jogador, "+fraseDois+"!! Você acertou! O número era " + valor);
                System.exit(0);
            }
        }while (palpite != valor);

        texto.close();
        palp.close();
    }
}
