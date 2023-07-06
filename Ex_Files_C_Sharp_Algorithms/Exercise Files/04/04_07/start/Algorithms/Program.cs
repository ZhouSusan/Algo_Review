using System;
using System.Collections.Generic;

namespace Algorithms {
    class Program {
        static void printNextGreaterElement(int[] arr) {
            if (arr == null || arr.Length == 0)
            {
                return;
            }

            Stack<int> arrNums = new Stack<int>();
            arrNums.Push(arr[0]);

            for (int i = 1; i < arr.Length; i++)
            {
                int next = arr[i];
                if (arrNums.Count > 0)
                {
                    int popped = arrNums.Pop();

                    while (popped < next)
                    {
                        Console.WriteLine(popped + " --> " + next);
                        if (arrNums.Count == 0)
                        {
                            break;
                        }
                        // increment popped
                        popped = arrNums.Pop();
                    }

                    if (popped > next)
                    {
                        arrNums.Push(popped);
                    }
                }

                arrNums.Push(next);
            }

            while (arrNums.Count > 0)
            {
                Console.WriteLine(arrNums.Pop() + " --> " + -1);
            }
        }

        static void Main(string[] args) {
            int[] arr = new int[] {15, 8, 4, 10};
            int[] arr2 = new int[] {2};
            int[] arr3 = new int[] {2, 3};
            int[] arr4 = new int[] {};

            printNextGreaterElement(arr);
            printNextGreaterElement(arr2);
            printNextGreaterElement(arr3);
            printNextGreaterElement(arr4);
        }
    }
}