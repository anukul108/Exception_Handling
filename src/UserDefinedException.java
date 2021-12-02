import java.util.Scanner;

class NegativemarksException extends Exception{
    public String toString(){
        return "marks can not be negative";
    }
}
class OutOfRange extends Exception{
    public String toString(){
        return "marks is out of range";
    }
}

public class UserDefinedException {

    public static void m1()
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<2;i++){
            int marks[]=new int[3];
            String studname;
            int sum=0;
            try {
                System.out.println("enter the student name");
                studname = sc.next();
                System.out.println("enter the marks of student");
                for (int j = 0; j < 3; j++) {
                    marks[j] = sc.nextInt();
                    if (marks[j] < 0) {
                        throw new NegativemarksException();
                    }
                    if (marks[j] > 100) {
                        throw new OutOfRange();
                    }
                    sum=sum+marks[j];
                }
            }
            catch (NegativemarksException e){
                System.out.println(e);
            }
            catch (OutOfRange e){
                System.out.println(e);
            }
            System.out.println("sum is "+sum);
            System.out.println("average is "+sum/3);


        }

    }

    public static void main(String[] args) {
        m1();
       }

}
