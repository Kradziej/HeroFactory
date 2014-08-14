package File;

import hero.HeroType;

import java.io.*;
import java.nio.CharBuffer;
import java.util.*;

public class FileHeroSettingsLocator {

	private Scanner x;
	static String name;
	static HeroType type;
	
	public HeroType getType() {
		if (type == null) {
			try {
				x = new Scanner(new File("C:\\Users\\5\\Desktop\\Imiona.txt"));
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
				x = new Scanner(new File("C:\\Users\\5\\Desktop\\Imiona.txt"));
			} catch (Exception e) {
				System.out.println("could not find a file");
			}
			String[] line = x.nextLine().split(" ");
			name = line[1];
		}
		return name;
	}

}
