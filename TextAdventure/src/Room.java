import java.util.ArrayList;

public class Room {

	private boolean found;
	private ArrayList<String> items;
	
	public Room(){
		found = false;
		items = new ArrayList<String>();
	}
	
	public boolean isFound(){
		return found;
	}
	
	public ArrayList<String> getItems(){
		return items;
	}
}
