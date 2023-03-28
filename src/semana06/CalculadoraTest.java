package semana06;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    
    @Test
    public void somaDoisNumerosPositivos(){
        //AAA
        //Arrange
        double n1 = 10.0;
        double n2 = 2.0;
       
        //Act
        double soma = Calculadora.somar(n1, n2);
        
        //Assert
        assertEquals(12.0, soma);
    }

    @Test
    public void somaDoisNumerosNegativos(){
        //AAA
        //Arrange
        double n1 = -10.0;
        double n2 = -2.0;
       
        //Act
        double soma = Calculadora.somar(n1, n2);
        
        //Assert
        assertEquals(-12.0, soma);
    }

    @Test
    public void subtraiDoisNumerosPositivos(){
        //AAA
        //Arrange
        double n1 = 10.0;
        double n2 = 2.0;
       
        //Act
        double subtrai = Calculadora.subtrair(n1, n2);
        
        //Assert
        assertEquals(12.0, subtrai);
    }

    @Test
    public void subtraiDoisNumerosNegativos(){
        //AAA
        //Arrange
        double n1 = -10.0;
        double n2 = -2.0;
       
        //Act
        double soma = Calculadora.somar(n1, n2);
        
        //Assert
        assertEquals(-12.0, soma);
    }

    @Test
    public void MultiplicaDoisNumerosPositivos(){
        //AAA
        //Arrange
        double n1 = 10.0;
        double n2 = 2.0;
       
        //Act
        double multiplica = Calculadora.multiplicar(n1, n2);
        
        //Assert
        assertEquals(20.0, multiplica);
    }

    @Test
    public void MultiplicaDoisNumerosNegativos(){
        //AAA
        //Arrange
        double n1 = -10.0;
        double n2 = -2.0;
       
        //Act
        double multiplica= Calculadora.multiplicar(n1, n2);
        
        //Assert
        assertEquals(20.0, multiplica);
    }

    @Test
    public void divideDoisNumerosPositivos(){
        //AAA
        //Arrange
        double n1 = 10.0;
        double n2 = 2.0;
       
        //Act
        double divide = Calculadora.dividir(n1, n2);
        
        //Assert
        assertEquals(5.0, divide);
    }

    @Test
    public void divideDoisNumerosNegativos(){
        //AAA
        //Arrange
        double n1 = -10.0;
        double n2 = -2.0;
       
        //Act
        double divide = Calculadora.dividir(n1, n2);
        
        //Assert
        assertEquals(5.0, divide);
    }


}
