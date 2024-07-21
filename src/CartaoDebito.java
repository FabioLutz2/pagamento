public class CartaoDebito implements FormaPagamento {
    @Override
    public void realizarPagamento(double valor) {
        System.out.printf("Aguardando confirmação de pagamento da maquininha de R$ %.2f...", valor);
    }
}
