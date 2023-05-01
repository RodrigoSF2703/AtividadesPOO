package classes;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class NotaFiscal {
	private Pedido pedido;
    private LocalDateTime dataHora;
    private double valorPago;

    public NotaFiscal(Pedido pedido, double valorPago) {
        this.pedido = pedido;
        this.dataHora = LocalDateTime.now();
        this.valorPago = valorPago;
    }

    public String getDescricaoItens() {
        List<ItemVenda> itens = pedido.getItens();
        StringBuilder sb = new StringBuilder();
        for (ItemVenda item : itens) {
            sb.append(item.getDescricao()).append("\n");
        }
        return sb.toString();
    }

    public String gerarNota() {
        double valorTotal = pedido.getValorTotal();
        double troco = valorPago - valorTotal;
        String descricaoItens = getDescricaoItens();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String dataHoraFormatada = dataHora.format(formatter);
        return "Data e hora: " + dataHoraFormatada + "\n" +
                "Nome do cliente: " + pedido.getNomeCliente() + "\n" +
                "Itens consumidos: \n" + descricaoItens +
                "Taxa de serviço: " + pedido.getTaxaServico() + "\n" +
                "Valor total: " + valorTotal + "\n" +
                "Valor pago: " + valorPago + "\n" +
                "Troco: " + troco + "\n";
    }
}
