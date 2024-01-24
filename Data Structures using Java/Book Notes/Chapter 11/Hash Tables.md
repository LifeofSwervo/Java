- Data structure with fast insertion and searching.
- No matter how many data items there are, insertion and searching (and sometimes deletion) can take close to constant time: O(1) in big O notation. In practice this is just a few machine instructions.

*Hash tables are typically used when thousands of entities of information must be searched (Spellcheckers).*
- Faster than trees.
- Easy to program.

*Several Disadvantages:*
- Based on array's, resulting in them being hard to expand after creation. 
- For SOME Hash tables performance degrades significantly upon a table becoming too full. (Developer should have an idea or range of space needed.)
- Only other option would be transferring to another larger tables, time consuming process. 
- No way to visit items in any designated order (ascending / descending).

- Unparalleled in speed in convenience if these issues are irrelevant. 

### Introduction to Hashing
- One important concept is how a range of key values is transformed into a range of array index values. In a hash table this is accomplished with a hash function. 
- However, for certain kinds of keys, no hash function is necessary; the key values can be used directly as array indices. 
- We’ll look at this simpler situation first and then go on to show how hash functions can be used when keys aren’t distributed in such an orderly fashion.

### Employee Numbers as Keys
- Suppose you’re writing a program to access employee records for a small company with, say, 1,000 employees. Each employee record requires 1,000 bytes of storage. Thus, you can store the entire database in only 1 megabyte, which will easily fit in your computer’s memory. The company’s personnel director has specified that she wants the fastest possible access to any individual record. Also, every employee has been given a number from 1 (for the founder) to 1,000 (for the most recently hired worker). These employee numbers can be used as keys to access the records; in fact access by other keys is deemed unnecessary. Employees are seldom laid off, but even when they are, their records remain in the database for reference (concerning retirement benefits and so on). What sort of data structure should you use in this situation?

*Index Numbers as Keys*
- An array. An employee's record occupies one cell of the array, and the index of the cell is the employee number for that record. (Shown below}
![[Pasted image 20240120175622.png]]
 - As you know, accessing a specified array element is very fast if you know its index number. The clerk looking up Herman Alcazar knows that he is employee number 72, so he enters that number, and the program goes instantly to index number 72 in the array. A single program statement is all that’s necessary:
 
 empRecord rec = databaseArray[72];

- Adding a new item is also very quick: You insert it just past the last occupied element. The next new record—for Jim Chan, the newly hired employee number 1,001—would go in cell 1,001. Again, a single statement inserts the new record:

databaseArray[totalEmployees++] = newRecord;

- Presumable the array is larger than the current number of employees, allowing for expansion, not too much is expected.
### Not Always so Orderly
- The speed and simplicity may be appealing but this is due to the keys being unusually well organized. 
- They run 1 to the known max, and this maximum is a reasonable size for the array. 
- Array does not need to be much larger than current number of numbers. 

### A Dictionary
- Good for situations like creating a (real life) dictionary.
- Let’s say we want to store a 50,000-word English-language dictionary in main memory. You would like every word to occupy its own cell in a 50,000-cell array, so you can access the word using an index number. 
- This will make access very fast. But what’s the relationship of these index numbers to the words? Given the word morphosis, for example, how do we find its index number?

### Converting Words to Numbers

.

### Java Code for a Linear Probe Hash Table

