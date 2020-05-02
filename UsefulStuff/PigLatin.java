public class PigLatin {
    public static String pigIt(String str) {
        // Write code here
      String[] split = str.split(" ");
      System.out.println(str);

      String pl;
      String word = "";
      for (int i = 0; i < split.length; i++){
        pl = split[i];
        
        if (pl.matches("[^A-Za-z0-9]")) //I found how to match non-alphanumeric characters after I submitted my kata rip
          word += pl;
        else
          word += pl.substring(1) + pl.charAt(0) + "ay ";
      }
        System.out.println(word);
      
      return word.trim();
        
    }
}
