package JUnit;

import TestJunit.BancoDeDados;
import TestJunit.Pessoa;
import org.junit.jupiter.api.*;

import java.time.LocalDateTime;

public class ConsultarDadosPessoasTeste {

    @BeforeAll
    static void configuraConecao() {
        BancoDeDados.iniciarConexao();
        System.out.println("Rodou");
    }

    @BeforeEach
    void insereDadosParaTeste () {
        BancoDeDados.inserirDados(new Pessoa("Joao", LocalDateTime.of(2000,1,1,13,0,0)));
    }

    @AfterEach
    void removeDadosTeste() {
        BancoDeDados.removePessoa(new Pessoa("Joao", LocalDateTime.of(2000, 1,1,13,0,0)));
    }

    @Test
    void validarDadosRetorno() {
        Assertions.assertTrue(true);
    }


    @AfterAll
    static void finalizouConecao() {
        BancoDeDados.finalizarConexao();
        System.out.println("Rodou");
    }
}
