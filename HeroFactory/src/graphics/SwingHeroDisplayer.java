package graphics;

import factory.IHeroDisplayer;
import hero.Hero;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class SwingHeroDisplayer extends JFrame implements IHeroDisplayer {

	int x = 3;
	BufferedImage image;
	JTextField wyswietlacz;
	String name;

	Hero hero;

	@Override
	public void show(Hero hero) {

		this.imageLoader(hero);
		this.frame();

	}

	public void imageLoader(Hero hero) {
		String imageUrl = "C:/Users/4/git/HeroFactory/HeroFactory/src/images/";

		switch (hero.getType()) {
		case PRINCESS:
			imageUrl = imageUrl + "Princess.jpg";
			break;
		case KNIGHT:
			imageUrl = imageUrl + "Knight.jpg";
			break;
		case MAGE:
			imageUrl = imageUrl + "Mage.jpg";
			break;
		case KING:
			imageUrl = imageUrl + "King.jpg";
			break;
		}
		name = ("Name of hero: " + hero.getName());
		try {
			image = ImageIO.read(new File(imageUrl));
		} catch (IOException e) {
			name = "There is no file";
			e.printStackTrace();
		}

	}

	public void frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Laski i Miecze");
		setSize(300, 400);
		setVisible(true);
		setLocationRelativeTo(null);
		setResizable(false);
		paint(getGraphics());

		wyswietlacz = new JTextField();
		wyswietlacz.setColumns(10);
		wyswietlacz.setBounds(10, 250, 270, 50);
		wyswietlacz.setForeground(Color.RED);
		wyswietlacz.setFont(new Font("ARIAL", Font.BOLD, 20));
		wyswietlacz.setText(name);
		add(wyswietlacz);
		wyswietlacz.setHorizontalAlignment(JTextField.RIGHT);

	}

	public void paint(Graphics g) {

		g.drawImage(image, 0, 20, this);

	}

}
