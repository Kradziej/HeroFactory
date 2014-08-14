package heroSettings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;


public class RandomSettingLocator implements IHeroSettingLocator{
private String losoweImie;
private ArrayList<String> listaImion =new ArrayList<>();

private ArrayList<HeroType> listaTypow =new ArrayList()<>();

Random r = new Random();
private String imie;
@Override
public HeroType getType(){
	listaTypow.add(hero);
	hero=listaTypow.get(r.nextInt(listaTypow.size()+1));
	return hero;
	
}
public String getName(){
	listaImion.add("Krzysztof_Krawczyk");
	listaImion.add("Zbysiu_Boniek");
	listaImion.add("Koziolek_Mato³ek");
	listaImion.add("Stefan_Batory");
	listaImion.add("Piotrek_Jan_Kucharowski");
	listaImion.add("Kasia_Ga³¹Ÿ");
	imie=listaImion.get(r.nextInt(listaImion.size()+1));
	return imie; 
}
/*public String wylosujImie(){
	losoweImie=listaImion.get(r.nextInt(listaImion.size()+1));
	return losoweImie;
}*/
}
