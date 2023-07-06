using System;
using System.Collections.Generic;

namespace Algorithms {
    class Program {
        
         static Boolean hasMatchingParentheses(string s) {
            if (String.IsNullOrEmpty(s) || s.Length == 1)
            {
                return false;
            }

            int openingParaenthesis = 0;

            for (int i = 0; i < s.Length; i++)
            {
                if (s[i] == '(')
                {
                    openingParaenthesis++;
                }

                if (s[i] == ')')
                {
                    if (openingParaenthesis == 0)
                    {
                        return false;
                    }
                    else
                    {
                        openingParaenthesis--;
                    }
                }
            }
            return openingParaenthesis == 0;
        }

        static void Main(string[] args) {
            Console.WriteLine(hasMatchingParentheses("((hello()))"));
            Console.WriteLine(hasMatchingParentheses("()(hello())"));
            Console.WriteLine(hasMatchingParentheses("((hello))"));
            Console.WriteLine(hasMatchingParentheses("(hello)"));

            Console.WriteLine();

            Console.WriteLine(hasMatchingParentheses("(hello("));
            Console.WriteLine(hasMatchingParentheses(")hello)"));
            Console.WriteLine(hasMatchingParentheses(")hello("));
            Console.WriteLine(hasMatchingParentheses("hello(("));
            Console.WriteLine(hasMatchingParentheses("(hello"));
            Console.WriteLine(hasMatchingParentheses("((hello)"));
            Console.WriteLine(hasMatchingParentheses("("));
            Console.WriteLine(hasMatchingParentheses(""));
            Console.WriteLine(hasMatchingParentheses(null));
        }
    }
}