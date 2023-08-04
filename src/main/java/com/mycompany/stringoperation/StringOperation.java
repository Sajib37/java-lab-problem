package com.mycompany.stringoperation;
import java.util.*;
public class StringOperation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1,s2;
        System.out.println("Enter the first String: ");
        s1=sc.nextLine();
        System.out.println("Enter the Second String: ");
        s2=sc.nextLine();
        int length1=s1.length();
        int length2=s2.length();
        System.out.println("Fisrt string length is: "+length1);
        System.out.println("Second string length is: "+length2);
        
        String replaceUnderscore=s1.replace(" ","_");
        System.out.println("After replacing whitespace first string is: "+replaceUnderscore);
        
        int compare=s1.compareTo(s2);
        if(compare==0)
        {
            System.out.println("The strings are equal.....");
        }
        else
        {
            System.out.println("The strings are not equal.....");
        }
           
       
        System.out.println("Both String Are equal: "+ s1.equals(s2));
        
        char firstCharacter=s1.charAt(0);
        System.out.println("The first character Of first String: "+ firstCharacter);
        
        int index=s1.indexOf('a');
        System.out.println("The position of 'a' in first string is: "+ (index+1));
        
        if(s1.contains(s2))
        {
            System.out.println("Second string is the substring of first string.");
        }
        else if( s2.contains(s1))
        {
            System.out.println("First string is the substring of Second string.");
        }
        
        String s1ToLower=s1.toLowerCase();
        String s2ToUpper=s2.toUpperCase();
        
        System.out.println("LOwer case First string: "+ s1ToLower);
        System.out.println("Upper case Second string: "+ s2ToUpper);
        
        char arr[]=s1.toCharArray();
        System.out.println("Character array of string one: ");
        System.out.println(arr);
    }
}
