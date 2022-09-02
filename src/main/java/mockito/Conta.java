package mockito;

public class Conta {

    private int saldo;

    public Conta (int saldo) {
        this.saldo = saldo;
    }

    public void pagaBoleto( int valorPagar) {
        validaSaldo(valorPagar);
        debita(valorPagar);
        enviarCredito(valorPagar);
    }

    public void validaSaldo(int valorPagar) {
        if (valorPagar > saldo) {
            throw new IllegalStateException("Saldo insuficiente");
        }
    }

    public void debita(int valorPagar) {
        this.saldo = this.saldo - valorPagar;
    }

    public void enviarCredito(int valorPagar) {

    }
}

