
public class Enemy implements Character {

	
	protected int health; //health value: depletes when attacked
	protected int magic; //magic power: depletes when used
	protected int power; //attacking power: physical attack power
	
	@Override
	public String getName() {
		return null;
	}

	@Override
	public int getHealth() {
		return 0;
	}

	@Override
	public int getMagic() {
		return 0;
	}

	@Override
	public String processCommand(String command) {
		return null;
	}
	

}
