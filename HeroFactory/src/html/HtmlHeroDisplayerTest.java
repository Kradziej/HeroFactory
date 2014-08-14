package factory;

import static org.junit.Assert.*;

import java.io.IOException;

import hero.Hero;

import org.junit.Test;

public class HtmlHeroDisplayerTest {

	@Test
	public void test() throws IOException {
		Hero hero =new Hero();
		HtmlHeroDisplayer h =new HtmlHeroDisplayer();
		h.generateHTML(hero);
	}

}
