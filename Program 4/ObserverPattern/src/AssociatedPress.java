import java.util.ArrayList;
import java.util.HashMap;

public class AssociatedPress implements PollObserver, PollSubject {
	
	
	public HashMap<String, Integer> finalVote = new HashMap<>();
	public ArrayList<MediaObserver> mediaobservers;
	
	public AssociatedPress() {
		mediaobservers = new ArrayList<MediaObserver>();
	}
	
	@Override
	public void update(HashMap<String , Integer> onevote, int i) {
		allvoters.add(i, onevote);
	}
	
	public void countVote() {
		
		finalVote = allvoters.get(0);
		
		for(int i=1; i<allvoters.size(); i++) {
			HashMap<String, Integer> temp = allvoters.get(i);
			for(String k : finalVote.keySet()) {
				int x = finalVote.get(k) + temp.get(k);
				finalVote.put(k, x);
			}
		}
		
		int sum = 26;
		for(String k : finalVote.keySet()) {
			finalVote.put(k, sum - (int)(Math.random() * ((25 - 1) + 1)) + 1);
		}
		
		notifyMediaObserver();
		
	}

	@Override
	public void addMediaObserver(MediaObserver o) {
		mediaobservers.add(o);
		
	}

	@Override
	public void notifyMediaObserver() {
		for(MediaObserver o : mediaobservers) {
			String pollname = "Associated Press";
			o.updateFinal(finalVote, pollname);
		}
		
	}
}
