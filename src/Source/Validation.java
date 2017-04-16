/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Source;

import java.util.regex.Pattern;

/**
 *
 * @author Sachin
 */
public class Validation {
    
     String email;
     
     
     public static boolean isEmpty(String a)
{
         return a.equals("")||a==null;
	
}
            
    public static boolean emailvalidation(String email)
    {   
        
        boolean checkAt  = false;
        boolean checkDot = false;
        boolean checkDotPos = false;
        
        int atIndex = -1;
        int dotIndex = -1;
        
        for(int i = 0 ; i <email.length() ; i ++)
        {
            if(email.charAt(i) == '@')
            {
                atIndex = i;
                checkAt = true;
            }
        }
        
        for(int i = 0 ; i < email.length(); i++)
        {
            if(email.charAt(i) == '.')
            {
                dotIndex = i;
                checkDot = true;
            }
        }
        
        
        if(atIndex <dotIndex)
        {
            checkDotPos = true;
        }
        
         return checkAt == true && checkDot == true && checkDotPos == true;
        
        
    }
    
    
    public static boolean validatetext(String name)
{
	boolean isName=false;
	for(int a=0;a<name.length();a++)
	{
		
            
             if (!(Pattern.matches("^[\\p{L} .'-]+$", name))) {
                    
                isName=true;
                break;
            }  
	}
	return isName; 
}
    
    public static boolean validatenumbers(String tel)
{
	boolean isTel=false;
	for(int a=0;a<tel.length();a++)
	{
		char c=tel.charAt(a);
		if(!Character.isDigit(c))
		{
			isTel=true;
			break;	
		}	
        

	}
	return isTel; 
}
}
