package searchArray;

public class searchArray
{
    public static void main(String[] args) {
        int[] nums = {9, 13, 14, 10, 8};

        // search the array for the value 23
        int results = sequentialSearch(nums, 23);

        if (results == -1)
            System.out.println("There is no value in this array that equals 23");
        else
            System.out.println("The value was found at position " + results);

    }

    public static int sequentialSearch(int[] array, int value)
    {
        int i = 0; // controls the index of the array
        int element = -1; // the position where the value was found
        boolean found = false; //did we find the value? no

        // search the array
        while (!found && i < array.length)
        {
            if (array[i] == value)// if we find the value
            {
                found = true;
                element = i;

            }
            i++;
        }
        return element;
    }
}

