using System;
using System.Collections.Generic;

namespace Algorithms {
    class Program {

        static void Main(string[] args) {
            LinkedList<string> listOne = new LinkedList<string>();
            // Add Last
            // Add Frist
            listOne.AddLast("Sarah");
            listOne.AddLast("Sierra");
            listOne.AddLast("Ciara");
            listOne.AddLast("Becky");
            listOne.AddLast("Jess");

            Console.WriteLine(listOne.Contains("Jess"));
            Console.WriteLine(listOne.Count);

            listOne.RemoveFirst();
            
            foreach (string item in listOne)
            {
                Console.Write(item + "->");
            }
           
        }
    }
}