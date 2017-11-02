package ua.pp.darknsoft;
import static java.lang.Math.abs;
public class TheNearestNumber{

	public static void main(String[] args){
		
		int firstNumber = 0;
		int secondNumber = 0;
		try{
			System.out.println("The nearest number is: " + theNearestSearcher(Integer.parseInt(args[0]),Integer.parseInt(args[1])) );
		}catch(ArrayIndexOutOfBoundsException ex){
			System.out.println("Error: " + ex);
			System.out.println("Please, enter the first Number and the second Number separated by space: ");
		}
		catch(Exception ex){
			System.out.println("Error: " + ex);
		}
	}
	
	private static int theNearestSearcher(int firstNumber,int secondNumber){
		
		int target = 10;
		if(abs(target-firstNumber) < abs(target-secondNumber)){
			return firstNumber;
		}else{
			return secondNumber;
		}
	}

} 
