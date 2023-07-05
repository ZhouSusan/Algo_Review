using System;

namespace Algorithms {
    class Program {
        static int[] Reverse(int[] input) {

            if (input == null)
            {
                return new int[0]; 
            }

            if (input.Length == 0 || input.Length == 1)
            {
                return input;
            }

            int[] reversed = new int[input.Length];
            for (int i = 0; i < input.Length; i++)
            {
                reversed[i] = input[input.Length-1-i];
            }
            return reversed;
        }

        static void ReverseInPlace(int[] arr)
        {
            if (arr.Length == 0 || arr.Length == 1) 
            {
                return;
            }

            int low = 0;
            int high = arr.Length - 1;

            while (low < high)
            {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;

                low++;
                high--;
            }
        }

        static void Main(string[] args) {
            int[] arr = { 1, 2, 3, 4, 5, 6 };
            int[] arr2 = {-15};
            int[] arr3 = {};
            int[] arr4 = null;

            // Array.ForEach(Reverse(arr), Console.WriteLine);
            // Array.ForEach(Reverse(arr2), Console.WriteLine);
            // Array.ForEach(Reverse(arr3), Console.WriteLine);
            // Array.ForEach(Reverse(arr4), Console.WriteLine);

            ReverseInPlace(arr);
            Array.ForEach(arr, Console.WriteLine);
            ReverseInPlace(arr2);
            Array.ForEach(arr2, Console.WriteLine);
            ReverseInPlace(arr3);
            Array.ForEach(arr3, Console.WriteLine);
        }
    }
}