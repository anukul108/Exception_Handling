import java.util.InputMismatchException;
import java.util.Scanner;

public class expection {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        try
        {
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                try {
                    arr[i] = sc.nextInt();
                }
                catch (InputMismatchException e)
                {
                    System.out.println(e);
                    System.exit(1);
                }
            }
            System.out.println("enter the index of the array element you want to access");
            System.out.println("the element is = " + arr[sc.nextInt()]);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }

    }
}
