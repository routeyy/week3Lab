package Week3;

import java.util.Arrays;

public class ArraysandMethodsLab {
  
  public static void main(String[] args) {
    
    //
    // Arrays:
    //
    
    // 1. Create an array with the following values 1, 5, 2, 8, 13, 6
      int[] arrayValues = {1,5,2,8,13,6};
    
    // 2. Print out the first element in the array
      System.out.println(arrayValues[1]);
    
    // 3. Print out the last element in the array without using the number 5
      System.out.println(arrayValues[arrayValues.length-1]);
    
    // 4. Print out the element in the array at position 6, what happens?
      //System.out.println(arrayValues[6]);
      //"Index 6 out of bounds for length 6"
    
    // 5. Print out the element in the array at position -1, what happens?
      //System.out.println(arrayValues[-1]);
      //"Index -1 out of bounds for length 6"
        
    // 6. Write a traditional for loop that prints out each element in the array
      for (int i = 0; i < 6; i++) {
        System.out.println(arrayValues[i]);
      }
        
    // 7. Write an enhanced for loop that prints out each element in the array
      for (int value : arrayValues) {
        System.out.println(value);
      }
    
    // 8. Create a new variable called sum, write a loop that adds 
    //          each element in the array to the sum
      int sum = 0;
      for (int value : arrayValues) {
        sum += value;
      }
      System.out.println(sum);
        
    // 9. Create a new variable called average and assign the average value of the array to it
      double average = sum/arrayValues.length;
      System.out.println(average);
    
    // 10. Write an enhanced for loop that prints out each number in the array 
    //          only if the number is odd
      for (int value : arrayValues) {
        if (value % 2 == 1) {
          System.out.println(value);
        }
      }
    
    // 11. Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
      String[] arrayString = {"Sam", "Sally", "Thomas", "Robert"};
    
    // 12. Calculate the sum of all the letters in the new array
      int stringSum = 0;
      for (String name : arrayString) {
        stringSum += name.length();
      System.out.println(stringSum);
      }

    //
    // Methods:
    //
    
    // 13. Write and test a method that takes a String name and prints out a greeting. 
    //          This method returns nothing.
     String greeting = "Hello";
     greeting(greeting);
    
    // 14. Write and test a method that takes a String name and  
    //          returns a greeting.  Do not print in the method.
     String greeting2 = "Hi";
     greeting2(greeting2);
    
    // Compare method 13 and method 14:  
    //      a. Analyze the difference between these two methods.
    //      b. What do you find? The former method prints out the greeting,
    //                           while the latter doesn't.
    //      c. How are they different?
    
    
    // 15. Write and test a method that takes a String and an int and 
    //          returns true if the number of letters in the string is greater than the int
     if (printStringAndInt("Hello", 5) == true) {
       System.out.println(true);
     } else {
       System.out.println(false);
     }
    
    // 16. Write and test a method that takes an array of string and a string and 
    //          returns true if the string passed in exists in the array
     String[] userStr = {"Bing", "Bong"};
     String userStr2 = "routeyy";
     if (printArrayString(userStr, userStr2)) {
       System.out.println(true);
     } else {
       System.out.println(false);
     }
    
    // 17. Write and test a method that takes an array of int and 
    //          returns the smallest number in the array
     int[] testIntArray = {7,5,8,10};
     System.out.println(printArrayInt(testIntArray));
    
    // 18. Write and test a method that takes an array of double and 
    //          returns the average
     double[] testDoubleArray = {5.0,7.0,6.0};
     System.out.println(printArrayDouble(testDoubleArray));

    // 19. Write and test a method that takes an array of Strings and 
    //          returns an array of int where each element
    //          matches the length of the string at that position
     String[] testStringArray = {"hellos","heyo","his"};
     System.out.println(Arrays.toString(printArrayStringInt(testStringArray)));
      
    // 20. Write and test a method that takes an array of strings and 
    //          returns true if the sum of letters for all strings with an even amount of letters
    //          is greater than the sum of those with an odd amount of letters.
     String[] testStringArray2 = {"wowzar", "woweee", "wowzers"};
     System.out.println(printArrayStringCharInt(testStringArray2));
     
    // 21. Write and test a method that takes a string and 
    //          returns true if the string is a palindrome
     String testString = "wow";
     System.out.println(printPalindrome(testString));
     
     
}


// Method 13:
    public static void greeting(String input) {
      System.out.println(input);
    }
  
// Method 14:
    public static String greeting2(String input) {
      return input;
    }

// Method 15:
    public static boolean printStringAndInt(String userStr, int userInt) {
      if (userStr.length() > userInt) {
        return true;
      } else {
        return false;
      }
    }

// Method 16:
    public static boolean printArrayString(String[] userStr, String userStr2) {
      for (String vagueString : userStr) {
        if (vagueString.equals(userStr2)) {
          return true;
        }
       }
      return false;
      }

// Method 17:
    public static int printArrayInt(int[] userInt) {
      int small = userInt[0];
      for (int integer : userInt) {
        if (integer < small) {
          small = integer;
        }
      }
      return small;
    }

// Method 18:
    public static double printArrayDouble(double[] userDouble) {
      double doubleSum = 0;
      for (double doubleNumber : userDouble) {
        doubleSum += doubleNumber;
      }
      doubleSum /= userDouble.length;
      return doubleSum;
    }

// Method 19:
    public static int[] printArrayStringInt(String[] userString) {
      int[] stringLengthInt = new int[userString.length];
      for (int i = 0; i < userString.length; i++) {
        stringLengthInt[i] = userString[i].length();
      }
      return stringLengthInt;
    }

// Method 20:
    public static boolean printArrayStringCharInt(String[] userString2) {
      int evenSum = 0;
      int oddSum = 0;
      for (String str : userString2) {
        if ((str.length() % 2) == 0) {
        evenSum += str.length();
        } else {
          oddSum += str.length();
        }
      }
      if (evenSum > oddSum) {
        return true;
      } else {
        return false;
      }
    }

// Method 21:
    public static boolean printPalindrome(String userString3) {
      String reverseUserString3 = "";
      for (int i = 0; i < userString3.length(); i++) {
        reverseUserString3 = userString3.charAt(i) + reverseUserString3;
      }
      if (userString3.equals(reverseUserString3)) {
        return true;
      } else {
        return false;
      }
    }
  
}
