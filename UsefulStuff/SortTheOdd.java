import java.util.*;
public class Kata {
  public static int[] sortArray(int[] array) {
    ArrayList<Integer> odd = new ArrayList<>();
    ArrayList<Integer> index = new ArrayList<>();
    for(int i = 0; i < array.length; i++){
      if(array[i] % 2 != 0){
        odd.add(array[i]);
        index.add(i);
      }
    }
    Collections.sort(odd);
    
    for(int j = 0; j < index.size(); j++){
      //System.out.println(odd.get(j));
      array[index.get(j)] = odd.get(j);
    }
    
    return array;
  }
}
