##Problem 1
Encrypt the given string based on its length if the length is 5, then add 4 to its first character, 3 to its second character, 2 to its third character, 1 to fourth character and 0 to last character. Display resultant string. 
Input: String 
Output: Encrypted String

##Java Code:

```
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string:");
        String s = sc.nextLine();
        String res = encrypt(s);
        System.out.print("The encrypted string is:" +res);
    }
    public static String encrypt(String s){
        if(s.length()==5){
            char[] ch = s.toCharArray();
            ch[0]+=4;
            ch[1]+=3;
            ch[2]+=2;
            ch[3]+=1;
            ch[4]+=0;
            return new String(ch);
        }
        else{
            return "Encryption not possible";
        }
    }
}


```
##Explanation:
Conversion to Character Array: The input string is converted to a character array.

Encryption: Each character is incremented by a specified value.

String Conversion: The character array is converted back to a string using new String(ch).

Edge Case Handling: If the input string length is not 5, it returns "Encryption not possible".
