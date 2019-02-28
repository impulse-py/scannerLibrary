# scannerLibrary
A custom .class java file that functions to replace the robust Scanner import


~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

This method was used as a primitive replacement for the Scanner in Java, it is not intended
for heavy-duty use. Feel free to use this code as you wish for private eneavors, however, please contact
me if you intend to use it for any other reason.

The documentation for the method may be found below:

 - The data types passed into the method are abbreviated as follows:
   - "str" for String
   - "lstr" for line of text
   - "int" for Integer
   - "char" for Characters
   - "bool" for boolean values
   - "double" for values containing decimals
   
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


When running the .scanf() method, you will always be returned an Object variable. To fix this, I implemented a set of
methods to convert the Object into a usable type. These methods are listed below and function similar to the .toString()
method. They each take 1 object as the parameter, and are intended to be used in conjuntion with the .scanf() method.

The methods are as follows:
 - .convStr();
 - .convInt();
 - .convDouble();
 - .convChar();
 - .convBool();
