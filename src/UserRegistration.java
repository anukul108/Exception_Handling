import java.util.Scanner;

class InvalidCountryException extends Exception{
    public String toString(){
        return "InvalidCountryException";
    }
}
public class UserRegistration {


        void register (String username, String userCountry) {
            try {

                if (userCountry.equals("India")==false) {
                    throw new InvalidCountryException();
                }
                System.out.println("User registration done successfully");
            }
            catch(InvalidCountryException e){
                System.out.println(e);
                System.out.println("User Outside India cannot be registered");
            }
        }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        UserRegistration obj=new UserRegistration();

        System.out.println("Enter the first username and Country name");
        obj.register(sc.next(),sc.next());
        System.out.println("Enter the second username and Country name");
        obj.register(sc.next(),sc.next());
    }




}
