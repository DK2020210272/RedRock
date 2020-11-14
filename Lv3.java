import java.util.Scanner;
public class Lv3 {
        public static void main(String[] args) {
                for(int i=0;;i++) {
                        Scanner sc = new Scanner(System.in);
                        String x = sc.nextLine();
                        plus Plus = new plus();
                        subtraction Subtraction = new subtraction();
                        multiplication Multiplication = new multiplication();
                        division Divison = new division();
                        Plus.getT(x);
                        Subtraction.getT(x);
                        Multiplication.getT(x);
                        Divison.getT(x);
                        //多线程
                        Thread i1 = new Thread(Plus);
                        Thread i2 = new Thread(Subtraction);
                        Thread i3 = new Thread(Multiplication);
                        Thread i4 = new Thread(Divison);
                        i1.start();
                        i2.start();
                        i3.start();
                        i4.start();
                }
        }
}

