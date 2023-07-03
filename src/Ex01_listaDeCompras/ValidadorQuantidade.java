package Ex01_listaDeCompras;

import java.util.Scanner;

public class ValidadorQuantidade {
    public static void ValidarQuantidade(double quantidade, Scanner entradaDoUsuario) {
        if (quantidade <= 0) {
            throw new UnsupportedOperationException("Não é permitido inserir valor vazio ou negativo.");
        }
        }
    }
