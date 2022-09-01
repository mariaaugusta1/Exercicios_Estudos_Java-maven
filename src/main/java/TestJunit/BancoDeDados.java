package TestJunit;

import java.util.logging.Logger;

public class BancoDeDados {

    private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());
    public static void iniciarConexao() {

        LOGGER.info("Iniciou");
    }

    public static void finalizarConexao() {
        LOGGER.info("Finalizou");

    }

    public static void inserirDados(Pessoa pessoa) {
        LOGGER.info("Inseriu pessoa");
    }

    public static void removePessoa(Pessoa pessoa) {
        LOGGER.info("Removeu pessoa");
    }
}
