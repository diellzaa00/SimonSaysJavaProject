package simon;

import java.util.*;
import java.awt.*;
import java.lang.reflect.Array;

/**
 * Represents a random pattern of integers
 */
public class Pattern {
    private int length;

    private Random random;

 

    /**
     * Creates a new pattern with random integers and given length
     * @param len   length of the pattern
     */
    public Pattern(int len) {
    	  length = len;
          random = new Random();
        //  previousPattern = new ArrayList<Integer>();
    }

        
           
    

    /**
     * Get the element of the pattern at specified index
     * @param index     index in the pattern
     * @return  element of pattern in the given index. If index is invalid, returns -1
     */
    public int getAtIndex(int index) {
        if (index < 0 || index >= length)
            return -1;
    	JustGeneratePattern g = new JustGeneratePattern();
        return g.pattern.get(index);
    }

    public void increaseLevel() {
    	JustGeneratePattern g = new JustGeneratePattern();
    	g.createPattern(length);
        length++;
    }
    /**
     * @return  length of the pattern
     */
    public int getLength() {
        return length;
    }
}
