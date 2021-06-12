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
        int area = 0; // receber o resultado dos cálculos de áreas

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
                // ToDo: calcular área do retangulo
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

}
