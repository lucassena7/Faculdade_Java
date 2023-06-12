public class Funcionario {
    private static int proximaMatricula = 1;
    private final int matricula;
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.matricula = proximaMatricula++;
        setNome(nome);
        setSalario(salario);
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.length() > 40) {
            throw new IllegalArgumentException("O nome não pode ter mais de 40 caracteres.");
        }
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario < 350) {
            throw new ViolacaoCltException("Salário menor que o salário mínimo.", "Artigo X");
        }

        if (salario > this.salario * 1.1) {
            throw new AumentoAbsurdoException("Aumento de salário maior que 10%.", "Artigo Y");
        }

        this.salario = salario;
    }
}
