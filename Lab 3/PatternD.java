class Main {
  public static void main(String[] args) {
    System.out.println("Pattern D");
    for (int r = 1; r <= 6; r++) {
      for (int p = r; p > 1; p--) {
        System.out.print("  ");
      }
      for (int c = 1; c <= 7 - r; c++) {
        System.out.print(c + " ");
      }
      System.out.println();
    }
  }
}
