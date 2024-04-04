import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("1. A password must have at least eight characters. ");
    System.out.println("2. A password consists of only letters and digits. ");
    System.out.println("3. A password must contain at least two digits ");
    System.out.print("Input a password (You are agreeing to the above Terms and Conditions): ");
    String p = input.nextLine();
    if(valid(p)) {
      System.out.println("Password is valid: " + p);
    }
    else {
      System.out.println("Invalid password");
    }
  }
  public static final int length = 8;
  public static boolean valid(String password) {
    if(password.length() < length) return false; 
    int charc = 0; 
    int numc = 0;
    for(int y = 0; y < password.length(); y++) {
      char ch = password.charAt(y);
      if(number(ch)) 
        numc++;
      else if(letters(ch)) 
        charc++;
      else return false;
    }
    return(charc >= 2 && numc >= 2);
  }
  public static boolean letters(char ch) {
    ch = Character.toUpperCase(ch);
    return(ch >= 'A' && ch <= 'Z');
  }
  public static boolean number(char ch) {
  return(ch >= '0' && ch<= '9');
  }
}
