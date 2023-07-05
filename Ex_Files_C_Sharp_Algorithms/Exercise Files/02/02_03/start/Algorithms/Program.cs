using System;
using System.Collections;

namespace Algorithms {
    class Program {
        static int[] FindEvenNums(int[] arr1, int[] arr2) {
            ArrayList evenNumList = new ArrayList();
            foreach (int num in arr1)
            {
                if (num % 2 == 0)
                {
                    evenNumList.Add(num);
                }
            }

            foreach(int n in arr2)
            {
                if (n % 2 == 0)
                {
                    evenNumList.Add(n);
                }
            }

            // Convert the result into an int array and then return it from the function
            return (int[])evenNumList.ToArray(typeof(int));
        }

        static void Main(string[] args) {
            int[] arr1 = {-8, 2, 3, -9, 11, -20};
            int[] arr2 = {0, -2, -9, -39, 39, 10, 7};

            int[] evenArr = FindEvenNums(arr1, arr2);
            Array.ForEach(evenArr, Console.WriteLine);
        }
    }
}