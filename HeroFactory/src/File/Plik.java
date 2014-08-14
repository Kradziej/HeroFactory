package File;

import java.io.*;
import java.nio.CharBuffer;
import java.util.*;

public class Plik {

	private Scanner x;
	static String type, name;

	public String getType() {
		if (type == null) {
			try {
				x = new Scanner(new File("C:\\Users\\5\\Desktop\\Imiona.txt"));
			} catch (Exception e) {
				System.out.println("could not find a file");
			}
			String[] line = x.nextLine().split(" ");
			type = line[0];
		}

		return type;
	}

	public HeroType setName() {
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
