import java.util.ArrayList;

public class Player{
	
	private String name;
	
	private ArrayList<String> items; //holds collected items
	
	public Player() {
		
		name = "player";
		items = new ArrayList<String>();
	}
	
	public String getName() {
		return name;
	}
	
	public String getItems() {
		String x = "";
		for(String a: items){
			x += a;
			x += ", ";
		}
		return x;
	}
	
	public String processCommand(String command) { //will process command and allow player to interact with rooms/enemies
		return null;
	}

}
