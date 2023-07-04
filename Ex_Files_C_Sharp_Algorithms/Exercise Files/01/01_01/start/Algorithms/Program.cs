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

        static Boolean isPasswordComplex(string s) {
            return (s.Any(char.IsUpper) 
                && s.Any(char.IsLower) 
                && s.Any(char.IsDigit));
        }

        static void Main(string[] args)
        {
            Console.WriteLine(IsUppercase("hello"));
            Console.WriteLine(IsUppercase("HELLO"));

            Console.WriteLine(IsLowerCase("HELLO"));
            Console.WriteLine(IsLowerCase("hello"));

            Console.WriteLine(isPasswordComplex("h1TTo"));
            Console.WriteLine(isPasswordComplex("1234"));
            Console.WriteLine(isPasswordComplex("tofu"));
            Console.WriteLine(isPasswordComplex("T0asT"));
            Console.WriteLine(isPasswordComplex("TEANE"));
            Console.WriteLine(isPasswordComplex(""));
        }

    }
}