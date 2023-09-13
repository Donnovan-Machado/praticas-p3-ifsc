package ifsc;

import java.util.ArrayList;

public class VeiculoMain {

	public static void main(String[] args) {
		Veiculo veiculo = new Veiculo();
		Veiculo moto = new Veiculo();
		Veiculo bike = new Veiculo();
		
		veiculo.setNome("Hb20");
		veiculo.setAno(2023);
		veiculo.setNumerosRodas(4);
		veiculo.setFabricante("Honda");
		veiculo.setCor("Vermelho\n");

		moto.setNome("CG 160");
		moto.setAno(2024);
		moto.setNumerosRodas(2);
		moto.setFabricante("Honda");
		moto.setCor("Preto\n");
		
		bike.setNome("Caloi 135");
		bike.setAno(2018);
		bike.setNumerosRodas(2);
		bike.setFabricante("Caloi");
		bike.setCor("Branco e Vermelho");
		
		
		ArrayList<Veiculo> lista = new ArrayList<>(3);
		
		lista.add(veiculo);
		lista.add(moto);
		lista.add(bike);
		
		
		for (Veiculo veiculo2 : lista) {
			System.out.println(veiculo2.getNome());
			System.out.println(veiculo2.getAno());
			System.out.println(veiculo2.getNumerosRodas());
			System.out.println(veiculo2.getFabricante());
			System.out.println(veiculo2.getCor());
			
		}
		
		
	}

}
