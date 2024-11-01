package com.Jorgeluis.OneThousandExercicios.Exercicios;

/*
 * 
 * A prefeitura de uma cidade precisa fazer uma pesquisa entre seus habitantes, coletando dados sobre o salário 
 *                         e número de filhos.  
 *     O algoritmo deve ler os dados de vários habitantes. Após a leitura dos dados de um habitante o usuário responde 
 *                 se ele deseja inserir os dados s ou n de um novo habitante. A prefeitura deseja saber: 
 *a) média do salário da população;
 *b) média do número de filhos;
 *c) maior salário;
 *d) percentual de pessoas com salário até R$ 1000,00.
 * 
 * 
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio10 {
    public static void Pesquisa() {
        Scanner teclado = new Scanner(System.in);

        int totalHab = 0;
        int totalFilhos = 0;
        double totalSalario = 0;
        double maiorSalario = 0;
        int pessoaSalarioAteMil = 0;

        char resposta;

        System.out.println("====================");
        System.out.println("=    Exercicio 10   =");
        System.out.println("====================");

        do {
            System.out.printf("Digite o salário da Pessoa: ");
            double salario = teclado.nextDouble();

            System.out.printf("Digite a quantidade de filhos da Pessoa: ");
            int filhos = teclado.nextInt();

            totalHab++;
            totalFilhos = +filhos;
            totalSalario += salario;

            if (salario > maiorSalario)
                maiorSalario = salario;
            if (salario <= 1000)
                pessoaSalarioAteMil++;

            System.out.println("Deseja inserir mais dados de habitantes?");
            System.out.println("s) Sim n) Não");
            System.out.printf("Opção: ");
            teclado.nextLine();
            resposta = teclado.nextLine().charAt(0);

            if (resposta == 'N' || resposta == 'n') {
                break;
            }
        } while (resposta == 's' || resposta == 'S');

        double mediaSalario = totalSalario / totalHab;
        double mediaFilhos = (double) totalFilhos / totalHab;
        double percentualMil = (double) pessoaSalarioAteMil / totalHab;

        System.out.println("A média salarial entre os " + totalHab + " Habitantes é de R$" + mediaSalario);
        System.out.println(
                "A média do numero de filhos entre os " + totalHab + " Habitantes é de " + mediaFilhos + " filhos.");
        System.out.println("O maior salário entre os  " + totalHab + " Habitantes é de R$" + maiorSalario);
        System.out
                .println("O percentual dos " + totalHab + " Habitantes que recebem até R$1.000 é de " + percentualMil);

        teclado.close();
    }

}
