package com.Jorgeluis.OneThousandExercicios.Exercicios;

/*
 *  Faça um algoritmo que leia 6 números inteiros. Após a leitura deve ser mostrado na tela qual é o maior e o 
 *                             menor número digitado.
 */

import java.util.Scanner;

public class Exercicio8 {
    public static void MaiorOuMenor() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("====================");
        System.out.println("=    Exercicio 8   =");
        System.out.println("====================");

        System.out.println("Digite o 1 º número: ");
        int numero = teclado.nextInt();

        int maior = numero;
        int menor = numero;

        for (int i = 2; i <= 6; i++) {
            System.out.println("Digite o " + i + "º número: ");
            numero = teclado.nextInt();
            teclado.nextLine();

            if (numero > maior) {
                maior = numero;
            } else if (numero < menor) {
                menor = numero;
            }
            System.out.println("Maior número da rodada: " + maior);
            System.out.println("Menor número da rodada: " + menor);

        }
        System.out.println("Maior número digitado: " + maior);
        System.out.println("Menor número digitado: " + menor);
        teclado.close();
    }

}
