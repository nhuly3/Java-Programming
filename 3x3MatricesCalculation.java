import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("Enter values for the matrix 3 x 3 (1): ");
    Scanner input = new Scanner(System.in);
    double[][] m1 = new double[3][3];
    double[][] m2 = new double[3][3];
    for (int r1 = 0; r1 < m1.length; r1++) {
      for (int c1 = 0; c1 < m1[0].length; c1++) {
        m1[r1][c1] = input.nextDouble();
      }
    }
    System.out.println("Enter values for the matrix 3 x 3 (2): ");
    for (int r2 = 0; r2 < m2.length; r2++) {
      for (int c2 = 0; c2 < m2[0].length; c2++) {
        m2[r2][c2] = input.nextDouble();
      }
    }
    if (m1[0].length == m2.length) {
      double[][] a = mul(m1, m2);
      System.out.println("The answer is: ");
      for (int i = 0; i < m1.length; i++) {
        for (int j = 0; j < m2[0].length; j++) {
          System.out.print(a[i][j] + "  ");
        }
        System.out.println();
      }
    } 
    else {
      System.out.println("The matrices cannot be calculated.");
    }

  }
    
  public static double[][] mul(double[][] b, double[][] c) {
    double[][] a = new double[b[0].length][c.length];
    for (int i = 0; i < b.length; i++) {
      for (int j = 0; j < c[0].length; j++) {
        for (int k = 0; k < b[0].length; k++) {
          a[i][j] += b[i][k] * c[k][j];
        }
      }
    }
    return a;
  }
}
