import java.util.Scanner;

public class Adventure {

	public static void main(String[] args) {
		Player grant = new Player();
		Scanner console = new Scanner(System.in);
		Map map = new Map();
		Room[][] rooms = new Room[4][5];
		roomBuilder(rooms);
		boolean game = true;
		boolean start = true;
		boolean bathroom = false;
		
		System.out.println(map.getMap(rooms));//prints full map once, might include in game loop?
		
		while(game){
			while(start){
				start = false;
				game = false;
			}
			while(bathroom){
				
			}
		}
	}
	
	public static void roomBuilder(Room[][] rooms){
		String[] items = new String[0]; //temp item array, for map testing purposes
		rooms[0][0] = new Room("The Lab", "A spooky lab. What experiments happened here?", items);
		rooms[1][0] = new Room("Room of Bones", "A room with a pile of bones. There is an unlocked door on the east wall of the room, and a locked door on the north side. The closet is south.", items);
		rooms[2][0] = new Room("The Closet", "A dark closet with a pile of clothes against the wall", items);
		rooms[3][0] = new Room("The Bedroom", "What is this place? The room is dim with a door leading to a closet and a door leading to the bathroom", items);
		rooms[0][1] = new Room("The Nursery", "A room that appears to be for children. All of the heads of the dolls appear to be removed violently.", items);
		rooms[1][1] = new Room("The Hall", "A barren hallway. Where is the way out?", items);
		rooms[2][1] = new Room("Master Bedroom", "Whoever owns this house lives here. Or maybe lived?", items);
		rooms[3][1] = new Room("The Bathroom", "Your head is swimming, and your reflection doesn't show in the mirror. A locked box sits in the corner.", items);
		rooms[0][2] = new Room("The Gallery", "Grotesque paintings of Grant Zukowski cover the walls.", items);
		rooms[1][2] = new Room("The TV Room", "The sofa has been torn open and the television flickers with static.", items);
		rooms[2][2] = new Room("The Kitchen", "Dirty dishes lay broken all over the ground. The brown goo on the stove is bubbling, but the burner isn't on.", items);
		rooms[3][2] = new Room("The Pantry", "The boxes that once held food appear to have been shredded by a large animal.", items);
		rooms[0][3] = new Room("Weapons Room", "Spooky weapons lay on the walls. Don't let admin see this room.", items);
		rooms[1][3] = new Room("Room", "It's not clear what this room is supposed to be. Dirt and trash cover the floor and walls.", items);
		rooms[2][3] = new Room("The Dining Room", "The table is set for one. An untouched slice of Hawaiian pizza sits at the table.", items);
		rooms[3][3] = new Room("The Cellar", "A locked box sits alone.", items);
		rooms[0][4] = new Room("The Shrine", "The shrine is covered with notes of worship. The notes form a Z.", items);
		rooms[1][4] = new Room("Guard Dog", "A large dog sleeps in the corner. Probably shouldn't touch that.", items);
		rooms[2][4] = new Room("The Entryway", "A locked door blocks your exit.", items);
		rooms[3][4] = new Room("The Exit", "You're finally free. Do you leave?", items);
	}

}
