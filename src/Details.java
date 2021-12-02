import java.util.Scanner;

class IncorrectAge extends Exception{
    public String toString(){
        return "IncorrectAge";
    }
}

public class Details {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        try {
            int age;
            String name;
            System.out.println("enter name ");
            name=sc.next();
            System.out.println("enter age ");
            age= sc.nextInt();

            if(age < 18 || age > 60){
                throw new IncorrectAge();
            }
            System.out.println("name "+name);
            System.out.println("age "+age);

        }

        catch (IncorrectAge e){
            System.out.println(e);
        }
    }
}
