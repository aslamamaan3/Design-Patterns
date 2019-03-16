import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Program2 {
	
	public static void printAll(iIterator i) {
		while(!i.isDone()) {
			Object x = i.Next();
			System.out.println(x);
		}
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		
		File myfile = new File("input.txt");
		Scanner sc = new Scanner(myfile);
		
		Integer intarray[] = new Integer[sc.nextInt()]; //integer array
		Double doublearray[] = new Double[sc.nextInt()]; //double array
		String stringarray[] = new String[sc.nextInt()]; //string array
		sc.nextLine();
		
		//adding elements to integer array
		for(int i=0; i<intarray.length; i++) {
			intarray[i] = Integer.parseInt(sc.nextLine());
		}
		
		//adding elements to Double array
		for(int i=0; i<doublearray.length; i++) {
			doublearray[i] = Double.parseDouble(sc.nextLine());
		}
		
		//adding elements to String array
		for(int i=0; i<stringarray.length; i++) {
			stringarray[i] = sc.nextLine();
		}
		
		
		AnyArrayData fordouble = new AnyArrayData();
		fordouble.makingArray(doublearray);
		
		//creating double iterator and then printing
		iIterator doubleIter = fordouble.getIterator();
		printAll(doubleIter);
		
		AnyArrayData forinteger = new AnyArrayData();
		forinteger.makingArray(intarray);
		
		//creating integer iterator and then printing
		iIterator intIter = forinteger.getIterator();
		printAll(intIter);
		
		AnyArrayData forstring = new AnyArrayData();
		forstring.makingArray(stringarray);
		
		//creating string iterator and then printing
		iIterator stringIter = forstring.getIterator();
		printAll(stringIter);
		

	}

}
