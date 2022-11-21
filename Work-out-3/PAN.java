// Program - 4
// Implement a java program to check the validity of the PAN Card number. The fifth letter of the PAN 
// card should be the first letter of the name of the PAN card Holder. Raise an user defined exception 
// named withInvalidPanException and display the relevant message.

import java.util.Scanner;

class withInvalidPanException extends Exception  
{  
    public withInvalidPanException (String str)  
    {   
        super(str);
    }  
}  
  
public class PAN 
{  
    static void validate (String name, String pan) throws withInvalidPanException{   
       if(name.charAt(0) == pan.charAt(4)){  
            System.out.println("Your PAN Is Valid");
            System.out.println("Name:"+name);
            System.out.println("PAN Number:"+pan);
    }  
       else {   
        throw new withInvalidPanException("Your Pan Is Invalid!!!");    
        }   
     }    
    public static void main(String args[])  
    {  
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Name:");
        String name = sc.nextLine();
        System.out.println("Enter Your PAN NUmber:");
        String pan = sc.nextLine();

        name = name.toLowerCase();
        pan = pan.toLowerCase();

        try   
        {   
            validate(name, pan);  
        }  
        catch (withInvalidPanException e)  
        {  
            System.out.println("Exception occured: " + e);  
        }  
        sc.close();   
    }  
}  