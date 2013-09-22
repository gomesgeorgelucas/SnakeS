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
	private int totalPontos;
	private int tamanhoPonto;
    
	
    private int[] pontosEmX;
    private int[] pontosEmY;
    
    private int tamanhoCobra;
    private int maxTamanhoCobra;
    
    //Pos relativa fruta
    private int frutaX;
    private int frutaY;
    
    //Imagem da fruta
    private Image fruta;
    private ImageIcon frutaIcone;
    private String frutaPath;
    
    //Pos relativa cobra
    private int cabecaX;
    private int cabecaY;
    
    //Pos relativa do corpo
    private int[] corpoX;
    private int[] corpoY;
    
    //Imagem cobra
    private Image cobra;
    private ImageIcon cobraIcone;
    private String cobraPath;
	    
	public int getCabecaX() {
		return cabecaX;
	}

	public void setCabecaX(int cabecaX) {
		this.cabecaX = cabecaX;
	}

	public int getCabecaY() {
		return cabecaY;
	}

	public void setCabecaY(int cabecaY) {
		this.cabecaY = cabecaY;
	}

	public int[] getCorpoX() {
		return corpoX;
	}

	public void setCorpoX(int[] corpoX) {
		this.corpoX = corpoX;
	}

	public int[] getCorpoY() {
		return corpoY;
	}

	public void setCorpoY(int[] corpoY) {
		this.corpoY = corpoY;
	}

	public int getMaxTamanhoCobra() {
		return maxTamanhoCobra;
	}

	public void setMaxTamanhoCobra(int maxTamanhoCobra) {
		this.maxTamanhoCobra = maxTamanhoCobra;
	}

	public Image getCobra() {
		return cobra;
	}

	public void setCobra(Image cobra) {
		this.cobra = cobra;
	}

	public ImageIcon getCobraIcone() {
		return cobraIcone;
	}

	public void setCobraIcone(ImageIcon cobraIcone) {
		this.cobraIcone = cobraIcone;
	}

	public String getCobraPath() {
		return cobraPath;
	}

	public void setCobraPath(String cobraPath) {
		this.cobraPath = cobraPath;
	}

	public int[] getPontosEmY() {
		return pontosEmY;
	}

	public void setPontosEmY(int[] pontosEmY) {
		this.pontosEmY = pontosEmY;
	}

	public int getTamanhoCobra() {
		return tamanhoCobra;
	}

	public void setTamanhoCobra(int tamanhoCobra) {
		this.tamanhoCobra = tamanhoCobra;
	}

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
		
		//gera posições da fruta na tela
        this.posicaoFruta();
        
        this.posicaoCobra();
        
	}
	
	/**
	 * Método para gerar a posição da fruta no mapa.
	 */
	public void posicaoFruta() {    	
    	
    	this.setFrutaX( ( (int) (Math.random() * 13) ) *
    							this.getTamanhoPonto());
    	
    	this.setFrutaY( ( (int) (Math.random() * 13) ) *
    							this.getTamanhoPonto());
	
	}
	
	/**
	 * Método para gerar posição da cobra no mapa.
	 */
	public void posicaoCobra() {
		if (this.getTamanhoCobra() == 1) {
			this.setCabecaX(this.getLarguraX()/2);
			this.setCabecaY(this.getAlturaY()/2);
		}
		else {
			//NOOP
		}
	}
	
	/**
	 * Método para abrir imagens
	 */
	public void abrirImagens() {
        this.setFrutaIcone(new ImageIcon(this.getFrutaPath()));
        this.setFruta(this.getFrutaIcone().getImage());
        
        this.setCobraIcone(new ImageIcon(this.getCobraPath()));
        this.setCobra(this.getCobraIcone().getImage());
	}	
	
	/**
	 * Método para atualizar o desenho da tela
	 */
    @Override
    public void paint (Graphics g) {       
        super.paint(g);
        
        g.drawImage(this.getFruta(),
        			this.getFrutaX(),
        			this.getFrutaY(),
        			this);
        
        g.drawImage(this.getCobra(),
        			this.getCabecaX(),
        			this.getCabecaY(),
        			this);
        
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
		this.setPontosEmY(new int[this.getTotalPontos()]);
		//Define cor fixa do fundo
		this.setBackground(Color.WHITE);
		
		//Foca no painel do jogo ao abrir
		this.setFocusable(true);
		
		this.setFrutaPath("fruta.png");
		this.setCobraPath("snake.png");
		
		this.setTamanhoCobra(1);
		this.setMaxTamanhoCobra(1000/10);
		
		this.setCorpoX(new int[this.getLarguraX()/this.getTamanhoPonto()-1]);
		this.setCorpoY(new int[this.getAlturaY()/this.getTamanhoPonto()-1]);
		
		//Define tamanho do JPanel
		this.setSize(this.getLarguraX(), this.getAlturaY());
		
		this.abrirImagens();
		
		this.init();
	}
	

}