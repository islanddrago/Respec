/* mathMethod.java
 */

/* mathMan accepts an integer array as an arguement
 * mathMan determines the # of elements in array (# of employees)
 * and calculates and returns the average steps per employee.
 * */
    public class mathMethod
    {
	public static int mathMan(int empStep[]){
	    int employeeCount = empStep.length;
            int total = 0;
	    int i = 0;
	    while(i<employeeCount)
	    {
	        total+=empStep[i];
	        i++;
	    }
	    int average = total/employeeCount;
            //System.out.println("Average = " + average);	
	    return average;
	}
    }
