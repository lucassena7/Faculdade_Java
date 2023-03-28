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

public class adivnum {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); //Instanciando e criando um objeto Scanner
        String fraseUm, fraseDois;

        ler.nextLine(); // esvazia o buffer do teclado
        System.out.println("Digite o nome do 1° jogador:"); 
        fraseUm = ler.nextLine();

        ler.nextLine(); // esvazia o buffer do teclado
        System.out.println("Digite o nome do 2° jogador:"); 
        fraseDois = ler.nextLine();

        System.out.println("1° jogador : " + fraseUm + " " + "2° jogador: " + fraseDois);
    }
}
