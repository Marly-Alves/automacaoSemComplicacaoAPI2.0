package transferencia;

//import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaTest {
    Cliente xuxa;
    Cliente silvioSantos;
    Conta contaXuxa;
    Conta contaSilvio;

    @BeforeEach
    void setUp() {
        xuxa = new Cliente("Xuxa", "07088761610", "MG14374392");
        silvioSantos = new Cliente("Silvio Santos", "02055876452", "MG15325789");

        contaXuxa = new Conta("6590", "24819-8", 2500.00, xuxa);
        contaSilvio = new Conta("1223", "4070-3", 3500.00, silvioSantos);

    }

    @Test
    public void realizarTransacao() {

        contaXuxa.realizarTransferencia(1000.00, contaSilvio);

        assertEquals(1500.00, contaXuxa.getSaldo());
        assertEquals(4500.00, contaSilvio.getSaldo());
    }

    @Test
    public void validarTransferenciaInvalida() {

        boolean resultado = contaXuxa.realizarTransferencia(3000.00, contaSilvio);

        assertFalse(resultado);
    }

    @Test
    public void validarProprietario(){
        assertEquals(xuxa, contaXuxa.getProprietario());
    }

    @Test
    public void validarAgencia() {
        assertEquals("6590", contaXuxa.getAgencia());
        assertEquals("1223", contaSilvio.getAgencia());
    }

    @Test
    public void validarNumeroConta() {
        assertEquals("24819-8", contaXuxa.getNumeroConta());
        assertEquals("4070-3", contaSilvio.getNumeroConta());
    }

}

