using System;

namespace Algorithms {
    class Program {

        static int? LinearSearch(int[] input, int n) {
            if (input == null || input.Length == 0)
            {
                return null;
            }

            for (int i = 0; i < input.Length; i++)
            {
                if (input[i] == n)
                {
                    return i+1;
                }
            }
            
            return null;
        }

        static void Main(string[] args) {
            int[] arr = {1, 2, 3, 4, 5, 6 };
            Console.WriteLine(LinearSearch(arr, 4));
            Console.WriteLine(LinearSearch(arr, 8));

            int item = Array.Find(arr, element => element == 4);
            int item2 = Array.Find(arr, elem => elem == 100);
            Console.WriteLine(item);
            Console.WriteLine(item2);

            int[] greaterThanFiveArr = Array.FindAll(arr, n => n >= 5);
            Array.ForEach(greaterThanFiveArr, Console.WriteLine);
        }
    }
}