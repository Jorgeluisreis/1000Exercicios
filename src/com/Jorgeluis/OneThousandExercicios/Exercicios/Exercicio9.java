package com.Jorgeluis.OneThousandExercicios.Exercicios;

/*
 * Faça um algoritmo que leia uma quantidade desconhecida de números e conte quantos deles estão nos 
 *         seguintes intervalos: de 0 a 25; de 26 a 50; de 51 a 75; de 76 a 100. A entrada de dados deve terminar quando for 
 *                                 lido um número negativo.
 */
import java.util.Scanner;

public class Exercicio9 {
    public static void Intervalos() {

        Scanner teclado = new Scanner(System.in);
        int contador0a25 = 0;
        int contador26a50 = 0;
        int contador51a75 = 0;
        int contador76a100 = 0;

        System.out.println("====================");
        System.out.println("=    Exercicio 9   =");
        System.out.println("====================");

        while (true) {
            System.out.printf("Digite um número inteiro: ");
            int numero = teclado.nextInt();
            if (numero < 0)
                break;

            if (numero >= 0 && numero <= 25) {
                contador0a25++;
            } else if (numero >= 26 && numero <= 50) {
                contador26a50++;
            } else if (numero >= 51 && numero <= 75) {
                contador51a75++;
            } else if (numero >= 76 && numero <= 100) {
                contador76a100++;
            }

        }
        System.out.println("Quantidade de números no intervalo de 0 a 25: " + contador0a25);
        System.out.println("Quantidade de números no intervalo de 26 a 50: " + contador26a50);
        System.out.println("Quantidade de números no intervalo de 51 a 75: " + contador51a75);
        System.out.println("Quantidade de números no intervalo de 76 a 100: " + contador76a100);
        teclado.close();
    }

}
