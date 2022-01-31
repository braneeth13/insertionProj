import java.lang.reflect.Array;
import java.util.ArrayList;
import java.text.DecimalFormat;
import javax.swing.*;
import BreezySwing.*;


public class InsertionGUI extends GBFrame{ 
	
		
	 	JButton inputNumber = addButton ("Input Number", 2 ,1, 1, 1 );
	 	IntegerField number = addIntegerField(0, 1, 1, 1,1);
	 	
		
	 	int count = 0;
	 	
	 	JButton average = addButton("Output average", 3, 1, 1, 1);
	 	JButton mode = addButton("Output mode", 3, 2, 1, 1);
	    JButton median = addButton("Output median", 3, 3, 1, 1);
	    JButton standardDeviation = addButton("Output Standard Deviation", 3, 4, 1, 1);
	    
	    JButton reset = addButton ("Reset list", 4, 1, 1, 1);
	    JButton outputAll = addButton("Output list in order", 4, 2, 1, 1);
	 	ArrayList <Integer> list = new ArrayList<>();
	    
	    public void buttonClicked(JButton buttonObj){ 
	    	Insertion array = new Insertion(list);
	    	if(count<25) {
	    		if(buttonObj == inputNumber && number.isValidNumber()) {
		    		count ++;
		    		list.add(number.getNumber());
		    		
		    		insertionSort(list);
		    		
		    		
		    	} else if(buttonObj == inputNumber && !number.isValidNumber()) {
		    		messageBox("Not a valid number entered: Please try again", 200, 500);
		    	}
	    	}
	    	
	   
	    	
	    	
	    	if(buttonObj == average) {
	    		Insertion array1 = new Insertion(list);
	    		messageBox(array1.getAverage() + "");
	    	}
	    	
	    	if(buttonObj == mode) {
	    		Insertion array1 = new Insertion(list);
	    		messageBox(array1.getMode() + "");
	    	}
	    	
	    	if(buttonObj == median) {
	    		Insertion array1 = new Insertion(list);
	    		messageBox(array1.getMedian() + "");
	    	}
	    	if(buttonObj == reset) {
	    		list.clear();
	    		messageBox("List has been cleared");
	    	}
	    	
	    	if(buttonObj == outputAll) {
	    		messageBox(list);
	    	}
	    	
	    	if(buttonObj == standardDeviation) {
	    		Insertion array1 = new Insertion(list);
	    		messageBox(array1.getSD(array1.getAverage()) + "");
	    	}
	    	
	    	
	    }
	    	
	    
	    
	    // Insertion Sort Algorithm
	    public static void insertionSort(ArrayList<Integer> array) {
	      int n = array.size();
	      for (int i = 1; i < n; i++) {
	        int key = array.get(i);
	        int j = i - 1;
	        while (j >= 0 && array.get(j) > key) {
	          array.set(j + 1, array.get(j));
	          j--;
	        }
	        array.set(j + 1, key);
	      }
	    }

	    public static void main(String[] args){
	    	
	        JFrame frm = new InsertionGUI();
	        frm.setTitle ("Insertion");
	        frm.setSize (700, 200);
	        frm.setVisible (true);
	   }

}
