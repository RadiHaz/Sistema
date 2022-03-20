package model;

import java.time.LocalDate;
import java.util.List;


public class Venda {
	
	private LocalDate dataEmissao;
	private double valorTotal;
	private Cliente cliente;
	private List<ItemVenda> itensVenda;
	
	public Venda(Cliente cliente, LocalDate dataEmissao) {
		this.cliente = cliente;
		this.dataEmissao = dataEmissao;
	}
	
	public Venda() {	
		
	}
	public LocalDate getDataEmissao() {
		return dataEmissao;
	}
	public void setDataEmissao(LocalDate dataEmissao) {
		this.dataEmissao = dataEmissao;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public List<ItemVenda> getItensVenda() {
		return itensVenda;
	}
	public void setItensVenda(List<ItemVenda> itensVenda){
		this.itensVenda = itensVenda;
	}
}