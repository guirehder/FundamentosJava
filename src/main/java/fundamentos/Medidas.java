// 1 - Pacote
package fundamentos;

// 2 - Bibliotecas

// 3 - Classe

import java.util.Scanner;

public class Medidas {
    // 3.1 - Atributos
    static Scanner entrada = new Scanner(System.in);// instanciar o objeto de leitura

    // 3.2 - Métodos e Funções
    public static void main(String[] args){
        String opcao;
        double area = 0; // receber o resultado dos cálculos de áreas

        System.out.println("Escolha o calculo desejado");
        System.out.println("(1) - Area do Quadrado");
        System.out.println("(2) - Area do Retângulo");
        System.out.println("(3) - Area do Triângulo");
        System.out.println("(4) - Area do Círculo");

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
            default:
                System.out.println("Opção Inválida: " + opcao);
        }
        if (area > 0){
        System.out.println("A área é de " + area + "m²" );
        }
    }

    public static int calcularAreaDoQuadrado (){
        int lado; // tamanho do lado do quadrado
        System.out.println("Digite o tamanho do lado: ");
        lado = entrada.nextInt(); // leitura do tamanho do lado
        return lado * lado; // retornar a área do quadrado
    }

    public static int calcularAreaDoRetangulo (){
        int base; // tamanho da base do retangulo
        int altura; // tamanho da altura do retangulo
        System.out.println("Digite o tamanho da base: ");
        base = entrada.nextInt(); // leitura do tamanho da base
        System.out.println("Digite o tamanho da altura: ");
        altura = entrada.nextInt(); // leitura do tamanho da altura
        return base * altura; // retornar a área do retangulo
    }

    public static int calcularAreaDoTriangulo (){
        int base; // tamanho da base do triangulo
        int altura; // tamanho da altura do triangulo
        System.out.println("Digite o tamanho da base do triangulo: ");
        base = entrada.nextInt(); // leitura do tamanho da base
        System.out.println("Digite o tamanho da altura do triangulo: ");
        altura = entrada.nextInt(); // leitura do tamanho da altura
        return ((base * altura)/2) ; // retornar a área do triangulo
    }

    public static double calcularAreaDoCirculo (){
        int raio; // tamanho do raio do circulo
        final double pi = 3.1416; // numero pi
        System.out.println("Digite tamanho do raio do circulo: ");
        raio = entrada.nextInt(); // leitura do tamanho da base
        return ((raio * raio) * pi); // retornar a área do retangulo
    }

}
