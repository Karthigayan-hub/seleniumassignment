package week1.day2;

public class ChangeOddIndexToUppercase {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test = "changeme";
	      char[] chr = test.toCharArray();

// Length = 7 (0 to7)
	      for (int i = 0; i < chr.length; i++) {
    	      	  
	    	  if (i%2==0) {
	    		  chr[i] = Character.toUpperCase(chr[i]);
	    		  
				System.out.print(chr[i]);
			}
	    	  else
	    	  {System.out.print(chr[i]);
	    		  }
	    	  }
	}

}

