package simon;
import java.util.ArrayList;

public class ArrayHolder {
    private ArrayList<Integer> myArrayList;

    public ArrayHolder() {
        myArrayList = new ArrayList<>();
    }

    public  void addToArrayList(int value) {
        myArrayList.add(value);
    }
    

    public  ArrayList<Integer> getArrayList() {
        return myArrayList;
    }
    
    public int get(int index) {
    	return myArrayList.get(index);
    }
}

