
public class heightConverter {
	public static void main(String[] args) {
		  double conversionFactor = 2.54;
		  String myName = "Pat Wilson";
		  int age = 22;
		  double myHeightInches = 67;
		  double myHeightCM = conversionFactor * myHeightInches;
		  
		  System.out.println(myName);
		  System.out.println("age: " + age);
		  System.out.println("height: "+myHeightInches);
		  System.out.println("height: "+myHeightCM);
		
		}
}
