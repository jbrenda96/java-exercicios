package br.com.jessica.exercicios.aula01;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();

        // Dados iniciais pra facilitar o teste
        nomes.add("Jessica");
        nomes.add("Ana");
        nomes.add("Paulo");

        System.out.print("Digite um nome para buscar: ");
        String busca = sc.nextLine();

        boolean achou = false;

        for (String n : nomes) {
            if (n.equalsIgnoreCase(busca)) {
                achou = true;
                break;
            }
        }

        if (achou) {
            System.out.println("Encontrado!");
        } else {
            System.out.println("Nao encontrado.");
        }

        sc.close();
    }
}
