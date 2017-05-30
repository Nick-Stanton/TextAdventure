import java.util.ArrayList;

public class Room {

	private boolean found;
	private ArrayList<String> items;
	private String description;
	private String name;
	
	public Room(String name, String description){
		found = false;
		items = new ArrayList<String>();
		this.description = description;
		this.name = name;
	}
	
	public boolean isFound(){
		return found;
	}
	
	public String getName(){
		return name;
	}
	
	public ArrayList<String> getItems(){
		return items;
	}
	
	public void look(){
		System.out.println(name + "\n" + description);
	}
}
