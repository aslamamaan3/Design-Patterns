import java.util.HashMap;

public class SportsWeekly implements MediaObserver {
	
	public SportsWeekly(PollSubject poll) {
		poll.addMediaObserver(this);
	}
	@Override
	public void updateFinal(HashMap<String, Integer> finalVote, String pollname) {
		System.out.println("-----------Sports Weekly-------------\n	"+pollname);
		for(String keys : finalVote.keySet()) {
			System.out.println(keys + ":" + finalVote.get(keys));
		}
		
	}
}
