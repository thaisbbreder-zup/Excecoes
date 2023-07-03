package Ex01_listaDeCompras;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entradaDoUsuario = new Scanner(System.in);
        List<String> listaDeCompras = new ArrayList<>();

        double qntVerdura = 0;
        int qntLegume = 0;
        double qntGraos = 0;
        int qntOutros = 0;

        System.out.println("\n--------------- LISTA DE COMPRAS ---------------");
        int opcao;
        do {
            System.out.println("\n--------------- MENU ---------------");

            System.out.println("Defina o alimento que você deseja incluir: " + "\n 1 - VERDURA" + "\n 2 - LEGUME" + "\n 3 - GRÃOS" + "\n 4 - OUTROS" + "\n 5 - SAIR");
            opcao = entradaDoUsuario.nextInt();
            System.out.println("-------------------------------------");

            if(opcao == 5){
                System.out.println("\n----- Lista de Compras -----");
                for (String itemLista : listaDeCompras) {
                    System.out.println(itemLista);
                }
                System.out.println("\nQuantidade de alimentos selecionados:");
                System.out.println("Verdura: " + qntVerdura);
                System.out.println("Legume: " + qntLegume);
                System.out.println("Grãos: " + qntGraos);
                System.out.println("Outros: " + qntOutros);
            }

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
                default:
                    System.out.println("Tipo de alimento inválido. Tente novamente.");
            }

            System.out.print("Informe a quantidade desejada: ");
            double quantidade = entradaDoUsuario.nextDouble();
            try {
                ValidadorQuantidade.ValidarQuantidade(quantidade, entradaDoUsuario);
            } catch (UnsupportedOperationException excecao) {
                System.out.println("Erro: " + excecao.getMessage());
                continue; // Volta ao início do loop
            }

            System.out.print("Informe o nome do alimento: ");
            String nome = entradaDoUsuario.next();

            try {
                ValidadorNome.ValidarNome(entradaDoUsuario, nome);
            } catch (UnsupportedOperationException excecao) {
                System.out.println("Erro: " + excecao.getMessage());
                continue;
            }

            AdicionaItem.adicionarAlimento(item, quantidade, nome, listaDeCompras);

            if (item instanceof Verdura) {
                qntVerdura += quantidade;
            } else if (item instanceof Legumes) {
                qntLegume += (int) quantidade;
            } else if (item instanceof Graos) {
                qntGraos += quantidade;
            } else if (item instanceof Outros) {
                qntOutros += (int) quantidade;
            }

        } while  (opcao != 5);
    }
}