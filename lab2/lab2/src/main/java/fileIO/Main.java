package fileIO;

import entity.Entity;

public class Main {

	public static void main(String[] args) {
		Entity entity = new Entity("T-shirt", 17,"red");
		
		FileIOInterface fio = new FileIO();
		fio.saveToFile(entity);
		System.out.println((Entity)fio.loadFromFile());
	}

}
