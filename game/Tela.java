package base;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class Tela extends JPanel implements ActionListener {
	
	//Variáveis de Instância
	private int alturaY;
	private int larguraX;
	private int totalPontos;
	private int tamanhoPonto;
	
	private int score;
	private int maxScore;
	private String scoreMsg;
	private Font fonteDoScore;
	private FontMetrics metricaDoScore;
	
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
    
    //Definição dos movimentos
    private boolean esquerda;
    private boolean direita;
    private boolean cima;
    private boolean baixo; 
        
    Timer runtime;
    private int step;
    
    public int getStep() {
		return step;
	}

	public void setStep(int step) {
		this.step = step;
	}

	public Timer getRuntime() {
		return runtime;
	}

	public void setRuntime(Timer runtime) {
		this.runtime = runtime;
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
		  
	public String getScoreMsg() {
		return scoreMsg;
	}

	public void setScoreMsg(String scoreMsg) {
		this.scoreMsg = scoreMsg;
	}

	public Font getFonteDoScore() {
		return fonteDoScore;
	}

	public void setFonteDoScore(Font fonteDoScore) {
		this.fonteDoScore = fonteDoScore;
	}

	public FontMetrics getMetricaDoScore() {
		return metricaDoScore;
	}

	public void setMetricaDoScore(FontMetrics metricaDoScore) {
		this.metricaDoScore = metricaDoScore;
	}
	
	private boolean play;	
	
	public boolean isPlay() {
		return play;
	}

	public void setPlay(boolean play) {
		this.play = play;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getMaxScore() {
		return maxScore;
	}

	public void setMaxScore(int maxScore) {
		this.maxScore = maxScore;
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
		
		//gera posições da fruta na tela
        this.posicaoFruta();
        
        this.posicaoCobra(this.getLarguraX()/2, this.getAlturaY()/2);
        
        this.setStep(140);
        
        this.setEsquerda(true);
        
        this.setRuntime(new Timer(this.getStep(), this));
        this.getRuntime().start();
        
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
	public void posicaoCobra(int x, int y) {
		if (this.getTamanhoCobra() == 1) {
			this.setCabecaX(x);
			this.setCabecaY(y);
			
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
        
        drawScore(g);
        
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
		
		addKeyListener(new Keyboard());
		
		this.setScore(0);
		this.setMaxScore(1000);
		
		this.setTamanhoPonto(25);
		this.setTotalPontos((this.getLarguraX()/this.getTamanhoPonto()) *
								(this.getAlturaY()/this.getTamanhoPonto()));
		
		this.setPontosEmX(new int[this.getTotalPontos()]);
		this.setPontosEmY(new int[this.getTotalPontos()]);
		
		//Define cor fixa do fundo
		this.setBackground(Color.WHITE);
			
		//Foca no painel do jogo ao abrir
		this.setFocusable(true);
		
		this.setScoreMsg(""+this.getScore());
		this.setFonteDoScore(new Font("Consolas", Font.BOLD, 12));
		this.setMetricaDoScore(this.getFontMetrics(this.getFonteDoScore()));
				
		this.setFrutaPath("fruta.png");
		this.setCobraPath("snake.png");
		
		this.setTamanhoCobra(1);
		this.setMaxTamanhoCobra(this.getMaxScore()/10);
		
		this.setCorpoX(new int[this.getLarguraX()/this.getTamanhoPonto()-1]);
		this.setCorpoY(new int[this.getAlturaY()/this.getTamanhoPonto()-1]);
						
		//Define tamanho do JPanel
		this.setSize(this.getLarguraX(), this.getAlturaY());
				
		this.abrirImagens();
		
		this.setStep(140);
		
		this.setPlay(true);
		
		this.init();
	}
	
	public void move() 
	{
        /*
		// Para cada ponto da cobrinha desenha em (x,y)
        for (int i = this.getTamanhoCobra(); i > 0; i--)
        {
            this.pontosEmX[i] = this.pontosEmX[(i - 1)];
            this.pontosEmY[i] = this.pontosEmY[(i - 1)];
        }
	*/
        // Se for para esquerda decrementa em x
        if (this.isDireita())
        {
            //this.pontosEmX[0] -= this.getTamanhoPonto();
        	this.posicaoCobra(this.getCabecaX() + this.getTamanhoPonto(),
        						this.getCabecaY());
        }

        // Se for para direita incrementa em x
        if (this.isEsquerda())
        {
        	this.posicaoCobra(this.getCabecaX() - this.getTamanhoPonto(),
								this.getCabecaY());
        }

        // Se for para cima decrementa em y
        if (this.isCima())
        {
        	this.posicaoCobra(this.getCabecaX(),
								this.getCabecaY() - this.getTamanhoPonto());
        }

        // Se for para baixo incrementa em y
        if (this.isBaixo())
        {
        	this.posicaoCobra(this.getCabecaX(),
					this.getCabecaY() + this.getTamanhoPonto());
        }
	}
	
	public void drawScore(Graphics g) {
		this.setScoreMsg(""+this.getScore());
		this.setMetricaDoScore(this.getFontMetrics(this.getFonteDoScore()));
		
		g.setColor(Color.RED);
		g.setFont(this.getFonteDoScore());
		g.drawString(this.getScoreMsg(),
					(this.getLarguraX() - this.getMetricaDoScore().stringWidth(this.getScoreMsg()) - 10),
					(this.getAlturaY() - 10)
					);
		
	}
	
	// Método de ações durante a execução do jogo
    public void actionPerformed (ActionEvent e)
    {
        // Se estiver jogando então já realiza a checagem da comida, depois
        // verifica se existe colisão, só então depois, realiza o movimento
        // da cobrinha no jogo, por fim, redesenha os resultados
        if (this.isPlay())
        {
            move();
        }

        repaint();
    }
    
    private class Keyboard extends KeyAdapter
    {
        // Método para verificar o que foi teclado
        @Override
        public void keyPressed (KeyEvent e)
        {
            // Obtém o código da tecla
            int tecla = e.getKeyCode();

            // Verifica os movimentos e manipula as variáveis, para movimentar
            // corretamente sobre a tela
            if ((tecla == KeyEvent.VK_LEFT) && (!isDireita()))
            {
                setEsquerda(true);
            	setCima(false);
            	setBaixo(false);
                
            }

            if ((tecla == KeyEvent.VK_RIGHT) && (!isEsquerda()))
            {
            	setDireita(true);
                setCima(false);
                setBaixo(false);
                
            }

            if ((tecla == KeyEvent.VK_UP) && (!isBaixo()))
            {
            	setCima(true);
                setEsquerda(false);
                setDireita(false);
                
            }

            if ((tecla == KeyEvent.VK_DOWN) && (!isCima()))
            {
                setBaixo(true);
                setEsquerda(false);
                setDireita(false);
            }
        }
    }
		
}