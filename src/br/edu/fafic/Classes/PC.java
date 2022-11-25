package br.edu.fafic.Classes;

import br.edu.fafic.Interfaces.Modelos;

public class PC implements Modelos {

	@Override
	public Desktop criarModeloDesktop() {
		// TODO Auto-generated method stub
		return new Desktop();
	}

	@Override
	public Notbook criarModloNotbook() {
		// TODO Auto-generated method stub
		return new Notbook();
	}

	
}
