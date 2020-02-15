/* Mathmatical.java
 */

/* Mathmatical accepts two arguements: int Score and String officeName
 * Score corresponds to the current total number of steps associated with officeName
 * Do we make a new function to average? Automatically Average? How do we know number of employees per office?
 * Maybe office class that holds current step total and average?
 * */
    package foo;
    public class mathMethod
    {
	public static void mathMan(int empStep[], int employeeCount){
            int total = 0;
	    int i = 0;
	    while(i<employeeCount)
	    {
	        total+=empStep[i];
	        i++;
	    }
	    int average = total/employeeCount;
            System.out.println("Average = " + average);	
	}
    }
