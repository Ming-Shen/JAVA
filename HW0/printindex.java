import java.util.Scanner;

public class printindex {
    public static void printindex1 (String str){
        for (int i = 0; i < str.length(); i ++){
            System.out.print(str.charAt(i));
            System.out.print(str.length()-i-1);
        }
        System.out.println("");
    }
    
    public static void main(String[] args){
        Scanner inputstr = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter a string:");

        String str = inputstr.nextLine();
        printindex1(str);
    }
}
