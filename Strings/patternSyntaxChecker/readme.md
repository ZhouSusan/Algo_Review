## [Pattern Syntax Pattern](https://www.hackerrank.com/challenges/pattern-syntax-checker) 

Using **Regex**, we can easily match or search for patterns in a text. 
Before searching for a pattern, we have to specify one using some well-defined syntax.

In this problem, you are given a pattern. 
You have to check whether the syntax of the given pattern is valid.

**Note:** In this problem, a regex is only valid if you can compile it using the [Pattern.compile](http://docs.oracle.com/javase/6/docs/api/java/util/regex/Pattern.html#compile%28java.lang.String%29) method.

**Input Format**

The first line of input contains an integer `N`, denoting the number of test cases. 
The next `N` lines contain a string of any printable characters representing the pattern of a regex.

**Output Format**

For each test case, print _Valid_ if the syntax of the given pattern is correct. 
Otherwise, print _Invalid_. Do not print the quotes.

Example 
````
Sample Input
3
([A-Z])(.+)
[AZ[a-z](a-z)
batcatpat(nat

Sample Output
Valid
Invalid
````