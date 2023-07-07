using System;
using System.Collections.Generic;

namespace Algorithms {
    class Program {

        static Dictionary<int, int> displayFreqOfEachElement(int[] arr)
        {
            if (arr == null || arr.Length == 0) return new Dictionary<int, int>();

            Dictionary<int, int> countDictionary = new Dictionary<int, int>();

            foreach (int num in arr)
            {
                if (countDictionary.ContainsKey(num))
                {
                    countDictionary[num]++;
                } 
                else
                {
                    countDictionary.Add(num, 1);
                }
            }

            foreach(KeyValuePair<int, int> x in countDictionary)
            {
                Console.WriteLine(x.Key + " : " + x.Value);
            }

            return countDictionary; 
        } 

        static void Main(string[] args) {

            int[] arr1 = new int[] { 1, 2, 3, 2, 4, 3, 5, 2 };
            displayFreqOfEachElement(arr1);

            Console.WriteLine();

            int[] arr2 = new int[] { 7, 7, 7, 8, -1, -4, -1 };
            displayFreqOfEachElement(arr2);

            Console.WriteLine();

            int[] arr3 = new int[] {};
            displayFreqOfEachElement(arr3);

            Console.WriteLine();

            int[] arr4= null;
            displayFreqOfEachElement(arr4);

            Console.WriteLine();

            int[] arr5 = new int[] { 1 };
            displayFreqOfEachElement(arr5);
        }
    }
}