public class DinheiroFisico implements FormaPagamento {
    @Override
    public void realizarPagamento(double valor) {
        System.out.printf("Aguardando confirmação do pagamento físico de R$ %.2f...", valor);
    }
}
