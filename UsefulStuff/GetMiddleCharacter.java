class Kata {
  public static String getMiddle(String word) {
    //Code goes here!
    String[] arr = word.split("");
    int length = arr.length;
    
    String result;
    int front;
    
    if (length % 2 == 0){
      front = length/2;
      result = arr[front-1] + arr[front];
    }
    else{
      front = (length-1)/2;
      result = arr[front];
    }
    return result;
  }
}
