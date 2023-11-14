public class ArrayUtility {

    public static void print(int[] array) {
        for (int i=0; i < array.length; i++)
        {
            if(i == array.length-1)
            {
                System.out.print(i);
            }
            else
            {
                System.out.print(i + ", ");
            }
        }
    }

    public static int sum(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++)
        {
            result += array[i];
        }
        return result;
    }

    public static double average(int[] array) {
        double sum = sum(array);
        double length = array.length;
        double result = sum/length;
        return Math.floor(result * 100.0) / 100.0;
    }

    public static int minimum(int[] array) {
        int smallest = array[0];
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] < smallest)
            {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int maximum(int[] array) {
        int largest = array[0];
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] > largest)
            {
                largest = array[i];
            }
        }
        return largest;
    }

    public static int evenCount(int[] array) {
        int count = 0;
        for (int number: array)
        {
            if (number%2 == 0)
            {
                count+=1;
            }
        }
        return count;
    }

    public static int[] reverseOne(int[] array) {
        int length = array.length;
        int myArray[] = new int[length];
        int index = 0;
        for (int i = length-1; i >= 0; i--)
        {
            myArray[index] = array[i];
            index++;
        }
        return myArray;
    }

    public static void reverseTwo(int[] array) {
        int leftIndex = 0;
        int rightIndex = array.length -1;
        while (leftIndex < rightIndex)
        {
            int original = array[leftIndex];
            array[leftIndex] = array[rightIndex];
            array[rightIndex] = original;
            leftIndex++;
            rightIndex--;
        }
    }

    public static boolean linearSearchInt(int[] array, int num) {
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] == num)
            {
                return true;
            }
        }
        return false;
    }

    public static boolean linearSearchString(String[] array, String str) {
        for (int i = 0; i < array.length; i++)
        {
            if (array[i].equals(str))
            {
                return true;
            }
        }
        return false;
    }

    public static void multiplyByTwo(int[] array) {
        for (int i = 0; i < array.length; i++)
        {
            array[i] = array[i]*2;
        }

    }

    public static void multiplyByN(int[] array, int n) {
        for (int i =0; i < array.length; i++)
        {
            array[i] = array[i]*n;
        }

    }

    public static String toString(int[] array) {
        String result = "";
        for (int i = 0; i < array.length; i++)
        {
            result = result + array[i] + ", ";
        }
        result = result.substring(0,result.length()-2);
        return result;
    }

    public static boolean twoSum(int[] array, int num) {
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array.length; j++)
            {
                if(j != i && (array[j] + array[i] == num))
                {
                    return true;
                }
            }
        }
        return false;
    }

    public static void shiftRight(int[] array) {

        int end = array[array.length-1];
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = end;

    }

    public static void shiftLeft(int[] array) {
        int start = array[0];
        for (int i = 0; i<array.length-1; i++)
        {
            array[i] = array[i+1];
        }
        array[array.length-1] = start;

    }

    public static void shiftRightNTimes(int[] array, int n) {
        for (int i = 0; i < n; i++)
        {
            shiftRight(array);
        }

    }

    public static void shiftLeftNTimes(int[] array, int n) {
        for (int i = 0; i < n; i++)
        {
            shiftLeft(array);
        }

    }


}
