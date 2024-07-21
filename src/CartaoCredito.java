import java.util.Scanner;

import static java.lang.Math.pow;

public class CartaoCredito implements FormaPagamento {
    @Override
    public void realizarPagamento(double valor) {
        Scanner scanner = new Scanner(System.in);
        double juros = 0.02;
        int parcelas = 12;
        double total;
        int parcelaEscolhida;
        double valorFinal;

        for (int i = 1; i <= parcelas; i++) {
            total = valor * pow((1 + juros), i);
            System.out.printf(
                    "%d x %.2f = %.2f\n",
                    i, (total / i), total
            );
        }

        do {
            System.out.println("Selecione o número de parcelas:");
            parcelaEscolhida = scanner.nextInt();
            scanner.nextLine();

            if (parcelaEscolhida > parcelas || parcelaEscolhida < 1) {
                parcelaEscolhida = 0;
                System.out.println("Número de parcelas inválido!");
            }

        } while (parcelaEscolhida == 0);


        valorFinal = (valor * pow((1 + juros), parcelaEscolhida)) / parcelaEscolhida;

        System.out.printf("Aguardando confirmação de pagamento da maquininha de R$ %.2f em %d parcelas...", valorFinal, parcelaEscolhida);
    }
}
