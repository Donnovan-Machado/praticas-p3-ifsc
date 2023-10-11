package ifsc;

import java.util.ArrayList;

public class MainProduto {

	public static void main(String[] args) {
		Desktop pc = new Desktop();
		Desktop notebook = new Desktop();
		Desktop monitor = new Desktop();
		Smartphone celular = new Smartphone();
		Smartphone celular2 = new Smartphone();
		Smartphone celular3 = new Smartphone();
		ArrayList<String> pecasPc = new ArrayList<>();
		ArrayList<String> pecasNotebook = new ArrayList<>();
		ArrayList<String> pecasMonitor = new ArrayList<>();
		
		pc.setGamer(true);
		pc.setFabricante("Pichau");
		pc.setCodBarras(152463l);	
		pecasPc.add("AMD RYZEN 3200G");
		pecasPc.add("GTX 1650");
		pecasPc.add("Memoria Ram 16gb");
		pc.setPecas(pecasPc);
	
		notebook.setGamer(true);
		notebook.setFabricante("Alienware");
		notebook.setCodBarras(658894l);	
		pecasNotebook.add("AMD RYZEN 7200X");
		pecasNotebook.add("GTX 3090");
		pecasNotebook.add("Memoria Ram 32gb");
		notebook.setPecas(pecasNotebook);
		
		monitor.setGamer(false);
		monitor.setFabricante("LG");
		monitor.setCodBarras(2546215l);	
		pecasMonitor.add("Mouse");
		pecasMonitor.add("Teclado");
		pecasMonitor.add("Mousepad");
		monitor.setPecas(pecasMonitor);
		
		ArrayList<Desktop> listaDesktop = new ArrayList<>(3);
		
		listaDesktop.add(notebook);
		listaDesktop.add(pc);
		listaDesktop.add(monitor);
	
		// Smartphone 	
		celular.setMarca("Iphone");
		celular.setFabricante("Apple");
		celular.setCodBarras(123456l);
		celular.setDimensoesTela("5,5 polegadas");

		celular2.setMarca("Xiaomi");
		celular2.setFabricante("Xiaomi");
		celular2.setCodBarras(458749l);
		celular2.setDimensoesTela("6,5 polegadas");

		celular3.setMarca("Huawei");
		celular3.setFabricante("Huawei");
		celular3.setCodBarras(769581l);
		celular3.setDimensoesTela("5,3 polegadas");
		
		ArrayList<Smartphone> listaSmartphone = new ArrayList<>(33);
		
		listaSmartphone.add(celular);
		listaSmartphone.add(celular2);
		listaSmartphone.add(celular3);
		
		for (Desktop desktop : listaDesktop) {
			System.out.println("É verdade que é gamer? "+ desktop.getGamer());
			System.out.println("Fabricante: "+ desktop.getFabricante());
			System.out.println("Codigo de Barras: "+ desktop.getCodBarras());
			System.out.println("Peças: "+ desktop.getPecas());
		}
		
		for (Smartphone smartphone : listaSmartphone) {
			System.out.println("Marca: "+ smartphone.getMarca());
			System.out.println("Fabricante: "+ smartphone.getFabricante());
			System.out.println("Codigo de Barras: "+ smartphone.getCodBarras());
			System.out.println("Dimensões da Tela: "+ smartphone.getDimensoesTela());
		}
		
		
	}

}
