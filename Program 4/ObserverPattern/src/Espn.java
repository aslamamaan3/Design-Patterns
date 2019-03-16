import java.util.HashMap;

public class Espn implements MediaObserver {

	
	public Espn(PollSubject poll) {
		poll.addMediaObserver(this);
	}
	@Override
	public void updateFinal(HashMap<String, Integer> finalVote, String pollname) {
		System.out.println("-----------ESPN-------------\n	"+pollname);
		for(String keys : finalVote.keySet()) {
			System.out.println(keys + ":" + finalVote.get(keys));
		}
		
	}

}
