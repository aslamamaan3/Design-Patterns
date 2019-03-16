import mystring.IndiscreetString;
import mystring.MyString;

public class DiscreetString implements MyString {

	int count= 0;
	MyString indiscreetStr = new IndiscreetString();
	public void clear() {
		indiscreetStr.clear();
		
	}

	@Override
	public String getText() {
		
		return indiscreetStr.getText();
	}

	@Override
	public void reverse() {
		indiscreetStr.reverse();
		
	}

	@Override
	public void setText(String x) {
		
		String[] arr = x.split(" ");
		for(int i =0; i<arr.length;i++) {
			if(arr[i].contains("bum"))
				count++;
			if(arr[i].contains("weewee"))
				count++;
			if(arr[i].contains("poopoo"))
				count++;
			if(arr[i].contains("knickers"))
				count++;
		}
		
		
		x= x.replace("bum", "b*m");
		x= x.replace("weewee", "w**w**");
		x= x.replace("knickers", "kn*ckers");
		x= x.replace("poopoos", "p**p**s");
		indiscreetStr.setText(x);
		
	}
	
	public void close() {
		System.out.println("The user attempted to insert "+count+" naughty words.");
		
	}

}
