// Program -3
// Write a program when supplied with a multiple line of input, count the number of lines, 
// words and vowels in the text. For the purposes of this program, a word is any sequence of 
// characters delimited by spaces, tabs and newlines.

public class Count {

    static void vowels(String str){
        int vowelCount = 0 ,wordCount = 0, lineCount=1;
 
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                vowelCount++;
            }
        }
        System.out.println("Total no of vowels in string are: " + vowelCount);
        
        for (int i = 0; i < str.length(); i++) {
            if (((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' '))) {
                wordCount++;
            }
        }
        System.out.println("Total no of Words in the string are: " + wordCount);

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '\n') {
                lineCount++;
            }
        }
        System.out.println("Total number of lines in the string are: " + lineCount);
        
    }
    public static void main(String[] args) {

        String str = ("hello world \n Good Morning \t Have a nice day");
        System.out.println(str);
        vowels(str);

    }
}
