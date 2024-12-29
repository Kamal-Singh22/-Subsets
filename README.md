# Subsets
Given an integer array nums of unique elements, return all possible subsets (the power set).  The solution set must not contain duplicate subsets, and the subsets can be returned in any order.
How it Works
Recursive Backtracking:

Each element can either be included in the current subset or excluded.
Recursively explore both choices for every element.
Base Case:

If the index reaches the end of the array, add the current subset to the result.
Include/Exclude Decision:

Exclude the current element and move to the next.
Include the current element, add it to the subset, and recurse further.
Backtracking:

After including an element, remove it before exploring other possibilities to backtrack.
