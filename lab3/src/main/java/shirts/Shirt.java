package shirts;

public class Shirt {
	
	int id;
	String name;
	int size;
	
	
	public Shirt() {
		
	}
	
	
	public Shirt(int id, String name, int size) {
		this.id = id;
		this.name = name;
		this.size = size;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size =size;
	}


	@Override
	public String toString() {
		return "{\"id\":"+id+",\"name\":\""+name+"\", \"size\":"+size+"}";
	}

}
