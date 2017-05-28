import java.util.ArrayList;

public class Player implements Character {
	
	private String name;
	private int health; //depletes when attacked
	private int magic; //depletes when used
	private int power; //physical attack power
	private ArrayList<String> items; //holds collected items
	
	public Player() {
		health = 100;
		magic = 100;
		power = 10;
		name = "player";
		items = new ArrayList<String>();
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public int getHealth() {
		return health;
	}
	
	@Override
	public int getMagic() {
		return magic;
	}
	
	public int getPower() {
		return power;
	}
	
	public String getItems() {
		String x = "";
		for(String a: items){
			x += a;
			x += ", ";
		}
		return x;
	}
	
	@Override
	public String processCommand(String command) { //will process command and allow player to interact with rooms/enemies
		return null;
	}

}
