using System;
using System.Collections.Generic;

namespace Algorithms {
    class Program {
        static void Main(string[] args) {
            Queue<int> queue = new Queue<int>();

            queue.Enqueue(1);
            queue.Enqueue(2);
            queue.Enqueue(3);
            queue.Enqueue(4);
            queue.Enqueue(5);
            queue.Enqueue(6);

            Console.WriteLine(queue.Count);

            int removedItem = queue.Dequeue();
            Console.WriteLine(removedItem);
            Console.WriteLine(queue.Dequeue());
            Console.WriteLine(queue.Count);

            Console.WriteLine(queue.Peek()); //3

            int current;
            while (queue.TryDequeue(out current)) // pass in a variable to save the dequeued item with the out keyword
            {
                Console.WriteLine(current);
            }
        }
    }
}