package commandLineHeroDisplayer;

import hero.Hero;
import factory.IHeroDisplayer;

public class CommandLineHeroDisplayer implements IHeroDisplayer {

	@Override
	public void show(Hero hero) {

		System.out.println("Imiê naszego bohatera to: "+hero.getName()+",");
		// System.out.println(Hero.getName()); To jest b³êdne, bo odwo³anie jest do klasy a nie do atrybutu
		System.out.println("a nasza postaæ jest typu: "+hero.getType());
	}

}
