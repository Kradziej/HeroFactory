package File;

import hero.HeroType;

import java.io.*;
import java.nio.CharBuffer;
import java.util.*;

public class FileHeroSettingsLocator {

	private Scanner x;
	static String name;
	static HeroType type;
	static String fileName = "Imiona.txt";
	
	public HeroType getType() {
		if (type == null) {
			try {
				x = new Scanner(new File(this.getClass().getResource("/images/" + fileName).toURI()));
			} catch (Exception e) {
				System.out.println("could not find a file");
			}
			String[] line = x.nextLine().split(" ");
			type = HeroType.getHeroByName(line[0]);
		}

		return type;
	}

	public String getName() {
		if (name == null) {
			try {
				x = new Scanner(new File(this.getClass().getResource("/images/" + fileName).toURI()));
			} catch (Exception e) {
				System.out.println("could not find a file");
			}
			String[] line = x.nextLine().split(" ");
			name = line[1];
		}
		return name;
	}

}
