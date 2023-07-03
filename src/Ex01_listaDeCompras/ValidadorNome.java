package Ex01_listaDeCompras;

import java.util.List;
import java.util.Scanner;

public class ValidadorNome {
    public static void ValidarNome(Scanner entradaDoUsuario, String nome) {

        while (nome == "") {
            throw new UnsupportedOperationException("Não é permitido inserir nome vazio.");
        }

    }

    public static void validarNome(String nome) {
    }
}
