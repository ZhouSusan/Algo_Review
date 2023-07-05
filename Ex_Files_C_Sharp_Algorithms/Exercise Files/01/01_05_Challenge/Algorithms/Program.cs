using System;
using System.Text;

namespace Algorithms
{
    class Program
    {

        static String ReverseEachWord(String input) {
            if (string.IsNullOrEmpty(input) || input.Length == 1)
            {
                return input;
            }

            StringBuilder sb = new StringBuilder(input.Length);
            string[] words = input.Split(" ");
            for (int i = 0; i < words.Length; i++)
            {
                sb.Append(Reverse(words[i]));
                if (i != input.Length-1)
                {
                    sb.Append(" ");
                }
            }

            return sb.ToString();
        }

        static String Reverse(String input) {
            if (string.IsNullOrEmpty(input) || input.Length == 1) {
                return input;
            }

            char[] arr = input.ToCharArray();
            Array.Reverse(arr);
            return new String(arr);
        }

        static void Main(string[] args) {
            Console.WriteLine(ReverseEachWord("Taylor is a great worker"));
            Console.WriteLine(ReverseEachWord(null));
            Console.WriteLine(ReverseEachWord("racer racecar madam"));
            Console.WriteLine(ReverseEachWord("what can I do today"));
            Console.WriteLine(ReverseEachWord(" "));
        }
    }
}