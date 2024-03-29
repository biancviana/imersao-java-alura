import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class GeradoraDeFigurinhas {
	
	public void cria() throws Exception {
		
		// leitura da imagem		
		BufferedImage imagemOriginal = ImageIO.read(new File("filme.jpg"));
		
		// criar nova imagem com transparÍncia e tamanho novo
		int largura = imagemOriginal.getHeight();
		int altura = imagemOriginal.getHeight();
		int novaAltura = altura + 200;
		
		BufferedImage novaImagem = new BufferedImage(largura, novaAltura, BufferedImage.TRANSLUCENT);
		
		// copiar a imagem original para nova imagem
		Graphics2D graphics = (Graphics2D) novaImagem.getGraphics();
		graphics.drawImage(imagemOriginal, 0, 0, null);
		
		// escrever a nova imagem em um arquivo
		ImageIO.write(novaImagem, "png", new File ("images/figurinha.png"));
		
	}
	
	public static void main(String[] args) throws Exception {
		var geradora = new GeradoraDeFigurinhas();
		geradora.cria();
	}

}
