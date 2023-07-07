using System;
using System.Collections.Generic;

namespace Algorithms {
    class Employee {

        string name;
        int id;
        string department;

        public Employee(string name, int id, string department) {
            this.name = name;
            this.id = id;
            this.department = department;
        }

        static void Main(string[] args) {
            Employee employee = new Employee("Robby", 3827, "Technology");
            Employee employee2 = new Employee("Bobby", 9415, "Marketing");
            Employee employee3 = new Employee("Sally", 2519, "Sales");

            Dictionary<int, Employee> employeesById = new Dictionary<int, Employee>();
            employeesById.Add(employee.id, employee);
            employeesById.Add(employee2.id, employee2);
            employeesById.Add(employee3.id, employee3);

            // if the key exists in the dictionary and it has an employee value, it will be stored in e
            Employee e;
            if (employeesById.TryGetValue(9415, out e))
            {
                Console.WriteLine(e.name + " : " + e.department);
            }

            Console.WriteLine(employeesById.ContainsKey(1235));
            Console.WriteLine(employeesById.ContainsKey(3827));

            HashSet<string> productCodes = new HashSet<string>();
            productCodes.Add("8F26B");
            productCodes.Add("0A43P");
            productCodes.Add("J2H762");

            Console.WriteLine(productCodes.Contains("45HT21"));
            Console.WriteLine(productCodes.Contains("J2H762"));
        }
    }
}