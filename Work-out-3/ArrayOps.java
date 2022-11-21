// Program - 6
// Create a program to get an array size and elements as the input from the user. Get a 
// number from the user and search for the input number in the array and display “Found” or 
// “Not Found” message. Also display the sorted the array. (Note use separate method for 
// operations with necessary Exception handling).

import java.util.Scanner;

class elementNotFoundException extends Exception  
{  
    public elementNotFoundException (String str)  
    {   
        super(str);
    }  
}
class zeroElementException extends Exception  
{  
    public zeroElementException (String str)  
    {   
        super(str);
    }  
}

class ArrayOps{

    public void arraySearch(int [] arr, int searchElement) throws elementNotFoundException{
        int count = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]==searchElement){
                count++;
                break;
            }
        }
        if(count==0){
            throw new elementNotFoundException("Element Not Found!!!");    
        }else{
            System.out.println("Element Found");
        }
        
    }
    public void arraySort(int [] arr)throws zeroElementException{
        if(arr==0){
            throw new zeroElementException("Array is empty!!!");    
        }
        System.out.println("Array before sorting:");
        for(int i = 0 ; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        for (int i = 0; i < arr.length; i++){  
            for (int j = i + 1; j < arr.length; j++){  
                int tmp = 0;  
                if (arr[i] > arr[j]){  
                    tmp = arr[i];  
                    arr[i] = arr[j];  
                    arr[j] = tmp;  
                }  
            }
        }
        System.out.println("Array after sorting:");
        for(int i = 0 ; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int option;
        ArrayOps array = new ArrayOps();

        System.out.println("Enter the size of the array:");
        int arraySize = sc.nextInt();

        int[] arr = new int[arraySize];
        
        System.out.println("Enter the array elements:");

        for(int i = 0 ; i < arraySize; i++){
            arr[i] = sc.nextInt(); 
        }
        
        while(true){
            System.out.println("Enter Option\n1:Search in the array\n2:Sort the array\n0:Exit");
            option = sc.nextInt();
            if(option==1){
                System.out.println("Enter the element to search:");
                int searchElement = sc.nextInt();
                try{
                    array.arraySearch(arr, searchElement);
                }catch(elementNotFoundException e){
                    System.out.println("Exception occured: " + e);  
                }
            }else if(option == 2){
                try{
                    array.arraySort(arr);
                }catch(zeroElementException e){
                    System.out.println("Exception occured: " + e);  
                }
            }else if( option == 0){
                break;
            }else{
                System.out.println("Invalid option!!!! Try again");
            }
        }
        
        

    }
}