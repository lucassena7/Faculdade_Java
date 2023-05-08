import java.util.Scanner;

public class ExemploFuncionarios {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);

        Funcionario[] funcionarios = new Funcionario[10];

        for (int i = 0; i < funcionarios.length; i++) {
            System.out.println("Dados do funcionário " + (i+1) + ":");
            System.out.print("Matrícula: ");
            int matricula =dados.nextInt();
            System.out.print("Nome: ");
            String nome =dados.next();
            System.out.print("Salário: ");
            double salario =dados.nextDouble();

            Funcionario funcionario = new Funcionario();
            funcionario.matricula = matricula;
            funcionario.nome = nome;
            funcionario.salario = salario;

            funcionarios[i] = funcionario;
        }

        System.out.println("INSS a ser pago por cada funcionário:");
        for (int i = 0; i < funcionarios.length; i++) {
            Funcionario funcionario = funcionarios[i];
            double inss = funcionario.calcularInss();
            System.out.println(funcionario.nome + ": R$" + String.format("%.2f", inss));
        }
       dados.close();
    }
}