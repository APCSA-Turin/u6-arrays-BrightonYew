package U6T2_lab2;

public class ArrayAlgorithms {

    private ArrayAlgorithms () {}

     /** Returns the average of all values in numList as a double.
      *
      *  PRECONDITION: numList.length > 0
      */
    public static double average(int[] numList) {
        // IMPLEMENT ME
        double sum = 0.0;
        for (int index = 0; index <= numList.length - 1; index++) {
            sum += numList[index];
        }
        return sum / numList.length;
    }

     /** Returns the value in numList that represents the minimum
         * value in numList.
         *
         *  PRECONDITION: numList.length > 0
         */
    public static int minimum(int[] numList) {
        // IMPLEMENT ME
        int min = 999;
        for (int index = 0; index <= numList.length - 1; index++) {
            if (numList[index] < min) {
                min = numList[index];
            }
        }
        return min;
    }

        /** Returns the number of Strings in strList that contain the target.
        *
        *  PRECONDITION: strList.length > 0
        */
    public static int howManyContain(String[] strList, String target) {
        // IMPLEMENT ME
        int containNum = 0;
        for (int index = 0; index <= strList.length - 1; index++) {
            if (strList[index].indexOf(target) > -1) {
                containNum++;
            }
        }
        return containNum;
    }

      /** Returns an array containing all characters in myStr, in order.
     *
     *  PRECONDITION: myStr.length() > 0
     */
    public static String[] stringToArray(String myStr) {
        // IMPLEMENT ME
        String[] array = new String[myStr.length()];
        for (int index = 0; index <= myStr.length() - 1; index++) {
            array[index] = myStr.substring(index, index + 1);
        }
        return array;
    }

      /**  This method checks each Person in the people array, and if they
        *  are an adult (at least 18 years old), they introduce themselves
        *  (i.e. by calling the introduce() method)
        *
        *  PRECONDITION: people.length > 0
        */
    public static void introduceAdults(Person[] people) {
        // IMPLEMENT ME!
        for (int index = 0; index <= people.length - 1; index++) {
            if (people[index].getAge() >= 18) {
                people[index].introduce();
            }
        }
    }

          /** Prints each String in wordList, on its own line, in reverse order;
     *  the characters of each string are also reversed.
     *
     *  PRECONDITION: wordList.length > 0
     */
    public static void reversePrint(String[] wordList) {
        // IMPLEMENT ME
        for (int index = wordList.length - 1; index >= 0; index--) {
            for (int i = wordList[index].length() - 1; i >= 0; i--) {
                System.out.print(wordList[index].substring(i, i + 1));
            }
            System.out.println();
        }
    }



    /** Returns a new array containing all elements from arr1 combined with 
     *  all elements from arr2; arr1's elements should be followed by
     *  arr2's elements
     *
     *  PRECONDITION: arr1.length > 0, arr2.length > 0
     */
    public static int[] combine(int[] arr1, int[] arr2) {
        // IMPLEMENT ME
        int[] arr3 = new int[arr1.length + arr2.length];
        for (int index = 0; index <= arr1.length - 1; index++) {
            arr3[index] = arr1[index];
        }

        
        for (int index = arr1.length; index < arr3.length; index++) {
            arr3[index] = arr2[index - arr1.length];
        }

        return arr3;
    }

      /** Changes the first and last element of nums to be num
     *
     *  THIS METHOD MUTATES (MODIFIES) ORIGINAL ARRAY
     *  PRECONDITION: nums.length > 0
     */
    public static void bookEnd(int[] nums, int num) {
        // IMPLEMENT ME
        nums[0] = num;
        nums[nums.length - 1] = num;
    }

      /** Multiplies each number in numList by multiplier.
     *
     *  THIS METHOD MUTATES (MODIFIES) ORIGINAL ARRAY
     *  PRECONDITION: numList.length > 0
     */
    public static void multiplyBy(int[] numList, int multiplier) {
        // IMPLEMENT ME
        for (int index = 0; index < numList.length; index++) {
            numList[index] = numList[index] * multiplier;
        }
    }

      /** Returns an array of ints where each element is the product
     *  of the corresponding element in numList and multiplier.
     *
     *  THIS METHOD DOES NOT MUTATE (MODIFY) ORIGINAL ARRAY
     *  PRECONDITION: numList.length > 0
     */
    public static int[] multiplyByNoModify(int[] numList, int multiplier) {
        // IMPLEMENT ME
        int[] newList = new int[numList.length];

        for (int index = 0; index < numList.length; index++) {
            newList[index] = numList[index] * multiplier;
        }

        return newList;
    }
      /** Adds a "!" to the end of each String in wordList.  However, if a
     *  a string already ends in an exclamation point, do NOT add another.
     *
     *  THIS METHOD MUTATES (MODIFIES) ORIGINAL ARRAY
     *  PRECONDITION: wordList.length > 0
     */
    public static void addExclamation(String[] wordList) {
        // IMPLEMENT ME
        for (int index = 0; index < wordList.length; index++) {
            if (!wordList[index].substring(wordList[index].length() - 1).equals("!")) {
            wordList[index] = wordList[index] + "!";
        }
        }
    }

      /** Returns an array of booleans where each element reflects whether
     *  the corresponding element in tempList is at or below the freezing
     *  temperature of 32 (true) or not (false).
     *
     *  THIS METHOD DOES NOT MUTATE (MODIFY) ORIGINAL ARRAY
     *  PRECONDITION: tempList.length > 0
     */
    public static boolean[] isFreezing(int[] tempList) {
        // IMPLEMENT ME
        boolean[] finalarr = new boolean[tempList.length];
        for (int index = 0; index < tempList.length; index++) {
            if (tempList[index] <= 32) {
                finalarr[index] = true;
            } else {
                finalarr[index] = false;
            }
        }
        return finalarr;
    }

      /** Shifts all elements in numList to the LEFT one index
     *
     *  The first element in the array should wrap around
     *  to the back of the array.  For example, given the array
     *  {5, 1, 3, 4, 7, 6}, this method modifies the array
     *  to {1, 3, 4, 7, 6, 5} (all elements shifted left one
     *  with the last element wrapping around to the back)
     *
     *  THIS METHOD MUTATES (MODIFIES) ORIGINAL ARRAY
     *  PRECONDITION: numList.length > 0
     */
    public static void shiftLeft(int[] numList) {
        // IMPLEMENT ME
        int[] temparr = new int[numList.length];
        for (int index = 0; index < numList.length; index++) {
            temparr[index] = numList[index];
        }

        for (int index = 0; index < numList.length; index++) {
            if (index == numList.length - 1) {
                numList[numList.length - 1] = temparr[0];
            } else {
                numList[index] = temparr[index + 1];
            }
        }
    }


    /** Shifts all elements in numList to the RIGHT one index.
     *
     *  The last element in the array should wrap around
     *  to the front of the array.  For example, given the array
     *  {5, 1, 3, 4, 7, 6}, this method modifies the array
     *  to {6, 5, 1, 3, 4, 7} (all elements shifted right one
     *  with the last element wrapping around to the front)
     *
     *  THIS METHOD MUTATES (MODIFIES) ORIGINAL ARRAY
     *  PRECONDITION: numList.length > 0
     */

    public static void shiftRight(int[] numList) {
        // IMPLEMENT ME
        int[] temparr = new int[numList.length];
        for (int index = 0; index < numList.length; index++) {
            temparr[index] = numList[index];
        }

        for (int index = 0; index < numList.length; index++) {
            if (index == 0) {
                numList[0] = temparr[temparr.length - 1];
            } else {
                numList[index] = temparr[index - 1];
            }
        }
    }

    public static int[] copyarr (int[] first) {
        int[] temparr = new int[first.length];
        for (int index = 0; index < first.length; index++) {
            temparr[index] = first[index];
        }
        return temparr;
    }

      /** Reverses all elements in an array.
     *
     *  For example, given the array {5, 1, 3, 4, 7, 6}, this method
     *  modifies the array to {6, 7, 4, 3, 1, 5}.
     *  Should work with all array lengths (both odd and even).
     *
     *  THIS METHOD MUTATES (MODIFIES) ORIGINAL ARRAY
     *  PRECONDITION: numList.length > 0
     */
  public  static void reverse(int[] numList) {
    // IMPLEMENT ME: You should solve this two different ways; see below
    int otherindex = numList.length - 1;
    int[] temparr = new int[numList.length];
    for (int index = 0; index < numList.length; index++) {
        temparr[index] = numList[index];
    }
    for (int index = 0; index < numList.length; index++) {
        numList[index] = temparr[otherindex];
        otherindex --;
    }
}
}
