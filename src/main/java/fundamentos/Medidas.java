// 1 - Pacote
package fundamentos;

// 2 - Bibliotecas

// 3 - Classe

import java.util.Locale;
import java.util.Scanner;

public class Medidas {
    // 3.1 - Atributos
    static Scanner entrada = new Scanner(System.in);// instanciar o objeto de leitura

    // 3.2 - Métodos e Funções
    public static void main(String[] args){
        String opcao = "";
        double area = 0; // receber o resultado dos cálculos de áreas

        while (!opcao.toUpperCase().equals("S")){
        System.out.println("Escolha o calculo desejado");
        System.out.println("(1) - Area do Quadrado");
        System.out.println("(2) - Area do Retângulo");
        System.out.println("(3) - Area do Triângulo");
        System.out.println("(4) - Area do Círculo");
        System.out.println("(5) - Tabuada");
        System.out.println("(6) - Fibonacci");
        System.out.println("(7) - Contagem Regressiva");
        System.out.println("(S) - Sair");


        opcao = entrada.nextLine(); // Leitura da opção
        switch (opcao){
            case "1":
               area = calcularAreaDoQuadrado();
                break;
            case  "2":
                area = calcularAreaDoRetangulo();
                break;
            case  "3":
                area = calcularAreaDoTriangulo();
                break;
            case  "4":
                area = calcularAreaDoCirculo();
                break;
            case  "5":
                tabuada();
                break;
            case  "6":
                fibonacci();
                break;
            case  "7":
                contagemRegressiva();
                break;
            case  "s":
            case  "S":
                System.out.println("FUI!");
                break;
            default:
                System.out.println("Opção Inválida: " + opcao);
        }
        if (area > 0){
            System.out.println("A área é de " + area + "m²" );
        }
        }

    }

    public static int calcularAreaDoQuadrado (){
        int lado; // tamanho do lado do quadrado
        System.out.print("Digite o tamanho do lado: ");
        lado = entrada.nextInt(); // leitura do tamanho do lado
        return lado * lado; // retornar a área do quadrado
    }

    public static int calcularAreaDoRetangulo (){
        int base; // tamanho da base do retangulo
        int altura; // tamanho da altura do retangulo
        System.out.print("Digite o tamanho da base: ");
        base = entrada.nextInt(); // leitura do tamanho da base
        System.out.print("Digite o tamanho da altura: ");
        altura = entrada.nextInt(); // leitura do tamanho da altura
        return base * altura; // retornar a área do retangulo
    }

    public static int calcularAreaDoTriangulo (){
        int base; // tamanho da base do triangulo
        int altura; // tamanho da altura do triangulo
        System.out.print("Digite o tamanho da base do triangulo: ");
        base = entrada.nextInt(); // leitura do tamanho da base
        System.out.print("Digite o tamanho da altura do triangulo: ");
        altura = entrada.nextInt(); // leitura do tamanho da altura
        return ((base * altura)/2) ; // retornar a área do triangulo
    }

    public static double calcularAreaDoCirculo (){
        int raio; // tamanho do raio do circulo
        final double pi = 3.1416; // numero pi
        System.out.print("Digite tamanho do raio do circulo: ");
        raio = entrada.nextInt(); // leitura do tamanho da base
        return ((raio * raio) * pi); // retornar a área do retangulo
    }

    // Desenhar o quadrado
    //for (int linha = 1; linha <= lado; linha+=2){




    public static void tabuada(){
        System.out.print("Voce quer calcular a tabuada de qual numero? ");
        byte numero = entrada.nextByte();

        for(byte i=1; i<=10;i++) {
            System.out.print(numero * i + " ");
        }
    }

    public static void fibonacci(){
        System.out.print("Quantos números deseja calcular na sequencia? ");
        byte numero = entrada.nextByte();

        switch (numero){
            case 0:
                System.out.println("A sequencia esta vazia.");
                break;
            case 1:
                System.out.println("Sequencia de Fibonacci: 1");
                break;
            default:
                int num1 = 0;
                int num2 = 1;

                System.out.print("Sequencia de Fibonacci: 1 ");
                for (byte i = 2; i <=numero; i++ ){
                    int fib = num1 + num2;
                    System.out.print(fib + " ");
                    num1 = num2;
                    num2 = fib;

                }
        }

    }

    public static void contagemRegressiva(){

        System.out.print("Começar a contagem a partir de qual numero? ");
        int numero = entrada.nextInt();

        System.out.print("Diminuindo de quantos em quantos numeros por vez? ");
        int decrescimo = entrada.nextInt();

        for (int i = numero; i >= 1; i-=decrescimo){
            System.out.print( i + " ");
        }


    }


}
