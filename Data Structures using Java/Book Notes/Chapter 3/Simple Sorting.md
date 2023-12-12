- Typically after creating a database you will need to sort it. This may also be a necessity if you intend to search data.

*- Sort Algorithms focused on:*
- Bubble Sort.
- Insertion Sort.
- Selection Sort.


##### How would you do it?
- Imagine that your kids-league baseball team (mentioned in Chapter 1, “Overview”) is lined up on the field, as shown in Figure 3.1. The regulation nine players, plus an extra, have shown up for practice. You want to arrange the players in order of increasing height (with the shortest player on the left) for the team picture. How would you go about this sorting process?
![[Pasted image 20231211225158.png]]
- As a human being, you have advantages over a computer program. You can see all the kids at once, and you can pick out the tallest kid almost instantly. You don’t need to laboriously measure and compare everyone. Also, the kids don’t need to occupy particular places. They can jostle each other, push each other a little to make room, and stand behind or in front of each other. After some ad hoc rearranging, you would have no trouble in lining up all the kids, as shown in Figure 3.2.
- A computer program isn’t able to glance over the data in this way. It can compare only two players at one time because that’s how the comparison operators work. This tunnel vision on the part of algorithms will be a recurring theme. Things may seem simple to us humans, but the algorithm can’t see the big picture and must, therefore, concentrate on the details and follow some simple rules.

*Central steps of 3 algorithms:*
- 1. Compare 2 items.
- 2. Swap 2 items, or copy 1 item. 


### Bubble Sort
- Slow, Simple, Good Beginner Algorithm.

##### Bubble Sort on the Baseball Players
- Imagine that you’re near-sighted (like a computer program) so that you can see only two of the baseball players at the same time, if they’re next to each other and if you stand very close to them. Given this impediment, how would you sort them? Let’s assume there are N players, and the positions they’re standing in are numbered from 0 on the left to N-1 on the right.
- Start at end of and compared 2 kids at index 0 and index 1.
- If the one on the left (in 0) is taller, you swap them. If the one on the right (in 1) is taller you don't do anything. 
- Move on to the next index, (in this case 1 and 2.)
![[Pasted image 20231211230144.png]]

##### Java Code for a Bubble Sort

![[Pasted image 20231211230549.png]]
![[Pasted image 20231211230627.png]]
![[Pasted image 20231211230655.png]]


### Selection Sort
*Improves on the bubble sort by reducing the number of swaps necessary* from *O(N*²) to O(N). Unfortunately, the amount of comparisons remains O(N²).

- Let’s consider the baseball players again. In the selection sort, you can no longer compare only players standing next to each other. Thus, you’ll need to remember a certain player’s height; you can use a notebook to write it down. A magenta-colored towel will also come in handy.

##### A Brief Description
- What’s involved in the selection sort is making a pass through all the players and picking (or selecting, hence the name of the sort) the shortest one. This shortest player is then swapped with the player on the left end of the line, at position 0. Now the leftmost player is sorted and won’t need to be moved again. Notice that in this algorithm the sorted players accumulate on the left (lower indices), whereas in the bubble sort they accumulated on the right.
- Next time you pass down the row of players, you start at position 1, and after finding the minimum, swap with position 1. Repeats until all are sorted.

##### A more detailed description
![[Pasted image 20231212085335.png]]

##### Java Code for Selection Sort

![[Pasted image 20231212112354.png]]
- The listing for the selectSort.java program is similar to that for bubbleSort.java, except that the container class is called ArraySel instead of ArrayBub, and the bubbleSort() method has been replaced by selectSort(). Here’s how this method looks: