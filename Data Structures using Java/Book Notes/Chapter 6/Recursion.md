- Technique in which a function calls itself.

### Triangular Numbers
- It’s said that the Pythagoreans, a band of mathematicians in ancient Greece who worked under Pythagoras (of Pythagorean theorem fame), felt a mystical connection with the series of numbers 1, 3, 6, 10, 15, 21, … (where the … means the series continues indefinitely). 
- The Nth term is found by adding n to the previous term. 
![[Pasted image 20240110005839.png]]


### Finding the nth Term using a Loop
- Method finding the value of the nth term in these series.
- The following triangle() method uses this column-based technique to find a triangular number. It sums all the columns, from a height of n to a height of 1:
![[Pasted image 20240110010043.png]]
*This method cycles the loop n times, adds n to the total the 1st time, n - 1 the 2nd time, and so on down to 1.*

### Finding the nth Term using recursion
- While the loop approach is simple, here's another way to look at this. The value of the nth term can be though of as the sum of only 2 things, instead of a while series. They are -
- 1. The 1st (tallest) column, with value n.
- 2. The sum of all the remaining columns. 
![[Pasted image 20240110011140.png]]


