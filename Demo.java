public class Demo{
  public static void printLoop(int n){
    for(int i = 1; i <= n; i++){
      for(int j = i - 1; j < n; j++){    //OR (int j = 0; j < n - i + 1;j++)
        System.out.print(i);
      }
      System.out.println();
    }
  }
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
}
