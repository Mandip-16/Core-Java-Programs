package String;

import java.util.Scanner;

public class StringDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();

        System.out.println(str.length());

        System.out.println("Enter another string: ");
        String str1 = sc.nextLine();

        //Conacatination
        System.out.println(str + str1);
        System.out.println(str.concat(str1));

        //charAt
        for (int i=0; i<str.length(); i++) {
            System.out.println(str.charAt(i));
        }

        String str3 = "Hello";

        //An int value: 0 if the string is equal to the other string.
        //< 0 if the string is lexicographically less than the other string
        //> 0 if the string is lexicographically greater than the other string (more characters)
        System.out.println(str.compareTo(str1));
        System.out.println(str.compareToIgnoreCase(str1));

        //contains
        System.out.println(str3.contains("h"));
        System.out.println(str3.contains("ell"));
        System.out.println(str3.contains("H"));

        //copyValueOf
        char[] myStr1 = {'H', 'e', 'l', 'l', 'o'};
        String myStr2 = "";
        myStr2 = myStr2.copyValueOf(myStr1, 0, 5);
        System.out.println("Returned String: " + myStr2);

        //endWith
        System.out.println(str3.endsWith("l"));
        System.out.println(str3.endsWith("o"));// small o
        System.out.println(str3.endsWith("O"));//capital o

        //equals
        System.out.println(str.equals(str1));
        System.out.println(str.equalsIgnoreCase(str1));

        //public void getChars(int start, int end, char[] destination, int position)
        char[] myArray = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        System.out.println(myArray);
        String myStr = "Hello, World!";
        myStr.getChars(7, 12, myArray, 4);
        System.out.println(myArray);

        //indexOf - Returns the position of the first found occurrence of specified characters in a string
        System.out.println(str3.indexOf("l"));
        System.out.println(str3.indexOf("m"));
        System.out.println(str3.indexOf("L"));

        System.out.println("UPPERCASE: " + str.toUpperCase());
        System.out.println("lowercase: " + str.toLowerCase());

        System.out.println(str.isEmpty());

        //The join() method joins one or more strings with a specified separator.
        //public String join(CharSequence separator, CharSequence... elements)
        String fruits = String.join(" ", "Orange", "Apple", "Mango");
        System.out.println(fruits);

        //lastIndexOf - Returns the position of the last found occurrence of specified characters in a string
        System.out.println(str3.lastIndexOf("l"));

        //trim()
        String str4 = "   mandeep  ";
        System.out.println(str4.trim());

        //replace()
        String myStr3 = "Hello";
        System.out.println(myStr3.replace('l', 'p'));

        //substring
        System.out.println(str.substring(0,4));

        //toCharArray
        String myStr5 = "Hello";
        char[] Array = myStr5.toCharArray();
        System.out.println(Array[0]);

        for (char c : Array) {
            System.out.print(c);
        }


    }
}
