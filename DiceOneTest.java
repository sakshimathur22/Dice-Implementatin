import java.util.Scanner;


public class DiceOneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DiceOne diceobj;
		//Scanner sc=new Scanner(System.in);
		System.out.println("enter type of die"); 
			java.util.Scanner sc = new java.util.Scanner(System.in); 
	 	int type= sc.nextInt(); 
		              diceobj = new DiceOne(type);  
		        
		        System.out.println("result after roll is = "+ diceobj.getDie(type));	 
		 		 

	}

}
