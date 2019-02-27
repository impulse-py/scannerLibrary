import java.util.Scanner; // Must import scanner at top of main file
import packageName.scan;

class Main {

  static scan a = new scan(); // Must instantiate .class file

  public static void main(String[] args) {
    System.out.println("Please enter a number: ");
    
    Object x = a.scanf("int"); // In this example, the data type returned will be an integer
    /*
    
     - The variable must be declared as object
     - .scanf() method functions similar to it's brother in C
     - Put ideal data type in quotes as method parameter. 
     - Abbreviations for data types found in documentation
    
    */
    System.out.println(x);
  }
}
