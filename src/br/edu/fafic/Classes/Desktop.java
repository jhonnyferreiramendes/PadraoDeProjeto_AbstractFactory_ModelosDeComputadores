package br.edu.fafic.Classes;

import br.edu.fafic.Interfaces.ModeloDesktop;

public class Desktop implements ModeloDesktop{

	
	public void criarModeloDesktop() {
		// TODO Auto-generated method stub
		System.out.println("Modelo DESKTOP");
	}

	@Override
	public int capacidadeArmazenamentoTB() {
		// TODO Auto-generated method stub
		System.out.print("Armazenamento TB: ");
		return 2;
	}

	@Override
	public int capacidadeArmazenamentoGB() {
		// TODO Auto-generated method stub
		System.out.print("Memória GB: ");
		return 4;
	}

	@Override
	public String modeloProcessador() {
		// TODO Auto-generated method stub
		System.out.print("Processamento: ");
		return "Premium";
	}

}
