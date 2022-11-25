import br.edu.fafic.Classes.PC;

public class Main {

	public static void main(String[] args) {
		
		PC desktop = new PC();
		desktop.criarModeloDesktop().criarModeloDesktop();
		System.out.println(desktop.criarModeloDesktop().capacidadeArmazenamentoGB());
		System.out.println(desktop.criarModeloDesktop().capacidadeArmazenamentoTB());
		System.out.println(desktop.criarModeloDesktop().modeloProcessador());
		
		System.out.println();
		
		PC notbook = new PC();
		notbook.criarModloNotbook().criarModeloNotbook();
		System.out.println(notbook.criarModloNotbook().capacidadeArmazenamentoTB());
		System.out.println(notbook.criarModloNotbook().capacidadeArmazenamentoGB());
		System.out.println(notbook.criarModloNotbook().modeloProcessador());
		
		

	}

}
