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

        static void Main(string[] args) {
            int[] arr = { 1, 2, 3, 4, 5, 6 };
            int[] arr2 = {-15};
            int[] arr3 = {};
            int[] arr4 = null;

            Array.ForEach(Reverse(arr), Console.WriteLine);
            Array.ForEach(Reverse(arr2), Console.WriteLine);
            Array.ForEach(Reverse(arr3), Console.WriteLine);
            Array.ForEach(Reverse(arr4), Console.WriteLine);
        }
    }
}