/*
Remove Consecutive Characters

Problem Description

Given a string A and integer B, remove all consecutive same characters that have length exactly B.


NOTE : All the consecutive same characters that have length exactly B will be removed simultaneously.



Problem Constraints
1 <= |A| <= 100000

1 <= B <= |A|



Input Format
First Argument is string A.

Second argument is integer B.



Output Format
Return a string after doing the removals.



Example Input
Input 1:

A = "aabcd"
B = 2
Input 2:

A = "aabbccd"
B = 2


Example Output
Output 1:

 "bcd"
Output 2:

 "d"


Example Explanation
Explanation 1:

 "aa" had length 2.
Explanation 2:

 "aa", "bb" and "cc" had length of 2.
*/

public class Solution {
    public String solve(String A, int B) {
        int i=0, j = 0;
        A = A+'$';
        String ans = "";
        int count = 0;
        while(j<A.length()){
            if(A.charAt(i) == A.charAt(j) ){
                count++;
                j++;
            }else{
                if(count != B){
                    ans += A.substring(i,j);
                }
                i=j;count=0;
            }
           
        }
        return ans;
    }
}


/*Pseudocode:
public String solve(String A, int B) {
    Initialize variables (i, j, A, ans, count)
    
    While j is less than the length of A:
        If A[i] == A[j]:
            Increment count and j
        Else:
            If count is not equal to B:
                Add the substring A
*/
