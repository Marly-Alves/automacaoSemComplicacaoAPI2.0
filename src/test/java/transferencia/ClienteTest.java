package transferencia;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {
    Cliente dadosCliente;
    //Cliente CPF;
    //Cliente RG;
    //Cliente nome;

    @BeforeEach
    void setUp() {
        dadosCliente = new Cliente("Marly Alves de Almeida", "070.258.125-10", "MG14365258");

    }
    @Test
    public void validarNome() {
        assertEquals("Marly Alves de Almeida", dadosCliente.getNome());
    }
    @Test
    public void validarCPF() {
        assertEquals("070.258.125-10", dadosCliente.getCpf());
    }
    @Test
    public void valiarRG() {
        assertEquals("MG14365258", dadosCliente.getRg());
    }
}
