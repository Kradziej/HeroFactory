package HeroSettingsLocator;

import hero.HeroType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import factory.IHeroSettingsLocator;

public class RandomSettingLocator implements IHeroSettingsLocator {
	private String losoweImie;
	private ArrayList<String> listaImion = new ArrayList<>();

	Random r = new Random();
	private String imie;

	@Override
	public HeroType getType() {

		HeroType[] heroes = HeroType.values();

		int index = r.nextInt(heroes.length);
		return heroes[index];
	}

	public String getName() {
		listaImion.add("Krzysztof_Krawczyk");
		listaImion.add("Zbysiu_Boniek");
		listaImion.add("Koziolek_Mato³ek");
		listaImion.add("Stefan_Batory");
		listaImion.add("Piotrek_Jan_Kucharowski");
		listaImion.add("Kasia_Ga³¹Ÿ");
		return listaImion.get(r.nextInt(listaImion.size()));
		
	}

}
