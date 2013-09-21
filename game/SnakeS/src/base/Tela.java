package base;

import java.awt.Color;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Tela extends JPanel {
	
	//Variáveis de Instância
	private int alturaY;
	private int larguraX;
	
	public int getAlturaY() {
		return alturaY;
	}

	public void setAlturaY(int alturaY) {
		this.alturaY = alturaY;
	}

	public int getLarguraX() {
		return larguraX;
	}

	public void setLarguraX(int larguraX) {
		this.larguraX = larguraX;
	}

	public void init() {
		
	}
	
	
	/**
	 * Construtor da Tela
	 */
	public Tela() {
		//Define área útil da tela em pixels
		this.setLarguraX(800);
		this.setAlturaY(600);
				
		//Define cor fixa do fundo
		setBackground(Color.WHITE);
		
		//Foca no painel do jogo ao abrir
		setFocusable(true);
		
		//Define tamanho do JPanel
		setSize(this.getLarguraX(), this.getAlturaY());
		

				
	}
}