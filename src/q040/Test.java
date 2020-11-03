package q040;

public class Test {

	public static void main(String[] args) {
		int numbers[] = {12, 13, 42, 32, 15, 156, 23, 51, 12};
		int[] keys = findMax(numbers);
		Test t = new Test();
		t.getNum();
		// 1. object is not created to invoke the method, so method should be:     static____findMax();{
	}
		static int[] findMax(int[] numbers) {
		int[] keys = new int [3];  								
		//2. parameter of the method must be int array:    static____findMax(int [] numbers);{	
		/* code goes here */
		return keys; 														
		// 3. return type should be int array:    static int[] findMax (int [] numbers)	;{
		}

		int getNum(){

			return 3;

		}

}

//Which method signature do you use at line n1?
//A.	public int findMax (int[] numbers)
//B.	static int[] findMax (int[] max)								// Answer: B
//C.	static int findMax (int[] numbers) 							 
//D.	final int findMax (int[] )
