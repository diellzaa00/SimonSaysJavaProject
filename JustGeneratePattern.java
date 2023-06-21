package simon;

import java.util.ArrayList;
import java.util.Random;

public class JustGeneratePattern {
	   public static ArrayHolder pattern = new ArrayHolder();

	
	    public static void createPattern(int length) {
	    Random random = new Random();
	    if (length == 1) {
			   pattern = new ArrayHolder();
		   }
		   pattern.addToArrayList(random.nextInt(4));
	  
	    }
	    

}
