public class Main {
  public static void main(String[] args) {
    int[] a = {0,0,0,6,3,0,5,0,6};
    int i = 0;
		System.out.print("\nOriginal array: ");
		for (int n : a)
      System.out.print(n+"  ");
    for(int j = 0, l = a.length; j < l;) {
      if(a[j] == 0)
        j++;
      else {
        int t= a[i];
        a[i] = a[j];
        a[j] = t;
        i++;
        j++;
      }
    }
    while (i < a.length)
      a[i++] = 0;
		System.out.print("\nAfter moving 0's to the end of the array: ");
    for (int n : a)
      System.out.print(n+"  ");
			System.out.print("\n");
  }
}
