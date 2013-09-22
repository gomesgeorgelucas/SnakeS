package base;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Tela extends JPanel {
	
	//Variáveis de Instância
	private int alturaY;
	private int larguraX;
	private int totalPontos = 768;
	private int tamanhoPonto = 25;
    
	
    private int[] pontosEmX = new int[totalPontos];
    private int[] pontoEmY = new int[totalPontos];
    


    private int frutaX;
    private int frutaY;
    
    //Imagem da comida
    private Image fruta; 
	
	public Image getFruta() {
		return fruta;
	}

	public void setFruta(Image fruta) {
		this.fruta = fruta;
	}

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
	
	public int getTotalPontos() {
		return totalPontos;
	}

	public void setTotalPontos(int totalPontos) {
		this.totalPontos = totalPontos;
	}

	public int getTamanhoPonto() {
		return tamanhoPonto;
	}

	public void setTamanhoPonto(int tamanhoPonto) {
		this.tamanhoPonto = tamanhoPonto;
	}

	public int[] getPontosEmX() {
		return pontosEmX;
	}

	public void setPontosEmX(int[] pontosEmX) {
		this.pontosEmX = pontosEmX;
	}

	public int[] getPontoEmY() {
		return pontoEmY;
	}

	public void setPontoEmY(int[] pontoEmY) {
		this.pontoEmY = pontoEmY;
	}

	public int getFrutaX() {
		return frutaX;
	}

	public void setFrutaX(int frutaX) {
		this.frutaX = frutaX;
	}

	public int getFrutaY() {
		return frutaY;
	}

	public void setFrutaY(int frutaY) {
		this.frutaY = frutaY;
	}

	/**
	 * Método para iniciar o jogo
	 */
	
	public void init() {
	
        posicaofruta();
        
	}
	
	/**
	 * Método para gerar a posição da fruta
	 */
	public void posicaofruta()
	{
    	//Cordenadas da comida
    	frutaX = (larguraX/2);
    	frutaY = (alturaY/2);
	}
	
	/**
	 * Método para abrir imagens
	 */
	public void abrirImagens()
	{
        ImageIcon frutaIcone = new ImageIcon("fruta.png");
        fruta = frutaIcone.getImage();
	}
	
	
	
	/**
	 * Método para atualizar o desenho da tela
	 */
    @Override
    public void paint (Graphics g)
    {
       
        super.paint(g);
    
        g.drawImage(fruta, frutaX, frutaY, this);
            
        Toolkit.getDefaultToolkit().sync();

        g.dispose();
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
		
		abrirImagens();
		
		init();


	}
	

}