import java.util.HashMap;

public interface PollSubject {
	public void addMediaObserver(MediaObserver o);
	public void notifyMediaObserver();
	//public static HashMap<String, Integer> finalVote = new HashMap<>();
}
