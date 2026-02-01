package br.com.jessica.exercicios.aula01;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        Integer idade = null;

        while (idade == null) {
            System.out.print("Digite sua idade (numero): ");
            if (sc.hasNextInt()) {
                idade = sc.nextInt();
            } else {
                System.out.println("Entrada invalida. Digite apenas numeros.");
                sc.next(); // descarta o que a pessoa digitou errado
            }
        }

        if (idade >= 18) {
            System.out.println(nome + ", voce e maior de idade.");
        } else {
            System.out.println(nome + ", voce e menor de idade.");
        }

        sc.close();
    }
}
