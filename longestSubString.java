import java.util.LinkedHashMap;
import java.util.Scanner;

public class longestSubString
{  
    static void longestSubstring(String inputString)
    {
        char[] charArray = inputString.toCharArray();
        
        String longestSubstring = null;
        
        int longestSubstringLength = 0;
        
        LinkedHashMap<Character, Integer> charPosMap = new LinkedHashMap<Character, Integer>();
        
        for (int i = 0; i < charArray.length; i++) 
        {
            char ch = charArray[i];
        
            //If ch is not present in charPosMap, adding ch into charPosMap along with its position....
            if(!charPosMap.containsKey(ch))
            {
                charPosMap.put(ch, i);
            }
            else
            {   
                i = charPosMap.get(ch);
                
                charPosMap.clear();
            }
            
            //Update the longestSubString...
            
            if(charPosMap.size() > longestSubstringLength)
            {
                longestSubstringLength = charPosMap.size();
                
                longestSubstring = charPosMap.keySet().toString();
            }
        }
        
        System.out.println("Input String :: "+inputString);

        System.out.print("The longest substring :: \t");

        for(int i = 0; i<longestSubstringLength;i++){

            System.out.print(longestSubstring.charAt(i));

        }
    
        
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the longest String :: \t");

        String longeString = sc.nextLine();
        
        longestSubString.longestSubstring(longeString);

        sc.close();
    }   
}