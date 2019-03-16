import java.util.HashMap;

public class LATimes implements MediaObserver {
	
	public LATimes(PollSubject poll) {
		poll.addMediaObserver(this);
	}
	@Override
	public void updateFinal(HashMap<String, Integer> finalVote, String pollname) {
		System.out.println("-----------LA Times-------------\n	"+pollname);
		for(String keys : finalVote.keySet()) {
			System.out.println(keys + ":" + finalVote.get(keys));
		}
		
	}
}
