package br.com.jessica.exercicios.aula01;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome = null;
        Integer idade = null;

        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Cadastrar nome");
            System.out.println("2 - Cadastrar idade");
            System.out.println("3 - Mostrar dados");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            if (!sc.hasNextInt()) {
                System.out.println("Opcao invalida. Digite um numero.");
                sc.next();
                continue;
            }

            int opcao = sc.nextInt();
            sc.nextLine(); // limpa o ENTER pendente

            if (opcao == 0) {
                System.out.println("Saindo...");
                break;
            }

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome: ");
                    nome = sc.nextLine();
                    System.out.println("Nome salvo!");
                    break;

                case 2:
                    System.out.print("Digite a idade: ");
                    if (sc.hasNextInt()) {
                        idade = sc.nextInt();
                        sc.nextLine(); // limpa o ENTER
                        System.out.println("Idade salva!");
                    } else {
                        System.out.println("Idade invalida. Digite um numero.");
                        sc.nextLine(); // descarta a linha errada
                    }
                    break;

                case 3:
                    System.out.println("Nome: " + (nome != null ? nome : "(nao cadastrado)"));
                    System.out.println("Idade: " + (idade != null ? idade : "(nao cadastrada)"));
                    break;

                default:
                    System.out.println("Opcao inexistente.");
            }
        }

        sc.close();
    }
}