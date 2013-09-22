package base;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Time;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Tela extends JPanel {
	
	//Variáveis de Instância
	private int alturaY;
	private int larguraX;
	private int totalPontos;
	private int tamanhoPonto;
    
	
    private int[] pontosEmX;
    private int[] pontosEmY;
    
    private int frutaX;
    private int frutaY;
    
    //Imagem da comida
    private Image fruta;
    private ImageIcon frutaIcone;
    private String frutaPath;
	
	public ImageIcon getFrutaIcone() {
		return frutaIcone;
	}

	public void setFrutaIcone(ImageIcon frutaIcone) {
		this.frutaIcone = frutaIcone;
	}

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
		return pontosEmY;
	}

	public void setPontoEmY(int[] pontoEmY) {
		this.pontosEmY = pontoEmY;
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
	
	public String getFrutaPath() {
		return frutaPath;
	}

	public void setFrutaPath(String frutaPath) {
		this.frutaPath = frutaPath;
	}

	/**
	 * Método para iniciar o jogo
	 */	
	public void init() {
	
        this.posicaofruta();
        
	}
	
	/**
	 * Método para gerar a posição da fruta
	 */
	public void posicaofruta() {    	
    	
    	this.setFrutaX( ( (int) (Math.random() * 13) ) *
    							this.getTamanhoPonto());
    	
    	this.setFrutaY( ( (int) (Math.random() * 13) ) *
    							this.getTamanhoPonto());
	}
	
	/**
	 * Método para abrir imagens
	 */
	public void abrirImagens() {
        this.setFrutaIcone(new ImageIcon(this.getFrutaPath()));
        this.setFruta(frutaIcone.getImage());
	}	
	
	/**
	 * Método para atualizar o desenho da tela
	 */
    @Override
    public void paint (Graphics g) {       
        super.paint(g);
    
        g.drawImage(this.getFruta(), this.getFrutaX(), this.getFrutaY(), this);
            
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
		
		this.setTamanhoPonto(25);
		this.setTotalPontos((this.getLarguraX()/this.getTamanhoPonto()) *
								(this.getAlturaY()/this.getTamanhoPonto()));
		
		this.setPontosEmX(new int[this.getTotalPontos()]);
		this.setPontoEmY(new int[this.getTotalPontos()]);
		//Define cor fixa do fundo
		this.setBackground(Color.WHITE);
		
		//Foca no painel do jogo ao abrir
		this.setFocusable(true);
		
		this.setFrutaPath("fruta.png");
		
		//Define tamanho do JPanel
		this.setSize(this.getLarguraX(), this.getAlturaY());
		
		this.abrirImagens();
		
		this.init();
	}
	

}