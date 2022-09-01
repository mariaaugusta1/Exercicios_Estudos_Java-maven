package JUnit;

import TestJunit.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class PessoaTeste {

    @Test
    void validaIdadeCorreta() {
        Pessoa jessica = new Pessoa("Jessica", LocalDateTime.of(2000, 1, 1, 15, 0, 0));
        Assertions.assertEquals(22, jessica.getIdade());
    }

    @Test
    void validaMaiordeIdade() {
        Pessoa jessica = new Pessoa("Jessica", LocalDateTime.of(2000, 1, 1, 15, 0, 0));
        Assertions.assertTrue(jessica.ehMaiorIdade());

        Pessoa joao = new Pessoa("Joao", LocalDateTime.of(2020, 1, 1, 15, 0, 0));
        Assertions.assertFalse(joao.ehMaiorIdade());
    }
}
