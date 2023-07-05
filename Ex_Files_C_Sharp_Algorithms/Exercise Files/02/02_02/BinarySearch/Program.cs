using System;

namespace Algorithms
{
    class Program
    {

        static Boolean BinarySearch(int[] inputArray, int item)
        {
            if (inputArray == null || inputArray.Length == 0)
            {
                return false;
            }

            int low = 0;
            int high = inputArray.Length - 1;
            int mid; 

            while (low <= high)
            {
                mid = (low + high) / 2;
                if (item == inputArray[mid])
                {
                    return true;
                }
                else if (item < inputArray[mid])
                {
                    high = mid - 1;
                }
                else
                {
                    low = mid + 1;
                }
            }

            return false;
        }

        static void Main(string[] args)
        {
            int[] arr = { 1, 2, 3, 4, 5, 6 };
            int[] arr2 = new int[0];
            int[] arr3 = null;

            Console.WriteLine(BinarySearch(arr, 5));
            Console.WriteLine(BinarySearch(arr, 1));
            Console.WriteLine(BinarySearch(arr, 4));

            Console.WriteLine(BinarySearch(arr, -9));
            Console.WriteLine(BinarySearch(arr2, 3));
            Console.WriteLine(BinarySearch(arr3, 5));
        }
    }
}