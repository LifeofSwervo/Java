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