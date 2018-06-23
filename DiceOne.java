import java.util.Random;


public class DiceOne {
 int side;
int result;
public DiceOne(int side) { 
            this.side=side; 

        roll();   
    } 
      
    public void roll() { 
    	Random rand=new Random();
            if(side==6) 
	{              	result = (int)(Math.random()*6) + 1;
	//int results =rand.nextInt(side)+1;
	//System.out.println(results);
	
	
        	} 

 
	else if(side==4){ 
 		result = (int)(Math.random()*4) + 1; 

	}
 
else if(side==2){ 
 	result = (int)(Math.random()*2) + 1; 
 } 
    }
public String getDie(int n){ 
 		 
	if(n==2){ 
		switch(result){ 
 		case 1: return "HEADS"; 
 		case 2:return "TAILS"; 
 		} }
 		 


	else if(n==6){ 
		 			switch(result){ 
		 			case 1: return "ONE"; 
		 			case 2:return "TWO"; 
		 			case 3:return "THREE"; 
		 			case 4:return "FOUR"; 
		 			case 5: return "FIVE"; 
		 			case 6: return "SIX"; 
		 			}} 
else if(n==4){ 
		 				switch(result){ 
		 				case 1: return "ONE"; 
		 				case 2:return "TWO"; 
		 				case 3:return "THREE"; 
		 				case 4:return "FOUR"; 
		 				 
		 				} 
		 		} 
		 			//else 
		 				//return "Invalid Input"; 
					return null; 
			} 

	 
			}
	