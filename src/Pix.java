public class Pix implements FormaPagamento {
    @Override
    public void realizarPagamento(double valor) {
        System.out.printf("Gerando QR Code do Pix de R$ %.2f...", valor);
    }
}
