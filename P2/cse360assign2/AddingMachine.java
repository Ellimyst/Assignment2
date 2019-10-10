//Sumukh Vaze
//CSE 360
//Assignment 2

package cse360assign2;

//AddingMachine adds or subtracts values to a total which it returns.
public class AddingMachine {

	//int to store total
	private int total;
	
	//string to store history
	private String history;
	
	//constructor
	public AddingMachine () {
		total = 0;  // not needed - included for clarity\
		history = "0";
	}
	
	//get total
	public int getTotal () {
		return total;
	}
	
	//add value to total
	public void add (int value) {
		//add value to total and add operation to history
		total += value;
		history = history +" + " +value;
	}
	
	//subtract value from total
	public void subtract (int value) {
		//subtract value from total and add operation to history
		total -= value;
		history = history +" - " +value;
	}
		
	//return history
	public String toString () {
		return history;
	}

	//reset total to 0
	public void clear() {
		total = 0;
		history = "0";
	}
}
