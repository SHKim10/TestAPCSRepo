public class Demo{
  //Java 9
  public static void printLoop(int n){
    for(int i = 1; i <= n; i++){
      for(int j = i - 1; j < n; j++){
        System.out.print(i);
      }
      System.out.println();
    }
  }
  public static void main(String[] args){
    printLoop(5);
  }
  //Java 10
  public static String arrToString(int[] arr){
    String answer = "{";
    for (int i = 0; i < arr.length; i++){
      answer = answer + arr[i];
      if (i < arr.length-1){
        answer = answer + ", ";
      }
    }
    return answer + "}";
  }
  public static String arrayDeepToString(int[][] arr){
    String answer = "{";
    for (int i = 0; i < arr.length; i++){
      answer += "{";
      for (int j = 0; j < arr[i].length; j++){
        answer += arr[i][j];
        if (j < arr[i].length-1){
          answer = answer + ", ";
        }
      }
      if (i < arr.length-1){
        answer = answer + "}, ";
      }
    }
    return answer + "}}";
  }
  public static int[][] create2DArray(int rows, int cols, int maxValue){
    int[][] arr = new int[rows][cols];
    for (int i = 0; i < rows; i++){
      for (int j = 0; j < cols; j++){
        maxValue = (int) (maxValue*Math.random());
        arr[i][j] = maxValue;
      }
    }
    return arr;
  }
  public static int[][] create2DArrayRandomized(int rows, int cols, int maxValue){
    int[][] arr = new int[rows][];
    for (int i = 0; i < rows; i++){
      cols = (int) (cols*Math.random());
      arr[i] = new int[cols];
      for (int j = 0; j < arr[i].length; j++){
        maxValue = (int) (maxValue*Math.random());
        arr[i][j] = maxValue;
      }
    }
    return arr;
  }
}
