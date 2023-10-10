public class startriangle {
    public static void method1(){
        System.out.print("*");
    }
    public static void main(String[] args){
        for (int i = 0; i < 5; i ++){
            for (int j = 0; j <= i ; j ++){
                method1();
            }
            System.out.println("");
        }
    }
}
