import java.util.*;

public class Main {
  public static int minGap(int[] a) {
    int i,gap;
    if(a.length <2)
      return (0);
    else {
      gap = a[1] - a[0];
      for (i=0;i<a.length-1;i++) {
        if(gap > a[i+1] - a[i])
          gap = a[i+1] - a[i];
      }
    }
    return (gap);
  }
  public static void main(String[] args) {
    int n,i,d;
    Scanner input=new Scanner (System.in);
    System.out.print("Enter how many numbers in the array: ");
    n=input.nextInt();
    int a[]=new int[n];
    System.out.print("int[] array = ");
    for (i=0;i<a.length;i++) {
      a[i]=input.nextInt();
    }
    d= minGap(a);
    System.out.println("Minimum gap is "+d);
  }
}
