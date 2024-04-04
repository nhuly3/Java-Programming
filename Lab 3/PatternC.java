beclass Main {
  public static void main(String[] args) {
    System.out.println("Pattern C");
    for (int r = 1; r <= 6; r++) {
      for (int p = 1; p <= 6 - r; p++) {
        System.out.print("  ");
      }
      for (int c = 1; c <= r; c++) {
        System.out.print(c + " ");
      }
      System.out.println();
   }
  }
}
