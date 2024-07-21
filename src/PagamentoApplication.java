import java.util.Scanner;

public class PagamentoApplication {
    public static void main(String[] args) {
        ProcessamentoPagamento processamentoPagamento = new ProcessamentoPagamento();
        Scanner scanner = new Scanner(System.in);
        double valor;
        int metodo;

        do {
            System.out.println("Defina o valor:");
            valor = scanner.nextDouble();
            scanner.nextLine();

            if (valor <= 0) {
                valor = 0;
                System.out.println("Valor inválido!");
            }
        } while (valor == 0);

        do {
            System.out.println("1 - Dinheiro Físico\n2 - Pix\n3 - Cartão de Débito\n4 - Cartão de Crédito");
            System.out.println("Defina o método de pagamento:");
            metodo = scanner.nextInt();
            scanner.nextLine();

            if (metodo > 4 || metodo < 1) {
                metodo = 0;
                System.out.println("Método inválido!");
            }
        } while (metodo == 0);

        FormaPagamento metodoObjeto = null;

        switch (metodo) {
            case 1 -> metodoObjeto = new DinheiroFisico();
            case 2 -> metodoObjeto = new Pix();
            case 3 -> metodoObjeto = new CartaoDebito();
            case 4 -> metodoObjeto = new CartaoCredito();
        }

        processamentoPagamento.setFormaPagamento(metodoObjeto);
        processamentoPagamento.pagar(valor);
    }
}
