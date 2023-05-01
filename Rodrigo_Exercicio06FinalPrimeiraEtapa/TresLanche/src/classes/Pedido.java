package classes;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	 private String nomeCliente;
	 private List<ItemVenda> itens;
	 private double taxaServico;

	 public Pedido(String nomeCliente, double taxaServico) {
	      this.nomeCliente = nomeCliente;
	      this.taxaServico = taxaServico;
	      itens = new ArrayList<>();
	    }

	 public String getNomeCliente() {
	      return nomeCliente;
	 }

	 public List<ItemVenda> getItens() {
	      return itens;
	 }

	 public double getTaxaServico() {
	     return taxaServico;
	    }

	 public void addItem(ItemVenda item) {
		 itens.add(item);
	    }

	    public double getValorTotal() {
	        double valorTotal = 0.0;
	        for (ItemVenda item : itens) {
	            valorTotal += item.getPrecoVenda();
	        }
	        valorTotal += taxaServico;
	        return valorTotal;
	    }
}
