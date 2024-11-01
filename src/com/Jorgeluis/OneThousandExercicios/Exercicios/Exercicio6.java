package com.Jorgeluis.OneThousandExercicios.Exercicios;

/*
 * Faça um algoritmo que lê 5 valores inteiros, um de cada vez, e conte quantos destes valores são negativos e 
 *        quantos são positivos, no fim escreva na tela a quantidade de números positivos e negativos lidos.
 */

import java.util.Scanner;

public class Exercicio6 {
    public static void Numeros() {
        Scanner teclado = new Scanner(System.in);
        int positivo = 0;
        int negativo = 0;

        System.out.println("====================");
        System.out.println("=    Exercicio 6   =");
        System.out.println("====================");
        for (int i = 1; i <= 5; i++) {
            System.out.printf("Digite o " + i + " º número: ");
            int numero = teclado.nextInt();

            if (numero > 0)
                positivo++;
            else
                negativo++;
        }
        System.out.println("Quantidade de números positivos: " + positivo);
        System.out.println("Quantidade de números negativos: " + negativo);
        teclado.close();

    }
}
