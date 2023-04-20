package targetsistemas;

import java.util.Scanner;

/**
 *
 * @author Sayon Borges
 */
public class Fibonacci {

    /*
    2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor
    sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), 
    escreva um programa na linguagem que desejar onde, informado um número, ele calcule a 
    sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence
    ou não a sequência.
    IMPORTANTE:
    Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser 
    previamente definido no código;
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe um número para gerar a sequência de Fibonacci:");
        int num = teclado.nextInt();

        int primeiro = 0;
        int segundo = 1;
        int proximo = 0;

        System.out.print(primeiro + " ");
        System.out.print(segundo + " ");

        while (proximo < num) {
            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;

            System.out.print(proximo + " ");
        }
        if (proximo == num) {
            int informado = num;
            System.out.print("\nO número " + informado + " faz parte da sequência"
                    + " de Fibonacci.");
        } else if (proximo != num) {
            int informado = num;
            System.out.print("\nO número " + informado + " não faz parte da "
                    + "sequencia de Fibonacci.");
        }

    }

}
