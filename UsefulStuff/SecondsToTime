public class HumanReadableTime {
  public static String makeReadable(int seconds) {
    int h = seconds / 3600;
    int m = seconds % 3600 / 60;
    int s = seconds % 60;

    String hours = h + "";
    if (h < 10)
      hours = 0 + hours;
    String minutes = m + "";  
    if (m < 10)
      minutes = 0 + minutes;
    String second = s + "";
    if (s < 10)
      second = 0 + second; 
    String time = hours + ":" + minutes + ":" + second;
    return time;
  }
}
