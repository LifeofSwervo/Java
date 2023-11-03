# How to work with text files
## How to connect a character output stream to a file. 
- Before writing a text file you would need to create a character output stream, and you would need to connect that stream to a file. 
![[Pasted image 20231101111015.png]]
The 1st example shows how to connect a file using a buffer. 
- The 1st statement creates a FileWriter object by passing a String literal for a file name to the constructor of the FileWriter class. 
- The 2nd statement creates a BufferedWriter object by passing the FileWriter object to the constructor of the BufferedWriter class.
- The 3rd statement creates a PrintWriter object by passing the BufferedWriter object within the constructor of the PrintWriter class. 

The 2nd example shows a more concise way to code the 1st example. Instead of assigning FileWriter and BufferedWriter object to variables, you create the FileWriter object within the constructor of the BufferedWriter class. 

The 3rd example shows how to append data to an existing file. You would want to set the second argument to FileWriter constructor to true to do this. (If you don't code a value for this argument, the existing data in the file is overwritten). 
*The constructors in this figure should help with understanding how to layer output streams.*

## How to write to a text file
- The print() and println() methods of the PrintWriter class are how to write to a text file. 
<span style="color:#00FFFF">(These methods work just like they do for System.out but write data to the output stream instead of the console.)</span>
![[Pasted image 20231101153415.png]]
- "try-with-resources" statements are typically used to create a stream. (Used in example.)
- The "try-with-resources" statement automatically closes and flushes the stream. <span style="color:#00FFFF">Meaning you don't need to call flush() and close().</span>

*The 1st example in this figure shows how to append a string and an object to a text file named "log.txt"*
- The code 1st creates a FileWriter object that can append data to the file. 
- If no log.txt file exist in the current directory, this code creates the file. 
- After that, the println() method provides the user with the current date and time. 

*The 2nd example shows how to write data that's stored in a Product object to a delimited text file.*
- In this type of file, 1 type of delimiter is used to separate the columns (or fields) that are written to the file, and another type of delimiter is used to separate the rows (or records). 
- The tab character "backslash t" is used as a delimiter for the columns, and the new line character "backslash n" is used for the rows. 
- As a result of this formatting, the example stores the code, description, and price in the same row. 
- The new line character then ends the column for that product and starts a new row for the next product.

## How to connect a character input stream to a file
![[Pasted image 20231101161726.png]]
- Supply the FileReader object as the argument of the constructor of the BufferedReader class. 
*This creates a stream that uses a buffer and has methods that you can use to read data.*

- Since the constructor for the BufferedReader class accepts any object in the Reader hierarchy, it can accept a FileReader object that connects the stream to a file. 
- The BufferedReader constructor can also accept an InputStreamReader object, which can be used to connect the character input stream to the keyboard or to a network connection rather than a file. 

## How to read from a text file
![[Pasted image 20231102103334.png]]
*In the 1st example the "readLine()" method is used by the try block to read the 1st row in the log file.*
- After this, a while loop prints the current row to the console and reads the next row. Once the readLine() method has reached the end of the file it returns null, ending the loop.
- Once the try block finishes, "try-with-resources" closes the input stream, flushing the buffer. Errors during this process are caught by the catch block, this catch block will print error details to the console. (Also closing the input stream and flushing the buffer.)
*In the 2nd example an display of how to read the first line of the products.txt file is given.*
- This is done again using the readLine() method then, because this line contains columns that are delimited by tab characters, it parses the string into individual columns. 
- To do this, it passes the tab character to the split() method of the String class, splitting the string into an array named columns.
- The example continues and creates a product object from the data in the columns array. The constructor of the Product object contains the description and the product code since they are strings. 
- The price column has to be converted from a String object to a double value. This is done using the parseDouble() method of the Double class. 
- The example ends with the information being displayed on the console. 
- When the try block ends the try-with-resources statement closes the input stream, flushing the buffer. If any exceptions occur during this, execution jumps to the catch block, printing the exception to the console. Also closing the input stream, flushing the buffer. 

## The ProductDB class
When structuring your code for an app, it's common to store file I/O in a data access class like ProductDB (shown in example).
![[Pasted image 20231103103900.png]]
*Storing file I/O in a data access class like ProductDB allows you to separate the code that provides data access from the code that controls the UI.*
- The ProductDB class starts by importing all classes from the java.io package, including the classes for reading and writing files and classes that define the I/O exceptions.
- The first 2 statements in the example is 2 static variables - FILENAME and COLUMN_SEP, holding the name of the file and a new line tab (to separate data). 
- The static getAll() method accepts no arguments and creates an array list for storing the Product objects. Then, a try-with-resources statement opens a character input stream for reading the products from the specified file. 
- In this try statement the first statement reads the first line of the text file. If the line isn't null the while loop runs.
- Inside this while loop, the first statement uses the "COLUMN_SEP", to split the line into an array of strings. The next 3 statements then get the product's code, description, and price. 
- The code then creates a Product object using these variables, this is then added to the array list of products. 
- The loop's final statement reads the next line of the text file. Resulting in the while loop executing until the readLine() methods reaches the end of the file, returning null. 
- Once returning null execution exits the while loop, and the method returns the array list of Product objects to the calling method.

*- The catch block will catch if  the specified file is not found with the "FileNotFound exception". The catch block prints out a message detailing the variable name does not exist.*
*- The other catch block will catch if any other I/O exception were to occur. This catch block just prints the exception to the console.*
- They both return null, this indicates the method didn't execute successfully.

#### The static saveAll() method accepts an array list of product objects and doesn't return any data. 
- This contains another try-with-resources statement, opening a character output stream for writing data to the file. In this block the code loops through all products in the array list. Printing the products code, description, and price to the output stream with the separation character between each. 
- This is safeguarded with a catch that will print the information to the console of any exceptions. 
