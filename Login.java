import java.util.Scanner;

public class Login {
  public static void main (String [] args){
    Scanner sc = new Scanner (System.in);
    String username;
    String password;

    System.out.print("Enter username: ");
    username = sc.nextLine();
    System.out.print("Enter password: ");
    password = sc.nextLine();

    while (!password.equals("SAFERuser")){
      System.out.println("Incorrect password, please try again");
      System.out.print("Enter password: ");
      password = sc.nextLine();
    }
  }
}
