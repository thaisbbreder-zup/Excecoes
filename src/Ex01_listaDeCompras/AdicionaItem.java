package Ex01_listaDeCompras;

import java.util.List;
import java.util.Scanner;

public class AdicionaItem {
    public static void adicionarAlimento(Alimentos item, double quantidade, Scanner entradaDoUsuario, String nome, List<String> listaDeCompras) {

        if (item instanceof Verdura) {

            if (quantidade % 1 == 0) {
                throw new NumberFormatException("Para verdura, a quantidade deve ser informada com ponto (ex: 1,5). Tente novamente.");
            }
            listaDeCompras.add(nome + " - " + quantidade + " grama(s)");
        } else if (item instanceof Graos) {
            if (quantidade % 1 == 0) {
                throw new NumberFormatException("Para grãos, a quantidade deve ser informada com ponto (ex: 1,5). Tente novamente.");
            }
            listaDeCompras.add(nome + " - " + quantidade + " grama(s)");
        } else if (item instanceof Legumes) {
            if (quantidade % 1 != 0) {
                throw new NumberFormatException("Para legumes, a quantidade deve ser informada em unidades inteiras (ex: 3).");
            }
            listaDeCompras.add(nome + " - " + quantidade + " unidade(s)");
        } else if (item instanceof Outros) {
            if (quantidade % 1 != 0) {
                throw new NumberFormatException("Para outros, a quantidade deve ser informada em unidades inteiras (ex: 3).");
            }
            listaDeCompras.add(nome + " - " + quantidade + " unidade(s)");
        }else{
            throw new IllegalArgumentException("Tipo de alimento inválido.");
        }
    }

    public static void adicionarAlimento(Alimentos item, double quantidade, String nome, List<String> listaDeCompras) {
        if (item instanceof Verdura) {
            double totalVerduras = quantidade;
            System.out.println("Total de verduras: " + totalVerduras + " gramas");
        } else if (item instanceof Outros) {
            double totalOutros = quantidade;
            System.out.println("Total de outros itens: " + totalOutros + " unidades");
        }
    }
}

