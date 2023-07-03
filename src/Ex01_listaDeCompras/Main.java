package Ex01_listaDeCompras;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entradaDoUsuario = new Scanner(System.in);
        List<String> listaDeCompras = new ArrayList<>();

        System.out.println("\n--------------- LISTA DE COMPRAS ---------------");
        int opcao;
        do {
            System.out.println("\n--------------- MENU ---------------");

            System.out.println("Defina o alimento que você deseja incluir: " + "\n 1 - VERDURA" + "\n 2 - LEGUME" + "\n 3 - GRÃOS" + "\n 4 - OUTROS" + "\n 5 - SAIR");
            opcao = entradaDoUsuario.nextInt();
            System.out.println("-------------------------------------");

            Alimentos item = null;

            switch (opcao) {
                case 1:
                    item = new Verdura();
                    break;
                case 2:
                    item = new Legumes();
                    break;
                case 3:
                    item = new Graos();
                    break;
                case 4:
                    item = new Outros();
                    break;
                case 5:
                    System.out.println("\n----- Lista de Compras -----");
                    for (String itemLista : listaDeCompras) {
                        System.out.println(itemLista);
                    }

                    break;
                default:
                    throw new IllegalArgumentException("Tipo de alimento inválido. Tente novamente.");
            }
            System.out.print("Informe a quantidade desejada: ");
            double quantidade = entradaDoUsuario.nextDouble();

            System.out.print("Informe o nome do alimento: ");
            String nome = entradaDoUsuario.next();

            try {
                ControleLista.adicionarAlimento(item, quantidade, entradaDoUsuario, nome, listaDeCompras);
            } catch (NumberFormatException excecao) {
                System.out.println("Erro: " + excecao.getMessage());
            } catch (UnsupportedOperationException excecao) {
                System.out.print("Erro: " + excecao.getMessage());
            }
        } while (opcao != 5);


    }
}