import java.util.Scanner;

public class scan {
  static Scanner key = new Scanner(System.in);

  public static String convStr(Object o) {
    String s1 = String.valueOf(o);

    return s1;
  }

  public static int convInt(Object o) {
    int i = (int)o;

    return i;
  }

  public static double convDouble(Object o) {
    double i = (double)o;

    return i;
  }

  public static char convChar(Object o) {
    String s1 = o.toString();
    char c = s1.charAt(0);

    return c;
  }

  public static boolean convBool(Object o) {
    boolean b = (Boolean)o;
    
    return b;
  }
  
  public static Object scanf(String dType) {
    Object y;

    if(dType.equals("str")) {
      y = key.next();
      return y;
    }
    else if(dType.equals("lstr")) {
      y = key.nextLine();
      return y;
    }
    else if(dType.equals("int")) {
      y = key.nextInt();
      return y;
    }
    else if(dType.equals("char")) {
      y = key.next().charAt(0);
      return y;
    }
    else if(dType.equals("bool")) {
      y = key.nextBoolean();
      return y;
    }
    else if(dType.equals("double")) {
      y = key.nextDouble();
      return y;
    } else {
      return null;
    }
  }
}
