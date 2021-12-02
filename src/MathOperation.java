import java.util.Scanner;


public class MathOperation {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        try {
            int sum = 0,n;
            n=args.length;

            int arr[] = new int[n];


            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(args[i]);
                sum = sum + arr[i];

            }
            System.out.println("sum of array elements = " + sum);
            System.out.println("average of array elements = " + sum / 5);
        }
        catch (NumberFormatException e){
            System.out.println(e);
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
    }
}
