import java.util.ArrayList;

public class Room {

	private boolean found;
	private String[] objects = {"Key", "Sword", "Potion?"};
	private ArrayList<String> roomObjects;
	private String description;
	private String name;
	
	public Room(String name, String description, String[] objects){
		found = false;
		roomObjects = new ArrayList<String>();
		this.description = description;
		this.name = name;
	}
	
	public boolean isFound(){
		return found;
	}
	
	public String getName(){
		return name;
	}
	
	public String[] getObjects(){
		return objects;
	}
	
	public void look(){
		System.out.println(name + "\n" + description);
	}
}
