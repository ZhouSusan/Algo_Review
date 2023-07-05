using System;
using System.Runtime.InteropServices.WindowsRuntime;
using System.Text;

namespace Algorithms
{
    class Program
    {

        static String ReverseString(String s)
        {
            if (String.IsNullOrEmpty(s) || s.Length == 1)
            {
                return s;
            }

            StringBuilder sb = new StringBuilder(s.Length);

            for (int i = s.Length-1; i >= 0; i--)
            {
                char c = s[i];
                sb.Append(c);
            }

            return sb.ToString();
        }

        static String ReverseInPlace(String s)
        {
           if (String.IsNullOrEmpty (s) || s.Length == 1)
            {
                return s;
            }

            char[] arr = s.ToCharArray();
            Array.Reverse(arr);
            return new string(arr);
        }

        static void Main(string[] args)
        {
            // Console.WriteLine(ReverseString("Hello World"));
            // Console.WriteLine(ReverseString(""));
            // Console.WriteLine(ReverseString("tacos!"));
            // Console.WriteLine(ReverseString("H"));
            // Console.WriteLine(ReverseString(null));

            Console.WriteLine(ReverseInPlace("Hello World"));
            Console.WriteLine(ReverseInPlace(""));
            Console.WriteLine(ReverseInPlace("tacos!"));
            Console.WriteLine(ReverseInPlace("H"));
            Console.WriteLine(ReverseInPlace(null));
        }
    }
}