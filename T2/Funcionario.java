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
            return salario * 0.14;
        }
    }
}

