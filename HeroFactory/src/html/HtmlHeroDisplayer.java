package html;

import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.JEditorPane;
import javax.swing.JLabel;

import factory.IHeroDisplayer;
import hero.Hero;
import hero.HeroType;

public class HtmlHeroDisplayer implements IHeroDisplayer  {
	
	

	private String url;

	public void show(Hero hero) {
		
		
		
		
		
		
			try {
				generateHTML(hero);
				openWebpage("MyHeroHTML.html");
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		
		}
	

	

	
	public void generateHTML(Hero hero) throws IOException {
		
       switch (hero.getType()) {
	case KING:
		 url="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRBOval-P6mgHoKQ4httTXAiIxZUAz4FJUDA-10ILRdSuF26ceJZp1FwzY";
		break;
	case KNIGHT:
		 url="http://www.miki.com.pl/2315-83-large/schleich-70001-rycerze-rycerz-z-duzym-mieczem.jpg";
		break;
	case MAGE:
		 url="http://www.miki.com.pl/2315-83-large/schleich-70001-rycerze-rycerz-z-duzym-mieczem.jpg";
		break;
	case PRINCESS:
		 url="http://www.miki.com.pl/2315-83-large/schleich-70001-rycerze-rycerz-z-duzym-mieczem.jpg";
		break;
	default:
		break;
	}
		StringBuilder builder = new StringBuilder();
		builder.append("<!DOCTYPE html>");
		builder.append("<html lang=\"en\">");
		builder.append("<head><title>Laski & Miecze</title></head>");
		builder.append("<body><h1>"+hero.getName()+"</h1></body>");
		builder.append("<img src="+ url  +" />");
		builder.append("</html>");
		//String html = builder.toString();
		FileWriter fstream = new FileWriter("MyHeroHTML.html");
	    BufferedWriter out = new BufferedWriter(fstream);
	    out.write(builder.toString());
	    out.close();
}
	
	public static void openWebpage(String urlString) {
	    try {
	        Desktop.getDesktop().browse(new URL(urlString).toURI());
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	}