import java.util.Scanner;

public class lib {
  static Scanner key = new Scanner(System.in);
  
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
