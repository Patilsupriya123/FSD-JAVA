package LongestIncreasingSubsequence;

public class LongestIncreasingSubsequence1 {
	
	    static int list(int array[], int num)
	    {
	        int list[] = new int[num];
	        int i, j, max = 0;
	  
	        // Initialize LIS values for all indexes 
	        for (i = 0; i < num; i++)
	            list[i] = 1;
	  
	        //Compute optimized Longest Increasing Subsequence values
	        for (i = 1; i < num; i++)
	            for (j = 0; j < i; j++)
	                if (array[i] > array[j] && list[i] < list[j] + 1)
	                    list[i] = list[j] + 1;
	  
	        //maximum of all Longest Increasing Subsequence values 
	        for (i = 0; i < num; i++)
	            if (max < list[i])
	                max = list[i];
	  
	        return max;
	    }
	  
	    public static void main(String args[])
	    {
	        int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 };
	        int number = arr.length;
	        System.out.println("Length of list  is " + list(arr, number) + "\n");
	    }
	

}
