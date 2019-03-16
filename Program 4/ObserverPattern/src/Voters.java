import java.util.ArrayList;
import java.util.HashMap;

public class Voters implements VoterSubject {
	
	public ArrayList<PollObserver> pollobservers;
	public int vote;
	//private String team;
	public HashMap<String, Integer> onevote = new HashMap<>();
	
	public Voters() {
		pollobservers = new ArrayList<PollObserver>();
	}
	@Override
	public void addObserver(PollObserver o) {
		pollobservers.add(o);
		
	}

	@Override
	public void notifyObserver(int i) {
		for(PollObserver o : pollobservers) {
			o.update(onevote, i);
		}
		
	}
	
	public void getTeams(HashMap<String, Integer> onevote) {
		this.onevote = onevote;
	}
	
	public void setVote(int voterCount) {
		int min = 1;
		int max = 25;
		int range = max - min + 1;
		for(String k : onevote.keySet()) {
			vote  = (int) (Math.random() * range) + min;
			onevote.put(k, vote);
		}

		notifyObserver(voterCount);
		
	}

}
