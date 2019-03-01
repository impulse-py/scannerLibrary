import java.util.Scanner; // Must import scanner at top of main file
import packageName.scan;

class Main {

  static scan a = new scan(); // Must instantiate .class/.java file

  public static void main(String[] args) {
    System.out.println("Please enter a (desired data type): "); // In this example, the desired data type will be an integer
    
    Object x = a.scanf("int"); // In this example, the data type returned will be an integer
    /*
    
     - The variable must be declared as object
     - .scanf() method functions similar to it's brother in C
     - Put ideal data type in quotes as method parameter. 
     - Abbreviations for data types found in documentation
    
    */
    System.out.println(x);
    
    // The following code pertains to converting the Object variable into a usable value
    
    int n1 = a.convInt(x);
    System.out.println(n1 + 10);
    /*
    
    The .convInt method functions like the .toString method. An object is given as a parameter and is then
    converted into a usable integer value (see variable "n1").
    
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    
    The full list of .conv methods can be found in the documentation
    
    */
  }
}
