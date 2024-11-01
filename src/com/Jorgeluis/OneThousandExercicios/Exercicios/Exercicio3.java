package com.Jorgeluis.OneThousandExercicios.Exercicios;

/*
 *  Faça um algoritmo utilizando a estrutura "for" que imprima na tela os números de 1 à 10.
 */

public class Exercicio3 {
    public static void Impressao() {
        int contador = 0;
        System.out.println("====================");
        System.out.println("=    Exercicio 3   =");
        System.out.println("====================");

        for (int i = 0; i <= 10; i++) {
            System.out.println("Contador: " + contador);
            contador++;
        }
    }
}
