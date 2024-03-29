package semana06;

public class Metodos {
    public static void main(String[] args) {
        System.out.println(Math.sqrt(25.0));
        imprimirPalavra("Olá mundo!");
        imprimirPalavra("testeteste");
        
        double soma = Calculadora.somar(10.0, 2.3);
        System.out.println(soma);
        
        System.out.println(Calculadora.somar(3.3, 4.1));
    }
    
    //método que soma dois números e retorna o resultado
    public static double somar(double n1, double n2){
        return n1 + n2;
    }

    //Assinatura do metodo
    //public - acesso em qualquer parte do projeto
    //static - método atrelado a classe (nao precisa criar um projeto)
    //void - tipo de retorno (sem retorno)
    //imprimirPalavra - nome do método
    //String palavra - parâmetro (pode ter zero ou muitos)
    //Definindo o método

    public static void imprimirPalavra(String palavra){
        System.out.println(palavra.toUpperCase());
    }

}



