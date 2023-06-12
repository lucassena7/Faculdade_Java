import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FuncionarioTest {
    @Test
    public void testCriarFuncionarioComNomeInvalido() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Funcionario("Lorem ipsum dolor sit amet, consectetur adipiscing elit.", 1000.0);
        });
    }

    @Test
    public void testCriarFuncionarioComSalarioMenorQueMinimo() {
        Assertions.assertThrows(ViolacaoCltException.class, () -> {
            new Funcionario("João", 200.0);
        });
    }

    @Test
    public void testAtualizarSalarioAumentoAbsurdo() {
        Funcionario funcionario = new Funcionario("Maria", 1000.0);
        
        Assertions.assertThrows(AumentoAbsurdoException.class, () -> {
            funcionario.setSalario(1200.0);
        });
    }

    @Test
    public void testAtualizarSalarioValido() {
        Funcionario funcionario = new Funcionario("João", 1000.0);
        funcionario.setSalario(1100.0);

        Assertions.assertEquals(1100.0, funcionario.getSalario(), 0.001);
    }
}
