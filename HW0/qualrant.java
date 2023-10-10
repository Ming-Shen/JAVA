import java.util.Scanner;

public class qualrant {
    public static void qual (double x , double y){
        if (x>0 && y>0){
            System.out.println("1");
        }
        else if (x>0 && y<0){
            System.out.println("4");
        }
        else if (x<0 && y<0){
            System.out.println("3");
        }
        else if (x<0 && y>0){
            System.out.println("2");
        }
        else {
            System.out.println("0");
        }
    }
    
    public static void main(String[] args){
        Scanner inputx = new Scanner(System.in);
        System.out.println("Enter a x:");
        double x = inputx.nextDouble();

        Scanner inputy = new Scanner(System.in);
        System.out.println("Enter a y:");
        double y = inputy.nextDouble();

        qual(x,y);
    }


}
