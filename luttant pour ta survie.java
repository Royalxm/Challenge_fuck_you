import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
public static int compteurChar(String str, char ch) 
	{
  	int compteur = 0;                  
  	for (int i = 0; i < str.length(); i++) 
    if (str.charAt(i) == ch)             
       compteur++;                         
  	return compteur;   
	}

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        String deja ="";
         String deja2 ="";
        String inputString = myScan.nextLine();
       int length = inputString.length();
       
        // Assign ans a value of YES or NO, depending on whether or not inputString satisfies the required condition
      
			//Affucher le résultat
        int i2 = 0;
        for(int i = 0;i != length;i++)
            {
            char firstLetter = inputString.charAt(i);
            int nbr_occur=compteurChar(deja2, firstLetter);
            
            if(nbr_occur == 1)
                {
                
                 }
            else
                {
                 deja=Character.toString(firstLetter); 
                 deja2 += deja;
                  nbr_occur=compteurChar(inputString, firstLetter) % 2;
                if(nbr_occur == 1)
                i2++;
                
                
                
            }
            
            
            
            
            
            
            
            
            
         
         }
        
       if(i2 == 1 || i2 == 0)
           System.out.println ("YES");
        else
             System.out.println ("NO");
     
     
        myScan.close();
    }
}
