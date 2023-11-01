# Introduction to File I/O
*File I/O = File Input/ Output*

## How files and streams work
![[Pasted image 20231101085049.png]]
- Text files store data as Unicode characters on a disk, these types of files use delimiters like tabs and new line characters to separate the fields and records. These would include .csv, .json, .xml, and .html files. 
- Binary files do not store all data as characters, due to this text editors cannot display all the information as characters for human interpretation. 
- This causes text editors to display gibberish, typically with no new line characters. Binary files would be image, audio, video, and application file types. 
![[Pasted image 20231101085026.png]]
*To handle File I/O, Java uses streams. Streams are the flow of data from one locations to another.*
<p align='center'>For Example: System.out is Java's output stream, System.in is Java's input stream.</p>
![[Pasted image 20231101085125.png]]
## A File I/O Example
- A buffer causes data in a stream to store up, when the buffer is full or the stream is closed, all the data flushes to the disk file in a single I/O operation. 
<span style="color:#00FFFF">The benefit of buffering is that it reduces the number of I/O operations that are done by the disk device. Each operations causes the disk to rotate to the starting disk location. Due to this process being slower in comparison to system operations, buffering improves the performance of I/O operations.</span>

*You should use buffers for all operations besides the most trivial operations.*

Example of this provided on page 277. 
![[Pasted image 20231101091626.png]]

## How to use a try-with-resources statement to handle I/O exceptions. 
- Try statements are used to handle exceptions thrown by I/O operations. 
- ![[Pasted image 20231101093308.png]]
- Example starts by defining a string storing the name of the file. Followed by creating an input stream for the file. The code uses a special try statement ""*try-with-resources*"". 
- This statement initializes an object that uses system resources such as an input or output stream. When the try statement is done, it automatically closes the resource object.  
- This flushes all data from the buffer and releases any system resources the object is using. <span style="color:#00FFFF">This would even occur if an exception happened. </span>
- In the try block, the first statement starts reading the first line in the file. Then it uses a while loop to display the current line and read the next line. This would continue as long as the string that's returned isn't null. 
- If the string is null this would indicate the end of the file has been reached, ending the loop. <span style="color:#00FFFF">(This prevents the EOFException from occurring)</span>
- To handle the exception that would occur if the file isn't found, the try statement includes a catch clause that catches the FileNotFoundException. In the catch block, the code prints a message that indicates that the file wasn't found. The message has the name of the file.  
- The try statement also includes a catch clause the catches the IOException. Inside the catch block, the code prints the exception object to the console. This provides the user with information about the exception, including the name and a brief description of the exception if one is available. 
- For these 2 catch blocks to correctly work, the catch block for the FileNotFoundException must be coded first. This is due to it being a more specific exception than the IOException. 

*"try-with-resources" was introduced in Java 7 to make working with a File I/O operation easier and safer. 



