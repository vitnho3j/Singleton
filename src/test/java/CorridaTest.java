import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CorridaTest {

    @Test
    public void deveRetornarNomeCarro(){
        Corrida.getInstance().setNomeCarro("Carro 1");
        assertEquals("Carro 1", Corrida.getInstance().getNomeCarro());
    }

    @Test
    public void deveRetornarMotoristaAtual(){
        Corrida.getInstance().setNomeClienteCarro("Passageiro 1");
        assertEquals("Passageiro 1", Corrida.getInstance().getNomeClienteAtual());
    }

}
