package entity;

import java.io.Serializable;

public class Entity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String title;
	private int size;
	private String color;
	public Entity(String title, int size, String color) {
		super();
		this.title = title;
		this.size = size;
		this.color = color;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "{\"title\": \""+title+"\", \"size\": "+size+", \"color\": "+color+"}";
	}
	
	

	
}
