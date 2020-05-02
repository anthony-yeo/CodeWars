public class BraceChecker {
  public boolean isValid(String braces) {
    int count = 0;
    
    if(braces.length() % 2 != 0){
      return false;
    }
    else if(braces.length() == 0){
      return true;
    }
    else{
      while(count <= braces.length() + 10){ //I just put 10 because I was tired of the program not working
        braces = braces.replace("()", "").replace("{}", "").replace("[]", "");
        count++;
        System.out.println(braces);
        }
      }
      if(braces.length() == 0){
        return true;
      }
      else{
        return false;
      }
  }
}

/*
      b = b.replaceAll("\\(\\)", "");
      b = b.replaceAll("\\[\\]", "");
      b = b.replaceAll("\\{\\}", "");
      
      I guess this works by replacing all pairs if they're even amount away but I don't know
   
*/
