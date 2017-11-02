package ua.pp.darknsoft;

public class Remainder{

	public static void main(String[] args){

		try{
			System.out.println("Remainder of integer division say: " + divisionTheRemainder(Integer.parseInt(args[0]),Integer.parseInt(args[1])) );
		}catch(ArrayIndexOutOfBoundsException ex){
			System.out.println("Error: " + ex);
			System.out.println("Please, enter the first Number and the second Number separated by space: ");
		}
		catch(Exception ex){
			System.out.println("Error: " + ex);
		}
	}

	private static boolean divisionTheRemainder(int firstNumber,int secondNumber){
		
		if(firstNumber%secondNumber == 0) return true;
		else return false;
	}
}
