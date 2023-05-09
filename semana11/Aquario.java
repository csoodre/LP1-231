package semana11;

//1. Com base no Ex01. da semana 5 e 6 crie uma classe aquario 
//que possui os atributos comprimento, altura e largura e os métodos calcularVolume,
// calcularPotenciaDoTermostato e calcularQuantidadeLitrosFiltro. 
//Testes todos os métodos da classe Aquario utilizando testes de unidade.
public class Aquario {
    public double comprimento;
    public double altura;
    public double largura;
    public double temperatura_desejada;
    public double temperatura_ambiente;

    public double calcularVolume(){
        return comprimento * altura * largura/1000;
    }

    public double calcularPotenciaDoTermostato(){
        return calcularVolume() * 0.05 * (temperatura_desejada-temperatura_ambiente);
    }

    public double calcularFiltragemMinima(){
        return calcularVolume() * 2;
    }

    public double calcularFiltragemMaxima(){
        return calcularVolume() * 3;
    }
}
