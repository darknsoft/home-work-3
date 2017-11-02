package ua.pp.darknsoft;

public class EvenOrOdd{

	public static void main(String[] args){

		try{
			if(evenOrOdd(Integer.parseInt(args[0]))) System.out.println("The master of evenOrOdd numbers says: "+ args[0] + " is EVEN number (+)");
			else System.out.println("The master of evenOrOdd numbers says: "+ args[0] + " is ODD number (-)");
		}catch(ArrayIndexOutOfBoundsException ex){
			System.out.println("Error: " + ex);
			System.out.println("Please, enter the first Number and the second Number separated by space: ");
		}
		catch(Exception ex){
			System.out.println("Error: " + ex);
		}
	}

	private static boolean evenOrOdd(int firstNumber){
		
		if(firstNumber%2 == 0) return true;
		else return false;
	}
}
