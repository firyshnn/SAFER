import java.util.Scannner;

public class Login {
  public static void main (String [] args){
    Scanner sc = new Scanner (System.in);
    String username;
    String password;

    System.out.println("Enter username: ");
    username = sc.nextLine();
    System.out.println("Enter password: ");
    password = sc.nextLine();

    while (password != "12345678"){
      System.println("Incorrect password, please try again");
      password = sc.nextLine();
    }
  }
}
