package com.Jorgeluis.OneThousandExercicios.Exercicios;

/*
 * Faça um algoritmo utilizando a estrutura "do while" que fique perguntando para o usuário se ele deseja 
 *     continuar o laço respondendo s ou n. Laço deve continuar quando o usuário responde s
 */

import java.util.Scanner;

public class Exercicio5 {
    public static void Pergunta() {
        boolean ativoPergunta = false;
        Scanner teclado = new Scanner(System.in);
        System.out.println("====================");
        System.out.println("=    Exercicio 5   =");
        System.out.println("====================");

        do {
            System.out.println("Deseja continar ?");
            System.out.println("S) Sim - N) Não");
            System.out.printf("Opção: ");
            char respostPergunta = Character.toUpperCase(teclado.nextLine().charAt(0));

            switch (respostPergunta) {
                case 'S':
                    teclado.nextLine();
                    break;
                case 'N':
                    ativoPergunta = true;
                    break;

                default:
                    System.out.println("Entrada inválida, tente novanmente apertando qualquer botão...");
                    teclado.nextLine();
                    break;
            }

        } while (!ativoPergunta);

        teclado.close();
    }
}
