import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.print("Enter the string: ");
    Scanner input = new Scanner(System.in);
    String str = input.nextLine();
    int[] v = vowelCount(str);
    System.out.print("Number of each vowel: ");
    for (int i = 0; i < v.length; i++) {
      System.out.print(v[i] + " ");
    }
  }  
  public static int[] vowelCount (String str) {
    int[] a = new int[5];
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'a') {
        a[0]++;
      } else if (str.charAt(i) == 'e') {
        a[1]++;
      } else if (str.charAt(i) == 'i') {
        a[2]++;
      } else if (str.charAt(i) == 'o') {
        a[3]++;
      } else if (str.charAt(i) == 'u') {
        a[4]++;
      }
    }
    return a;
  }
}
