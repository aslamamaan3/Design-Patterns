import java.util.*;

class StatePattern{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Context context;
		String str;

		while(true){
			System.out.print("Enter String>");
			str = sc.nextLine();
			if(str.length()!=0){
				context = new Context();
				if(str.equals("q")){
					System.out.println("Goodbye!");
					break;
				}
				else{
					context.stateTransition(str);

					if(context.isAccepted()){
						System.out.println("String " +str+ " accepted");
						continue;
				}
					else{
						System.out.println("String " +str+ " not accepted");
						continue;
					}
				}
			}

			

		}
	}
}