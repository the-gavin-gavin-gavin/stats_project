public class Main
{
    // This static method finds and returns the smallest integer in the supplied array "arr"
    public static int min(int [] arr)
    {
        int minNum = arr[0];
        for (int value : arr)
        {
            if (value < minNum)
            {
                minNum = value;
            }
        }
        return minNum;
    }

    // This static method finds and returns the largest integer in the supplied array "arr"
    public static int max(int [] arr)
    {
        int maxNum = arr[0];
        for (int value : arr)
        {
            if (value > maxNum)
            {
                maxNum = value;
            }
        }
        return maxNum;
    }

    /* This static method adds all of the elements in the array "arr", into the variable "sum", then returns
        "meanNum", which is a variable aqquired by dividing "sum" by the number of elements in the array */
    public static double mean(int [] arr)
    {
        double sum = 0.0;
        double meanNum = 0.0;
        for (double value : arr)
        {
            sum += value;
        }
        meanNum = sum/arr.length;
        return meanNum;
    }

    // 
    public static double median(int [] arr)
    {
        for (int i = 0; i<arr.length-2; i++)
        {
            for (int b = arr.length-1; b > i; b--)
            {
                if (arr[b]<arr[b-1])
                {
                    int temp = arr[b];
                    arr[b] = arr[b-1];
                    arr[b-1] = temp;
                }
            }
        }
        double get = arr.length;
        double chop = get/2;
        int medianNum = 0;
        if (chop % 1 == 0.5)
        {
            medianNum = (int) (chop);
            medianNum = arr[medianNum];
            return medianNum;
        }
        else 
        {
            int half = (int) (arr.length/2);
            double a1 = arr[half-1];
            double a2 = arr[half];
            double value = a1+a2;
            value = value/2;
            return value;
        }
    }

    //
    public static void main (String [] args)
    {
        int [] s1 = {37,97,25,38,73,94,83,47,36,46,8,17,45,11};
        System.out.println("Minimum: " + min(s1));
        System.out.println("Maximum: " + max(s1));
        System.out.println("Mean: " + mean(s1));
        System.out.println("Median: " + median(s1));
    }
}