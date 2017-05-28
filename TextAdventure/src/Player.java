import java.util.ArrayList;

public class Player {

	private ArrayList<String> inv;
	
	public Player(){
		inv = new ArrayList<String>();
	}
	
	public String inventory(){
		String x = "";
		for(String a: inv){
			x += a;
			x += ", ";
		}
		return x;
	}
	
}
