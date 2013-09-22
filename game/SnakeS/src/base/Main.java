package base;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Main extends JFrame{
		
	public Main() {
		
		//Instancia JPanel
		Tela telaJogo = new Tela();
		
		//Associa um JPanel a um JFrame
		this.add(telaJogo);
		
		//Define tamanho do JFrame
		//Deve ser maior que o JPanel
		this.setSize(telaJogo.getLarguraX()+20,
				telaJogo.getAlturaY()+40);
		
		//Define redimensionamento
		this.setResizable(false);
		
		// Define a saida da aplicação
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Define título do JFrame
		this.setTitle("SnakeS");
		
	}
	
	
	
	public static void main(String args[]) {
		new Main().setVisible(true);
		
		
	}
}