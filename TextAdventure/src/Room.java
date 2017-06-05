import java.util.ArrayList;

public class Room {

	private boolean found;
	private boolean north;
	private boolean west;
	private boolean south;
	private boolean east;
	private String[] objects = {"Key", "Sword", "Potion?"};
	private ArrayList<String> roomObjects;
	private String description;
	private String name;
	
	public Room(String name, String description, String[] objects, boolean up, boolean down, boolean left, boolean right){
		found = false;
		roomObjects = new ArrayList<String>();
		this.description = description;
		this.name = name;
		north = up;
		south = down;
		west = left;
		east = right;
	}
	
	//1 is north, 2 is east, 3 is south, 4 is west. The numbers move clockwise
	public boolean canGo(int dir){
		if(dir < 1 || dir > 4){
			throw new IllegalArgumentException();
		}
		if(dir == 1){
			return north;
		}
		else if(dir == 2){
			return east;
		}
		else if(dir == 3){
			return south;
		}
		else{
			return west;
		}
	}
	
	public boolean isFound(){
		return found;
	}
	
	public void find(){
		found = true;
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
