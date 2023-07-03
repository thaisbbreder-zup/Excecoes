package Ex01_listaDeCompras;

import java.util.List;
import java.util.Scanner;

public class ControleLista {
    public static void adicionarAlimento(Alimentos item, double quantidade, Scanner entradaDoUsuario, String nome, List<String> listaDeCompras) {
        while (quantidade < 0) {
            System.out.println("Não é possível adicionar quantidade menor que zero. ");
            System.out.print("Informe a quantidade desejada novamente: ");
            quantidade = entradaDoUsuario.nextDouble();
        }

        while (nome == "") {
            System.out.println("Não é permitido inserir nome vazio.");
            System.out.print("Informe o nome novamente: ");
            nome = entradaDoUsuario.next();
        }

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
        }
    }
}

