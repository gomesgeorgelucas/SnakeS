package base;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

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
	
    // Definição dos movimentos
    private boolean esquerda;
    private boolean direita;
    private boolean cima;
    private boolean baixo;
    
    //Definição de start de jogo
    private boolean play;
    
    // Variavel de pontuação
    private int pontuacao;
    
    // Variavel do tamanho do corpo
    private int bodysize;
    
    
	public int getBodysize() {
		return bodysize;
	}

	public void setBodysize(int bodysize) {
		this.bodysize = bodysize;
	}

	public int getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}

	public boolean isPlay() {
		return play;
	}

	public void setPlay(boolean play) {
		this.play = play;
	}

	public boolean isEsquerda() {
		return esquerda;
	}

	public void setEsquerda(boolean esquerda) {
		this.esquerda = esquerda;
	}

	public boolean isDireita() {
		return direita;
	}

	public void setDireita(boolean direita) {
		this.direita = direita;
	}

	public boolean isCima() {
		return cima;
	}

	public void setCima(boolean cima) {
		this.cima = cima;
	}

	public boolean isBaixo() {
		return baixo;
	}

	public void setBaixo(boolean baixo) {
		this.baixo = baixo;
	}

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
		//Inicia o jogo
		this.setPlay(true);
		
		//Inicia o tamanho do corpo como 0;
		this.setBodysize(0);
		
		//Inicia a pontuação como 0;
		this.setPontuacao(0);
	
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
        
        
        // Analisa se o jogo esta em andamento, se estiver desenha na tela,
        // se não estiver, o jogo é dado como o fim
        
        if(isPlay()){
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
 
    }
	
	
	/**
	 * Construtor da Tela
	 */
	public Tela() {
		
		//Define área útil da tela em pixels
		this.setLarguraX(800);
		this.setAlturaY(600);
        // Cria uma instrução de teclado
        addKeyListener(new TAdapter());
		
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
	
		//Define o valor inicial dos movimentos
		this.setEsquerda(false);
		this.setDireita(false);
		this.setCima(false);
		this.setBaixo(false);
		
		//Abre as imagens
		this.abrirImagens();
		
		this.init();
	}

	

	public void move() 
	{
        // Para cada ponto da cobrinha desenha em (x,y)
        for (int i = this.getTotalPontos(); i > 0; i--)
        {
            this.pontosEmX[i] = this.pontosEmX[(i - 1)];
            this.pontosEmY[i] = this.pontosEmY[(i - 1)];
        }

        // Se for para esquerda decrementa em x
        if (direita)
        {
            this.pontosEmX[0] -= this.getTamanhoPonto();
        }

        // Se for para direita incrementa em x
        if (esquerda)
        {
        	this.pontosEmX[0] += this.getTamanhoPonto();
        }

        // Se for para cima decrementa em y
        if (cima)
        {
        	this.pontosEmY[0] -= this.getTamanhoPonto();
        }

        // Se for para baixo incrementa em y
        if (baixo)
        {
        	this.pontosEmY[0] += this.getTamanhoPonto();
        }
	}
	
	public void ChkColisao()
	{
		// Para cada ponto, verifica se este está em posição com outro ponto
        // se estiver ele avista que o jogador parou de jogar devido a colisão
        for (int i = this.getTotalPontos(); i > 0; i--)
        {
            if ((i > 4) && (this.pontosEmX[0] == this.pontosEmX[i]) && (this.pontosEmY[0] == this.pontosEmY[i]))
            { this.setPlay(false) ; }
            
        }

        // Verifica se a cabeça da cobrinha encostou em algum ponto (x,y)
        // nas bordas (width,height) da tela
        if (this.pontosEmY[0] > getAlturaY())
        { this.setPlay(false) ; }

        if (this.pontosEmY[0] < 0)
        { this.setPlay(false) ;}

        if (this.pontosEmX[0] > getLarguraX())
        { this.setPlay(false) ;}

        if (this.pontosEmX[0] < 0)
        { this.setPlay(false) ;}
	}

    // Método para checar se a cobrinha comeu a comida
    public void ChkComida ()
    {
        // Se ele comer na mesma posição (x,y) então aumenta o corpo da cobrinha
        // aumenta a pontuação e gera uma nova comida
        if ((this.pontosEmX[0] == this.getFrutaX()) && (this.pontosEmY[0] == this.getFrutaY()))
        {
            this.pontuacao++;
            this.bodysize++;
            posicaoFruta();
        }
    }
	
    // Método de ações durante a execução do jogo
    public void actionPerformed (ActionEvent e)
    {
        // Se estiver jogando então já realiza a checagem da comida, depois
        // verifica se existe colisão, só então depois, realiza o movimento
        // da cobrinha no jogo, por fim, redesenha os resultados
        if (this.isPlay())
        {
            //checarComida();
            ChkColisao();
            move();
        }

        repaint();
    }
    private class TAdapter extends KeyAdapter
    {

        // Método para verificar o que foi teclado
        @Override
        public void keyPressed (KeyEvent e)
        {
            // Obtém o código da tecla
            int key =  e.getKeyCode();

            // Verifica os movimentos e manipula as variáveis, para movimentar
            // corretamente sobre a tela
            if ((key == KeyEvent.VK_LEFT) && (!direita))
            {
                setEsquerda(true);
            	setCima(false);
            	setBaixo(false);
                
            }

            if ((key == KeyEvent.VK_RIGHT) && (!esquerda))
            {
            	setDireita(true);
                setCima(false);
                setBaixo(false);
                
            }

            if ((key == KeyEvent.VK_UP) && (!baixo))
            {
            	setCima(true);
                setEsquerda(false);
                setDireita(false);
                
            }

            if ((key == KeyEvent.VK_DOWN) && (!cima))
            {
                setBaixo(true);
                setEsquerda(false);
                setDireita(false);
            }
        }
    }

}