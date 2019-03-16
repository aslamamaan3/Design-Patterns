import java.util.ArrayList;
import java.util.HashMap;

public interface PollObserver {
	public ArrayList<HashMap<String, Integer>> allvoters= new ArrayList<HashMap<String, Integer>>();
	public void update(HashMap<String , Integer> onevote, int i);
}
