import java.util.Scanner;

public class MainVeiculo {
    public static void main(String[] args) {
        Veiculo[] frota = new Veiculo[12];
        frota[0] = new Veiculo(20, 5, "RJ", "SP");
        frota[1] = new Veiculo(15, 10, "MG", "RS");
        frota[2] = new Veiculo(21, 3, "MS", "RO");
        frota[3] = new Veiculo(10, 6, "BA", "SE");
        frota[4] = new Veiculo(20, 1, "SC", "RJ");
        frota[5] = new Veiculo(60, 0, "AM", "AC");
        frota[6] = new Veiculo(20, 20,"AL", "CE");
        frota[7] = new Veiculo(45, 14,"RR", "GO");
        frota[8] = new Veiculo(30, 1,"RN", "PE");
        frota[9] = new Veiculo(40, 30,"SP", "BA");
        frota[10] = new Veiculo(10, 0,"SC", "ES");

        
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("Escolha um ônibus para comprar uma passagem (digite 0 para sair):");
            for (int i = 0; i < frota.length; i++) {
                if (frota[i] != null) {
                    System.out.printf("%02d: %s\n", i + 1, frota[i].toString());
                }
            }
            opcao = scanner.nextInt();
            if (opcao >= 1 && opcao <= frota.length) {
                Veiculo veiculo = frota[opcao - 1];
                if (veiculo.comprar()) {
                    System.out.println("\nPassagem comprada com sucesso!\n");
                } else {
                    System.out.println("\nNão há mais assentos disponíveis para este ônibus.\n");
                }
            } else if (opcao != 0) {
                System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
        scanner.close();
    }
}