package com.Jorgeluis.OneThousandExercicios.Exercicios;

/*
 * Faça um algoritmo que lê vários valores inteiros. Após a leitura de um valor o usuário responde se deseja 
 *      digitar um novo valor. Após a leitura dos valores apresente a média dos valores pares e a média dos valores 
 *                    ímpares
 * 
 */

import java.util.Scanner;

public class Exercicio7 {
    public static void ImparPar() {
        Scanner teclado = new Scanner(System.in);

        int contPares = 0;
        int contImpares = 0;
        int somaPares = 0;
        int somaImpares = 0;
        String entrada;

        System.out.println("====================");
        System.out.println("=    Exercicio 7   =");
        System.out.println("====================");

        do {
            System.out.printf("Digite um número inteiro: ");
            int numero = teclado.nextInt();

            if (numero % 2 == 0) {
                somaPares += numero;
                contPares++;
            } else {
                somaImpares += numero;
                contImpares++;
            }
            System.out.println("Você deseja digitar mais algum número inteiro ?");
            System.out.println("S) Sim");
            System.out.printf("Opção: ");
            teclado.nextLine();
            entrada = teclado.nextLine();
        } while (entrada.equalsIgnoreCase("S"));

        double mediaPares = contPares > 0 ? somaPares / contPares : 0;
        double mediaImpares = contImpares > 0 ? somaImpares / contImpares : 0;

        System.out.println("Media dos valores Pares: " + mediaPares);
        System.out.println("Media dos valores Ímpares: " + mediaImpares);

        teclado.close();
    }
}