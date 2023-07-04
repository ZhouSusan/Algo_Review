using System;

namespace Algorithms {

    class Program {
        static int findMaximum(int a, int b, int c) {
            int max = a;
            if (b > max)
            {
                max = b;
            }

            if (c > max)
            {
                max = c;
            }

            return max;
        }

        static void Main(string[] args) {
            Console.WriteLine(findMaximum(1, 2, 3));
            Console.WriteLine(findMaximum(8, 8, 1));
            Console.WriteLine(findMaximum(3, 2, 3));
            Console.WriteLine(findMaximum(1, 1, 9));
            Console.WriteLine(findMaximum(1, 9, 9));
        }
    }
}