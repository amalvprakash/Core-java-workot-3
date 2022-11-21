// Program - 5
// Define a new exceptions, called ExceptionLineTooShort and ExceptionLineTooLong, 
// that prints out the error message "The input is too long" and "The input is too short". Write 
// a program that reads lines from user and throws an exception of type
// ExceptionLineTooLong and ExceptionLineTooShort in the case where a string of the file 
// is longer than 10 characters and shorter than 5 characters respectively. Create separate
// method for the length checking & exception throw and handle the exception appropriately.
import java.util.Scanner;

class ExceptionLineTooLong extends Exception{
    public ExceptionLineTooLong(String str){
        super(str);
    }
}
class ExceptionLineTooShort extends Exception{
    public ExceptionLineTooShort(String str){
        super(str);
    }
}
public class ShortLong {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine();
        int len=str.length();
        try {
            if(len>10){
                throw new ExceptionLineTooLong("The input is too long");
            }
            else if (len<5) {
                throw new ExceptionLineTooShort("The input is too short");
            }
            else{
                System.out.println("String length is Correct");
            }
        }
        catch (ExceptionLineTooLong el){
            System.out.println("Exception Caught "+el.getMessage());
        }
        catch (ExceptionLineTooShort es){
            System.out.println("Exception Caught "+es.getMessage());
        }
    }
}
