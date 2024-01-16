import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Parameter of the Square");
        System.out.println("Enter the lenght: ");
        int lenght = input.nextInt();
        System.out.println("Enter the breath: ");
        int breath = input.nextInt();
        System.out.println("Parameter of the square: " + (2*(lenght + breath)));
    }
}