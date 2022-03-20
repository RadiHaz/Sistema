package model;
import java.time.LocalDate;

// import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner sc = new Scanner(System.in);
		
		Venda venda = new Venda();
		Produto produto = new Produto();
		ItemVenda itemVenda = new ItemVenda(5, produto);
		System.out.println(itemVenda);
		Cliente cliente = new Cliente();

		cliente.setNome("Guilherme");
		cliente.setCpf("012.345.678-90");
		cliente.setEndereco("Residencial Uau");
		cliente.setId(1132);
		cliente.setTelefone("+55 48 9 11116666");
		
		String name = cliente.getNome();
		String cpf = cliente.getCpf();
		String endereco = cliente.getEndereco();
		int id = cliente.getId();
		String telefone = cliente.getTelefone();
		
		System.out.println(cliente);
		System.out.println(name);
		System.out.println(cpf);
		System.out.println(endereco);
		System.out.println(id);
		System.out.println(telefone);
		
		produto.setDescricao("TV");
		produto.setPrecoUnitario(399.95);
		System.out.println(produto);
		
		String descricao = produto.getDescricao();
		double precoUnitario = produto.getPrecoUnitario();
		
		System.out.println(descricao);
		System.out.println(precoUnitario);		

		itemVenda = new ItemVenda(5, produto);
		itemVenda.setProduto(produto);
		itemVenda.setQtde(8);
		double total = itemVenda.getValorTotal();
		itemVenda.setValorTotal(total);
		
		Produto vendaProduto = itemVenda.getProduto();
		int vendaQtdeProduto = itemVenda.getQtde();
		double vendaValorTotal = itemVenda.getValorTotal();
		
		System.out.println(vendaProduto);
		System.out.println(vendaQtdeProduto);
		System.out.println(vendaValorTotal);
		
		venda = new Venda(cliente, LocalDate.now());
		produto = new Produto();
		System.out.println(venda);
		System.out.println(produto);
		
	}

}
