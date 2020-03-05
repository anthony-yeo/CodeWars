class Solution {

  public static String binaryToText(String s) {
  
  
     String str = "";

    for (int i = 0; i < s.length()/8; i++) {

        int a = Integer.parseInt(s.substring(8*i,(i+1)*8),2);
        str += (char)(a);
    }
return str;
  }

}
