package JUnit;

import TestJunit.Pessoa;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;


public class AssertionsTeste {

    @Test
    void validarLancamentos() {

        int[] primeiroLancamento = {10, 20, 30, 40, 50};
        int[] segundoLancamento = {10, 5, 2, 3, 10};

        assertNotEquals(primeiroLancamento, segundoLancamento);
    }

    @Test
    void validarObjetoNulo() {
        Pessoa pessoa = null;

        assertNull(pessoa);

        pessoa = new Pessoa ("Luciano", LocalDateTime.now());

        assertNotNull(pessoa);
    }

    @Test
    void validarNumerodeTiposDiferentes() {
        double valor = 5.0;
        double outroValor = 5.0;

        assertEquals(valor, outroValor);
    }
}
