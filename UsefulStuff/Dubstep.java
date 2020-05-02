public class Dubstep {
  public static String SongDecoder (String song)
  {
    return(song.replaceAll("(WUB)+", " ").trim());
    //finds all "WUB"s in a row and replaces them all with a " "
   }
}
