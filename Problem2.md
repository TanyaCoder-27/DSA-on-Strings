## Problem 2
Encrypt a String only ! and e symbols alternately while encrypting the message, encrypted format must repeat the symbol as many times of the letter positions in Alphabetical order.
ex1: s="Ab" o/p: !ee
s="CDE" o/p: !!!eeee!!!!!

## Java Code:

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
                    if(!flag){
                        sb.append("!");
                    }
                    else{
                        sb.append("e");
                    }
                 }
                flag = !flag;
                
            }
        }
        return sb.toString();
        
    }
}

```

##Explanation:

The program prompts the user to enter a string and then encrypts it by replacing each letter with a sequence of symbols ('!' and 'e') based on the letter's position in the alphabet. 
It converts the input string to lowercase to handle both uppercase and lowercase letters uniformly. For each letter, it calculates its position (A=1, B=2, ..., Z=26) and appends the corresponding number of symbols to a result string, alternating between '!' and 'e'. 
Finally, it outputs the encrypted string. The program also ensures that only alphabetic characters are processed, ignoring any non-letter characters.
