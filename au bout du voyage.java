import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.*;


public class Solution {
    
     public static long unf(long[] coglo, int n, int k)
    {
        int i;
        double min = Double.POSITIVE_INFINITY;
        long sub = 0;

        for(i = 0; i+(k-1) < n; i++)
        {
            sub = Math.abs(coglo[i] - coglo[i+(k-1)]);
            if(sub < (int)min)
                min = sub;                  
        }     

        return (long)min;

    }
   public static void main(String[] args) throws NumberFormatException, IOException {

      int n, k, i;
        long[] coglo;
    	Scanner sc;
    	PriorityQueue<Long> attent = new PriorityQueue<Long>();

    	sc = new Scanner(System.in);

    	n = sc.nextInt();
    	k = sc.nextInt();

      for (i = 0; i< n; i++) {
    		attent.add(sc.nextLong());
    	}

    	coglo = new long[n];


    	for (i=0; i<n; i++) {
    		coglo[i] = attent.poll();
    	}

        System.out.println(unf(coglo, n, k));
     
       
       
      

   }
}
