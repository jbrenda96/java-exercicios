package br.com.jessica.exercicios.aula01;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();

        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Adicionar nome");
            System.out.println("2 - Listar nomes");
            System.out.println("3 - Remover nome (pelo indice)");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            if (!sc.hasNextInt()) {
                System.out.println("Opcao invalida. Digite um numero.");
                sc.next();
                continue;
            }

            int opcao = sc.nextInt();
            sc.nextLine(); // limpa ENTER

            if (opcao == 0) {
                System.out.println("Saindo...");
                break;
            }

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome: ");
                    String nome = sc.nextLine();
                    if (nome.isBlank()) {
                        System.out.println("Nome vazio. Nao adicionado.");
                    } else {
                        nomes.add(nome);
                        System.out.println("Adicionado!");
                    }
                    break;

                case 2:
                    if (nomes.isEmpty()) {
                        System.out.println("Lista vazia.");
                    } else {
                        System.out.println("Nomes cadastrados:");
                        for (int i = 0; i < nomes.size(); i++) {
                            System.out.println(i + " - " + nomes.get(i));
                        }
                    }
                    break;

                case 3:
                    if (nomes.isEmpty()) {
                        System.out.println("Nao tem nada para remover.");
                        break;
                    }

                    System.out.print("Digite o indice para remover: ");
                    if (!sc.hasNextInt()) {
                        System.out.println("Indice invalido.");
                        sc.nextLine();
                        break;
                    }

                    int idx = sc.nextInt();
                    sc.nextLine();

                    if (idx < 0 || idx >= nomes.size()) {
                        System.out.println("Indice fora do intervalo.");
                    } else {
                        String removido = nomes.remove(idx);
                        System.out.println("Removido: " + removido);
                    }
                    break;

                default:
                    System.out.println("Opcao inexistente.");
            }
        }

        sc.close();
    }
}
