package commandLineHeroDisplayer;

import hero.Hero;
import factory.IHeroDisplayer;

public class CommandLineHeroDisplayer implements IHeroDisplayer {

	@Override
	public void show(Hero hero) {

		System.out.println("Imi� naszego bohatera to: "+hero.getName()+",");
		// System.out.println(Hero.getName()); To jest b��dne, bo odwo�anie jest do klasy a nie do atrybutu
		System.out.println("a nasza posta� jest typu: "+hero.getType());
	}

}
