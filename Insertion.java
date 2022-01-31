import java.util.ArrayList;
public class Insertion {
	ArrayList<Integer> array;
	public Insertion(ArrayList<Integer> arr) {
		array=arr;
	}
	
	
	public double getAverage() {
		double sum = 0;
		for(int i = 0; i<array.size();i++) {
			sum = sum+array.get(i);
		}
		
		return sum/array.size();
	}
	
	public String getMode() {
		String output = "";
		int number = array.get(0);
	    int frequency = 1;
	    int maxFrequency = 1;
	    for (int i = 1; i < array.size(); i++) {
	      if (array.get(i) == number) {
	        frequency++;
	        if (frequency > maxFrequency) {
	          maxFrequency = frequency;
	        }
	      } else {
	        number = array.get(i);
	        frequency = 1;
	      }
	    }
	    output += "Mode: ";
	   
	    number = array.get(0);
	    frequency = 1;
	    for (int i = 1; i < array.size(); i++) {
	      if (array.get(i) == number) {
	        frequency++;
	        if (frequency == maxFrequency) {
	        	output += number + " ";
	        	;
	        }
	      } else {
	        number = array.get(i);
	        frequency = 1;
	      }
	    }
	   
	   
	   if(output.equals("Mode: ")) {
		   return "There is no mode";
	   }
	   
	   return output;
	  }
	
	public double getMedian() {
		if(array.size()%2==0) {
			return (array.get(array.size()/2) + array.get(array.size()/2 - 1))/2.0;
		}
		
		return array.get(array.size()/2);
		
		
		
	}
	
	public double getSD(double mean) {
		

        double squareSum = 0;

        for (int i = 0; i < array.size(); i++)
        {

            squareSum += Math.pow(array.get(i) - mean, 2);

        }

        return Math.sqrt((squareSum) / (array.size() - 1));

    }
		
		
		
}
	
	

