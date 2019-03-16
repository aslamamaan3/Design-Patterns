import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;


public class ObserverPattern {

	public static void main(String[] args) throws FileNotFoundException {
		File myfile = new File("teams.txt");
		Scanner sc = new Scanner(myfile);
		String line;
		HashMap<String, Integer> teams = new HashMap<String, Integer>();
		
		while(sc.hasNextLine()) {
			line = sc.nextLine();
			teams.put(line, 0);
		}
		sc.close();
		
		AssociatedPress ap = new AssociatedPress();
		USAToday ut = new USAToday();
		Espn espn = new Espn(ap);
		Espn espn1 = new Espn(ut);
		LATimes la1 = new LATimes(ap);
		LATimes la2 = new LATimes(ut);
		SportsWeekly sw1 = new SportsWeekly(ap);
		SportsWeekly sw2 = new SportsWeekly(ut);
		WashingtonPost wp1 = new WashingtonPost(ap);
		WashingtonPost wp2 = new WashingtonPost(ut);
		
		for(int i=0; i<=99; i++) {
			Voters voter = new Voters();
			if(i<=40) {
				voter.addObserver(ap);
			}
			else if(i>40 && i<60) {
				voter.addObserver(ap);
				voter.addObserver(ut);
			}
			else if(i>=60) {
				voter.addObserver(ut);
			}
			
			voter.getTeams(teams);
			voter.setVote(i);

		}
		ap.countVote();
		ut.countVote();
		
	}
	

}
