import java.util.Scanner; // Must import scanner at top of main file

class Main {

  static lib a = new lib(); // Must instantiate .class file

  public static void main(String[] args) {
    System.out.println("Please enter a number: ");
    
    Object x = a.scanf("int");
    /*
    
     - The variable must be declared as object
     - .scanf() method functions similar to it's brother in C
     - Put ideal data type in quotes as method parameter. 
     - Abbreviations for data types found in documentation
    
    */
    System.out.println(x);
  }
}
