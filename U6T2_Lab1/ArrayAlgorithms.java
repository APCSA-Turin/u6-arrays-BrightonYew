
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
}

