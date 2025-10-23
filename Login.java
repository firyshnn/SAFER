import java.util.Scanner;

public class Login {
  public static void main (String [] args){
    Scanner sc = new Scanner (System.in);
    String username;
    int password;

    System.out.print("Enter username: ");
    username = sc.nextLine();
    System.out.print("Enter password: ");
    password = sc.nextInt();

    while (password != 12345678){
      System.out.print("Incorrect password, please try again");
      System.out.print("Enter password: ");
      password = sc.nextInt();
    }
  }
}
