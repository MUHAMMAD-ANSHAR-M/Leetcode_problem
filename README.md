Problem Name : Two Sum
Platform : Leetcode

Intuition:
 You are checking all possible pairs of numbers in the list.

 For each pair, you see if their sum equals the target.

 If yes, you immediately return their indices.

 Approach:
  Loop through the list with index i.

 For each i, loop again with index j.

 Check if i != j (to avoid using the same element twice).

 If nums[i] + nums[j] == target, return [i, j].

 The function stops as soon as it finds a valid pair.

Time Complexity = O(n²)

Space Complexity = O(1) 

Problem Name : Reverse a string
platform : Leetcode

Intuition:
 “Instead of manually swapping characters, just use Python’s built-in reverse operation.”

Approach :
 Input: s (a list of characters).

 Call s.reverse().

 This modifies the list in-place.

 No new list is created.

 Return the reversed list (though technically, since the problem says do not return anything, you don’t need the return statement — just s.reverse() is enough).  

 Time Complexity = O(n)

 Space Complexity = O(1)