using System;
using System.Collections.Generic;


namespace Algorithms {
    class Program {

        static List<int> findMissingElements(int[] arr1, int[] arr2)
        {
            if (arr1 == null && arr2 == null  || arr1 == null && arr2.Length == 0 || arr1.Length == 0 && arr2 == null || arr1.Length == 1 && arr2.Length == 0 )
            {
                return new List<int>();
            }

            HashSet<int> firstArrSet = new HashSet<int>();
            List<int> missingElementResult = new List<int>();

            for (int i = 0; i < arr2.Length; i++)
            {
                firstArrSet.Add(arr2[i]);
            }

            foreach (int i in arr1)
            {
                if (!firstArrSet.Contains(i))
                {
                    missingElementResult.Add(i);
                }
            }

            return missingElementResult;
        }

        static void Main(string[] args) {
            findMissingElements(new int[] { 1, 2, 3, 4, 5, 6 },
                new int[] { 1, 2 }).ForEach(Console.WriteLine);

            Console.WriteLine();

            findMissingElements(new int[] { 3, 2, 8, 4},
               new int[] { 5, 7, 3, 0, 2 }).ForEach(Console.WriteLine);

            findMissingElements(new int[] {},
              new int[] {}).ForEach(Console.WriteLine);


            findMissingElements(new int[] {}, 
                null).ForEach(Console.WriteLine);

            findMissingElements(null,
             new int[] { }).ForEach(Console.WriteLine);

            findMissingElements(null,
              null).ForEach(Console.WriteLine);
        }
    }
}