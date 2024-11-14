## Problem3:
Encrypt a string by repeating ith character I times. Given a string s, the task is to encrypt the string with following technique: the character of string will be repeated this... the character will be repeated n times.
ex: s=abcd   o/p: abbcccdddd

## Java code:
```
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String:");
        String s = sc.nextLine();
        String res = encrypt(s);
        System.out.print("Encrypted is:"+res);
    }
    
    public static String encrypt(String s){
        StringBuilder sb = new StringBuilder();
        s = s.toLowerCase();
        char[] ch = s.toCharArray();
        boolean flag=false;
        for(char c : ch){
            if(Character.isLetter(c)){
                int pos = c-'a'+1;
                for(int i=0;i<pos;i++){
                    sb.append(c);
                 }
            }
        }
        return sb.toString();
    }
}

```

## Explanation:
1.Setting Up the Program:

The program starts by importing the Scanner class for reading input from the user.

The main class Main contains the main method, which is the entry point of the program.

2.Reading Input:

The program creates a Scanner object to read a string input from the user. It prompts the user to enter a string and captures this input.

3.Encrypting the String:

The main method calls the encrypt method, passing the user input string as an argument.

Inside the encrypt method, a StringBuilder is initialized to construct the encrypted string efficiently.

The input string is converted to lowercase to ensure consistency in processing.

The characters of the string are converted into a character array for easy iteration.

4.Iterating Through Characters:

The program iterates through each character of the string.

It checks if the character is a letter using the Character.isLetter method.

5.Calculating Position:

For each letter, the position in the alphabet is calculated. This is done by subtracting the ASCII value of 'a' from the ASCII value of the character and then adding 1. This gives a position from 1 to 26 for the letters 'a' to 'z'.

6.Appending Characters:

Based on the calculated position, the program appends the character to the StringBuilder as many times as its position in the alphabet.

For example, 'a' (position 1) will be appended once, 'b' (position 2) will be appended twice, and so on.

7.Returning the Result:

Once all characters have been processed, the encrypt method returns the resulting encrypted string.

This string is then printed to the console as the encrypted version of the input string.
