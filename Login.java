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

    while (!username.equals("SAFERuser") || !password.equals("SAFERuser01")){
      System.out.println("Incorrect username or password, please try again");
      System.out.print("Enter username: ");
    username = sc.nextLine();
    System.out.print("Enter password: ");
    password = sc.nextLine();
    }
  }
}
