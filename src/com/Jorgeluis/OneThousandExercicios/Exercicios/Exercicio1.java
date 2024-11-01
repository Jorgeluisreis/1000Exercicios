package com.Jorgeluis.OneThousandExercicios.Exercicios;

/*
 * 
 *  Faça um algoritmo utilizando a estrutura "do while" que imprima na tela os números de 1 à 10.
 */

public class Exercicio1 {
    public static void impressao() {
        System.out.println("====================");
        System.out.println("=    Exercicio 1   =");
        System.out.println("====================");
        int contador = 0;
        do {
            System.out.println("Contador: " + contador);
            contador++;
        } while (contador <= 10);
    }

}
