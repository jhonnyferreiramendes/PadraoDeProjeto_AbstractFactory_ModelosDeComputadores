package br.edu.fafic.Classes;

import br.edu.fafic.Interfaces.ModeloNotbook;

public class Notbook implements ModeloNotbook {

	@Override
	public void criarModeloNotbook() {
		// TODO Auto-generated method stub
		System.out.println("Modelo NOTBOOK");
	}

	@Override
	public int capacidadeArmazenamentoGB() {
		// TODO Auto-generated method stub
		System.out.print("Memória GB: ");
		return 8;
	}

	public int capacidadeArmazenamentoTB() {
		// TODO Auto-generated method stub
		System.out.print("Armazenamento: ");
		return 1;
	}

	@Override
	public String modeloProcessador() {
		// TODO Auto-generated method stub
		System.out.print("Processamento: ");
		return "Intel";
	}

}
