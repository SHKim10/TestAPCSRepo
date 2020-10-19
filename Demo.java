public class Demo{
  public static void printLoop(int n){
    for(int i = 1; i <= n; i++){
      for(int j = i - 1; j < n; j++){    //OR (int j = 0; j < n - i + 1;j++)
        System.out.print(i);
      }
      System.out.println();
    }
  }
  public static void main(String[]args){
    printLoop(5);
  }
}
