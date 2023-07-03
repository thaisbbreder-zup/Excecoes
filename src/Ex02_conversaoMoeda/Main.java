package Ex02_conversaoMoeda;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entradaDoUsuario = new Scanner(System.in);
        int opcao;

        System.out.println("\nBoas vindas ao conversor de moedas!");

        do {
            System.out.println("Selecione a moeda para converter:" + "\n1 - Dólar americano" + "\n2 - Dólar canadense" + "\n3 - Euro" + "\n4 - Libra Esterlina" + "\n5 - Sair");
            opcao = entradaDoUsuario.nextInt();

            Moeda moeda = null;

            switch (opcao) {
                case 1:
                    moeda = new MoedaDolarAmericano();
                    break;
                case 2:
                    moeda = new MoedaDolarCanadense();
                    break;
                case 3:
                    moeda = new MoedaEuro();
                    break;
                case 4:
                    moeda = new MoedaLibraEsterlina();
                    break;
                default:
                    System.out.println("Opção inválida");
                    System.exit(0);
            }

            System.out.println("\nDesculpe, só podemos converter para Real (R$).");

            BigDecimal valor = null;

            while (true) {
                System.out.print("Digite o valor a ser convertido: ");
                String valorASerConvertido = entradaDoUsuario.next();

                try {
                    valor = new BigDecimal(valorASerConvertido);
                    if (valor.compareTo(BigDecimal.ZERO) <= 0) {//compara um objeto BigDecimal com zero e determinar sua relação em relação a zero (maior retorna valor maior que 0 // igual retorna 0 // menor retorna menor que 0)
                        System.out.println("Valor inválido, por favor, tente novamente");
                    } else {
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Para a moeda, o valor monetário deve ser um número decimal");
                }
            }

            //data atual
            Date dataConversao = moeda.getDataConversao();

            BigDecimal valorConvertido = moeda.converterReal(valor);

            System.out.println("------------------------------------------------------------------------------------");
            System.out.println("A " + moeda.getNome() + " na cotação de hoje " + dataConversao +
                    " está em " + moeda.getTaxaConversao() +
                    ", o valor que pediu para converter de " + valor + " em reais é R$ " + valorConvertido);
        } while (opcao != 5);
    }
}


