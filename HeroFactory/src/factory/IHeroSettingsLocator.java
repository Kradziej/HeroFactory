package factory;
import hero.HeroType;

public interface IHeroSettingsLocator {
	
	
	public HeroType getType();
	public String getName();
}
