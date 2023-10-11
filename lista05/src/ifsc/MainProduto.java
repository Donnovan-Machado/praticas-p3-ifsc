package ifsc;

import java.util.ArrayList;

public class MainProduto {

	public static void main(String[] args) {
		Produto calcado = new Produto();
		Produto roupa = new Produto();
		Produto eletronico = new Produto();

		calcado.setNome("Nike Air Force");
		calcado.setFornecedor("Nike Brasil");
		calcado.setCodBarras(34553354l);
		calcado.setPreco(500.30);
		
		roupa.setNome("Nike Casaco");
		roupa.setFornecedor("Nike Brasil");
		roupa.setCodBarras(56456456l);
		roupa.setPreco(79.59);
		
		eletronico.setNome("Mouse Razer");
		eletronico.setFornecedor("Razer");
		eletronico.setCodBarras(4595654l);
		eletronico.setPreco(380.30);
		
		ArrayList<Produto> lista = new ArrayList<>(3);
		
		lista.add(calcado);
		lista.add(roupa);
		lista.add(eletronico);
		
		for (Produto produto : lista) {
			System.out.println("Nome: " + produto.getNome());
			System.out.println("Fornecedor: " + produto.getFornecedor());
			System.out.println("Codigo de Barras: " + produto.getCodBarras());
			System.out.println("Preço: " + produto.getPreco());
			System.out.println("");
		}
		
	}

}
