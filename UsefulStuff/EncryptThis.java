public class Kata {
    public static String encryptThis(String text) {
      if (text.length() == 0){
        return text;
      }
      else{
        String[] split = text.split(" ");
  
        String build = "";
    
        for(int i = 0; i < split.length; i++){
          build += (int) split[i].charAt(0);
          if(split[i].length() > 2){
            build += split[i].charAt(split[i].length() - 1);
            if(split[i].length() > 3)
              build += split[i].substring(2, split[i].length() - 1);
            build += split[i].charAt(1);
          }
          else if(split[i].length() == 2){
            build += split[i].charAt(1);
          }
          build += " ";
        }
        System.out.println(build);
        return build.trim();
      }
    }
}
