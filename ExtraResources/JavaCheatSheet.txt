import java.lang.Math
  double abs(double a) : abs value of a
  
  double max(double a, double b) : max of a and b
  double min(double a, double b) : min of a and b
  
  double sin(double theta) : sine of theta
  double cos(double theta) : cos of theta
  double tan(double theta) : tan of theta
  
  double toRadians(double degrees) : angle from degrees to radians
  double toDegrees(double radians) : angle from radians to degrees
  
  double exp(double a) : exponential e^a
  double log(doubla a) : natural log
  double pow(double a) : to the power of a
  double sqrt(double a) : 
  
  long round(double a) : round to the nearest integer
  
  double random() : radnom number between [0, 1)
  double E : value of E (Constant) **Calculus
  double PI : value of pi (Constant)
  
Method -> Library -> return type -> value
  Integer.parseInt("123") -> Integer -> int -> 123
  Double.parseDouble("1.5") -> Double -> double -> 1.5
  Math.sqrt(25.0-16.0) -> Math -> double -> 3.0
  Math.log(Math.E) -> Math -> double -> 1.0
  Math.random() -> Math -> double -> [0, 1)
    (int)(Math.random() * range) + min; -> [min, range] **inclusive
  Math.max(1.0, 9.0) -> Math -> double -> 9.0
  Math.round(2.718) -> Math -> long -> 3
  (int) Math.round(2.718) -> Math -> int -> 3
  
Java Switch **Fancy if statements
  **example
  int day = 1;
  switch (day) {
    case 1:
      System.out.println("Monday");
      day++;
      //no break so swtich function will continue to operate until it meets a break function or the meets default statement
    case 2:
      System.out.println("Tuesday");
      day++;
    case 3:
      System.out.println("Wednesday");
      day++;
    case 4:
      System.out.println("Thursday");
      break;
     default:
      System.out.println("Done")
      //if no other conditions are met (if case 4 didn't exist and day went through 1-4)
  }
  
Arrays and ArrayLists*Grr
  String[] SUITS = {"A", "B", "C", "D"};
  //Initialize a premade array
  String[] SUITS = new String[int x];
  //Initialize an empty array
  
  Reverse the values in an array
    for (int i = 0; i < n/2; i++){
      double temp = array[i];
      array[i] = array[n-1-i];
      array[n-i-1] = temp;
    }
    
    Two-Dimensional Arrays
      Array[x][y]
        x = row
        y = column
        
        1 2 3 <- row x
        4 5 6
        7 8 9
            ^
            |
            column y
TO-DO
  **https://introcs.cs.princeton.edu/java/11cheatsheet/
    StdOut API
    STANDARD INPUT LIBRARY
    STANDARD FUNCTIONS
    STANDARD RANDOM LIBRARY
    STANDARD STATISTICS
    STRING DATA TYPE METHODS
  INITIALIZING 2D ARRAYS AND ARRAY LISTS
  DECIMAL FORMAT/STRING.FORMAT
    **https://stackoverflow.com/questions/153724/how-to-round-a-number-to-n-decimal-places-in-java
  
        
  

  
 
