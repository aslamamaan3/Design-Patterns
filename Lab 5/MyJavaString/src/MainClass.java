import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String entered = sc.nextLine();
		
		DiscreetString discreetStr = new DiscreetString();
		
		discreetStr.setText(entered); //replacing naughty words
		System.out.println(discreetStr.getText());
		
		discreetStr.reverse();//reversing string
		System.out.println(discreetStr.getText());
		
		discreetStr.close();
	}

}
