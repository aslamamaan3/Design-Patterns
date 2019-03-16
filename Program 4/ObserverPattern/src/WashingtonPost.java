import java.util.HashMap;

public class WashingtonPost implements MediaObserver {
	public WashingtonPost(PollSubject poll) {
		poll.addMediaObserver(this);
	}
	@Override
	public void updateFinal(HashMap<String, Integer> finalVote, String pollname) {
		System.out.println("-----------Washington Post-------------\n	"+pollname);
		for(String keys : finalVote.keySet()) {
			System.out.println(keys + ":" + finalVote.get(keys));
		}
		
	}
}
