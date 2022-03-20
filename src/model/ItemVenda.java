package model;

public class ItemVenda {
	
	private int qtde;
	private double valorTotal;
	private Produto produto;
	
	public ItemVenda(int qtde, Produto produto) {
		this.qtde = qtde;
		this.produto = produto;
		if (produto != null && this.qtde > 0) {
			calcularValorTotal();
		}
	}
	public ItemVenda() {
		
	}
	
	public int getQtde() {
		return qtde;
	}
	public void setQtde(int qtde) {
		this.qtde = qtde;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public void calcularValorTotal() {
		this.valorTotal = qtde * produto.getPrecoUnitario();
	}
}
