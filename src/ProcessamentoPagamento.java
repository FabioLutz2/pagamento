public class ProcessamentoPagamento {
    private FormaPagamento formaPagamento;

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public void pagar(double valor) {
        formaPagamento.realizarPagamento(valor);
    }
}
