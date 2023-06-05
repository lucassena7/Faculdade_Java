import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cesta cesta = new Cesta();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Menu:");
            System.out.println("1. Colocar produto na cesta");
            System.out.println("2. Mostrar o conteúdo da cesta e o valor total");
            System.out.println("3. Limpar a cesta");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Tipos de produtos disponíveis:");
                    System.out.println("1. Banana");
                    System.out.println("2. Maçã");
                    System.out.println("3. Pera");
                    System.out.println("4. Uva");
                    System.out.println("5. Morango");
                    System.out.println("6. Limão");
                    System.out.println("7. Mamão");
                    System.out.print("Escolha o tipo de produto: ");
                    int tipo = scanner.nextInt();

                    Produto novoProduto;
                    switch (tipo) {
                        case 1:
                            System.out.print("Digite a quantidade: ");
                            int quantidadeBanana = scanner.nextInt();
                            novoProduto = new Banana(quantidadeBanana);
                            break;
                        case 2:
                            System.out.print("Digite a quantidade: ");
                            int quantidadeMaca = scanner.nextInt();
                            novoProduto = new Maca(quantidadeMaca);
                            break;

                        case 3:
                            System.out.print("Digite a quantidade: ");
                            int quantidadePera = scanner.nextInt();
                            novoProduto = new Pera(quantidadePera);
                            break;
                        
                        case 4:
                            System.out.print("Digite a quantidade: ");
                            int quantidadeUva = scanner.nextInt();
                            novoProduto = new Uva(quantidadeUva);
                            break;
                        
                        case 5:
                            System.out.print("Digite a quantidade: ");
                            int quantidadeMorango = scanner.nextInt();
                            novoProduto = new Morango(quantidadeMorango);
                            break;

                        case 6:
                            System.out.print("Digite a quantidade: ");
                            int quantidadeLimao = scanner.nextInt();
                            novoProduto = new Limao(quantidadeLimao);
                            break;
                        
                         case 7:
                            System.out.print("Digite a quantidade: ");
                            int quantidadeMamao = scanner.nextInt();
                            novoProduto = new Mamao(quantidadeMamao);
                            break;

                        default:
                            System.out.println("Tipo de produto inválido.");
                            continue;
                    }

                    for (int i = 0; i < novoProduto.quantidade; i++) {
                        cesta.adicionarProduto(novoProduto);
                    }
                    break;
                case 2:
                    cesta.listarCesta();
                    break;
                case 3:
                    cesta.limparCesta();
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
            System.out.println();
        } while (opcao != 0);

        scanner.close();
    }
}
