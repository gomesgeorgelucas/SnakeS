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
	private int TPONTOS = 768;
	private int PONTO = 25;
    // Definição do plano cartesiano (x,y) do jogo
    private int[] x = new int[TPONTOS];
    private int[] y = new int[TPONTOS];
    
    // Posição (x,y) da comida
    private int comidax;
    private int comiday;
    
    //Imagem da comida
    private Image comida; 
	
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
		
 
		
        posicaoComida();
        
        
	}
	// Método para gera posicao comida
	public void posicaoComida()
	{
    	//Cordenadas da comida
    	int comidax = larguraX/2;
    	int comiday = alturaY/2;
	}
	
	// Metodo para abrir as imagens
	public void abriImagens()
	{
        // Cria um icone do arquivo png e seta na imagem correspondente
        ImageIcon comida_ = new ImageIcon("comida.png");
        comida = comida_.getImage();
	}
	
	
	
	// Método para desenhar elementos na tela do jogo
    @Override
    public void paint (Graphics g)
    {
        // Define o atribuito para a classe própria
        super.paint(g);

        // Desenha a comida no plano (x,y) do jogo
    
        g.drawImage(comida, comidax, comiday, this);
    
        // Executa a sincronia de dados
        Toolkit.getDefaultToolkit().sync();

        // Pausa os gráficos
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
		
		abriImagens();
		
		init();


	}
	

}