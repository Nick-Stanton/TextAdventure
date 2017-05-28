
public interface Character {
	
	public String getName();
	
	public int getHealth();
	
	public int getMagic();
	
	public String processCommand(String command); //lets character observe, attack, take items, etc.
	
}
