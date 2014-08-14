package hero;

public enum HeroType {
	
	PRINCESS("Ksiezniczka"),
	KNIGHT("Rycerz"),
	KING("Krol"),
	MAGE("Mag");
	
	private String heroName;
	
	HeroType(String heroName) {
		
		this.heroName = heroName;
	}
	
	
	public static HeroType getHeroByName(String name) {
		
		for(HeroType t : HeroType.values()) {
			
			if(t.heroName == name)
				return t;
		}
		
		return null;
	}
}
