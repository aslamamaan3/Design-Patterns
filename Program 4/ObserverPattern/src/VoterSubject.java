
public interface VoterSubject {
	public void addObserver(PollObserver o);
	public void notifyObserver(int i);
}
