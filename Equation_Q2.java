/*
 * Simple representation of the equation 
 * should takea number of queries = q 
 * a , b, c values from the terminal.
 */

// This is an example for the git

public class Equation_Q {
	public static void main(String[] args) {

		System.out.println(
				" This is  simple program to create a sample output based on the equation  values :  a , b, n \n");
		System.out.println(" Here :: it is taken as default for now .");

		/*
		 * variables
		 */
		int a = 0;
		int b = 2;
		int n = 10;
		/*
		 * looping n times
		 */

		int[] wholeComp;
		wholeComp = new int[50];
		int sumCompoent=0;
		for (int j = 0; j <n; j++) {
			// repeats the n-1 times
			
			//wholeComp[j] = a + seriesComp(b, j);
			sumCompoent = sumCompoent + seriesComp(b, j);
			wholeComp[j]=sumCompoent +a;
			//System.out.println("Validate1  ==>"+sumCompoent);
		}
	//	printArray(wholeComp);
		//System.out.println("validate 2  ==>" + sumCompoent);
	}

	
	private  void printArray(int[] wholeComp) {
		System.out.println("Printing the Array  \n");
		for(int i=0;i<wholeComp.length;i++) {
	
			System.out.println(wholeComp[i]);
		}
		
	}

	private static int seriesComp(int b, int j) {
		// power Caller validation
		if (j > 0) {
			System.out.println("PowerCaller");
			return powerOf2(j) * b;
			
		} else
			return 1*b;
	}

	private static int powerOf2(int j) {
		// Only Works for 2
		int k = 0;
		int powerResult = 1;
		while (k < j) {
			System.out.println("PowerCalculator");
	System.out.println(powerResult);
			powerResult = powerResult * 2;
			k++;
		}

		return powerResult;
	}

}
