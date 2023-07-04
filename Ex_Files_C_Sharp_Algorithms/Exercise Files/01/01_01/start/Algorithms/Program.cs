using System;
using System.Linq;

namespace Algorithms
{
    class Program
    {

        static Boolean IsUppercase(string s)
        {
            return s.All(char.IsUpper);
        }

        static Boolean IsLowerCase(string s)
        {
            return s.All(char.IsLower);
        }
        static void Main(string[] args)
        {
            Console.WriteLine(IsUppercase("hello"));
            Console.WriteLine(IsUppercase("HELLO"));

            Console.WriteLine(IsLowerCase("HELLO"));
            Console.WriteLine(IsLowerCase("hello"));
        }

    }
}