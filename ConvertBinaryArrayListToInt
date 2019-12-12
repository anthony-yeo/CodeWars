import java.util.List;

public class BinaryArrayToNumber {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        // Your Code
        String result = "";
        String convert;
        int dec;
        
        for(int i = 0; i < binary.size(); i++){
          convert = String.valueOf(binary.get(i));
          result = result + convert;
        }
        
        dec = Integer.parseInt(result, 2);
        
        return dec;
        
    }
}

//Improved

/*
import java.util.*;
import java.util.List;

public class BinaryArrayToNumber {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
    
    String res = "";
    
    for (int i : binary)
            res += i; 
        
    return Integer.parseInt(res, 2);
    }
}
*/
