package com.Jorgeluis.OneThousandExercicios.Exercicios;

/*
 * Faça um algoritmo utilizando a estrutura "while" que fique perguntando para o usuário se ele deseja continuar 
 *   o laço respondendo s ou n. Laço deve continuar quando o usuário responde s.
 */

import java.util.Scanner;

public class Exercicio4 {
    public static void Pergunta() {
        Scanner teclado = new Scanner(System.in);
        boolean ativoPergunta = false;
        System.out.println("====================");
        System.out.println("=    Exercicio 4   =");
        System.out.println("====================");

        while (!ativoPergunta) {
            System.out.println("Deseja continar ?");
            System.out.println("S) Sim - N) Não");
            System.out.printf("Opção: ");
            char respostPergunta = teclado.nextLine().charAt(0);

            switch (respostPergunta) {
                case 'S':
                case 's':
                    break;

                case 'N':
                case 'n':
                    teclado.nextLine();
                    ativoPergunta = true;
                    break;
                default:
                    System.out.println("Entrada inválida, tente novanmente apertando qualquer botão...");
                    teclado.nextLine();
                    break;
            }
        }
        teclado.close();

    }

}
