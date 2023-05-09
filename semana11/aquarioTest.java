package semana11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

@test
public class aquarioTest {
    public void testCalcularVolume(){
        Aquario aquario = new Aquario();
        aquario.comprimento = 100.0;
        aquario.largura = 50.0;
        aquario.altura = 50.0;

        double volume = aquario.calcularVolume();

        assertEquals(250.00, volume);
    }

    public void calcularPotenciaDoTermostato(){
        250.00 * 0.05 * (temperatura_desejada-temperatura_ambiente);
    }

}
