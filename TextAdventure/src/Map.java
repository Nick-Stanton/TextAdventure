public class Map {
	
	public Map() {
		
	}
	
	public String getMap(Room[][] rooms) {
		
		String map = "";
		int rows = 4; //Change to 4 later
		int cols = 5; //Change to 5
		
		//Creates an array of room names
		String[][] names = new String[rows][cols];
		String space = "         ";
		for(int r = 0; r < rows; r++) {//All names must be <9 characters long
			for(int c = 0; c < cols; c++) {
				if(rooms[r][c].getName().length() <= 9) {
					names[r][c] = rooms[r][c].getName();
					names[r][c] += space.substring(names[r][c].length());
				} else {
					names[r][c] = rooms[r][c].getName().substring(0, 9);
				}
			}
		}
		
		//Displays all rooms
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {//top
				map += " _________  ";
			}
			map += "\n";
			
			for(int k = 0; k < 2; k++) {//first 2 mid
				for(int m = 0; m < cols; m++) {
					map += "|         | ";
				}
				map += "\n";
			}
			
			for(int n = 0; n < cols; n++) {//mid label
				map += "|" + names[i][n] + "| ";
			}
			map += "\n";
			
			for(int o = 0; o < cols; o++) {//last mid
				map += "|         | ";
			}
			map += "\n";
			
			for(int l = 0; l < cols; l++) {//bottom
				map += "|_________| ";
			}
			map += "\n";
		}
		
		return map;
	}
	
}
