//[CalcINSS] Faça um programa que instancie um vetor de 10 elementos da classe funcionário. 
//Cada funcionário armazena as informações: matrícula, nome e salário. No programa principal
//da aplicação, leia os dados de 10 funcionários e preencha cada uma das posições do vetor com
//as instâncias da classe Funcionário (objetos). Na classe funcionário, crie um método chamado 
//calcularInss que, ao ser invocado, retorna o valor do INSS a ser pago, considerando nas seguintes
//faixas:
//          até 720,00 paga 7,65%; 
//          de 720,01 até 1200,00 paga 9%;
//          e de 1200,01 até 2400,00 paga 11%. 
//Faça com que seu programa exiba o valor do INSS a ser pago de cada funcionário, 
//invocando esse método em cada um deles.
class Funcionario {
    int matricula;
    String nome;
    double salario;

    public double calcularInss() {
        if (salario <= 720.00) {
            return salario * 0.0765;
        } else if (salario <= 1200.00) {
            return salario * 0.09;
        } else if (salario <= 2400.00) {
            return salario * 0.11;
        } else {
            return 0; //Caso valor informado não esteja entre as faixas
        }
    }
}
