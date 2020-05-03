import java.lang.StringBuilder;
class Solution{

  static String toCamelCase(String s){
    String[] split = s.split("[^A-Za-z0-9]");

    for (int i = 1; i < split.length; i++){
      split[i] = split[i].substring(0, 1).toUpperCase() + split[i].substring(1);
    }
    String fin = "";
    for(String element : split){
      fin += element;
    }
    return fin;
  }
}
