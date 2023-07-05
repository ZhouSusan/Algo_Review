﻿using System;

namespace Algorithms
{
    class Program
    {
        static void ParseContents(string s)
        {
            Console.WriteLine("Option 1");
            foreach (char c in s)
            {
                Console.WriteLine(c);
            }

            Console.WriteLine("Option 2");

            for (int i = 0; i < s.Length; i++)
            {
                Console.WriteLine(s[i]);
            }
        }

        static Boolean IsAtEvenIndex(String s, char item)
        {
            if (String.IsNullOrEmpty(s))
            {
                return false;
            }

            for (int i = 0; i < s.Length/2+1; i+=2)
            {
                if (s[i] == item)
                {
                    return true;
                }
            }

            return false;
        }

        static void Main(string[] args)
        {
            Console.WriteLine("Hello World".ToLower().Contains("ll"));
            Console.WriteLine("Hello World".Contains("LL"));

            ParseContents("hello world");

            String input = "HeLLo";

            Console.WriteLine(IsAtEvenIndex(input, 'L'));
            Console.WriteLine(IsAtEvenIndex(input, 'T'));
            Console.WriteLine(IsAtEvenIndex(input, 'H'));
            Console.WriteLine(IsAtEvenIndex(null, 'G'));
            Console.WriteLine(IsAtEvenIndex("", 'e'));
        }
    }
}