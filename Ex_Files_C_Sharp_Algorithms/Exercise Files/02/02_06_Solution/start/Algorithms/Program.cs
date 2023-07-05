using System;

namespace Algorithms {
    class Program {
        static void RotateArrayLeft(int[] input) {
            if (input.Length == 0)
            {
                return;
            }

            int firstElem = input[0];
            for (int i = 0; i < input.Length-1; i++)
            {
                input[i] = input[i+1];
            }

            input[input.Length - 1] = firstElem;
        }

        static void RotateArrayRight(int[] input)
        {
            if (input.Length == 0 || input.Length == 1)
            {
                return;
            }

            int temp = input[input.Length-1];
            for (int i = input.Length-1; i > 0 ; i--)
            {
                input[i] = input[i-1];
            }

            input[0] = temp;
        }

        static void Main(string[] args) {
            int[] arr = { 1, 2, 3, 4, 5, 6 };
            // RotateArrayLeft(arr);
            RotateArrayRight(arr);
            Array.ForEach(arr, Console.WriteLine);
        }
    }
}
