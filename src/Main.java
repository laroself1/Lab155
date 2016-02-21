import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter a number: ");
        int X = reader.nextInt();
        int i = 1;
        int sum =0;
        for (i = 1; i <= X; i++) {
            sum +=i;        }
        int aver= sum/X;
        System.out.println("sum: " + sum);
        System.out.println("average: " + aver);}}