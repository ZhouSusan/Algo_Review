Challenge: Determine whether a given piece of text has matching parentheses.

It be considered matching, the opening symbol comes before the closing symbol and every open symbol has an associated close symbol. 

Matching:

* ((hello()))
* ()(hello())
* ((hello))
* (hello)

Not Matching:

* (hello(
* )hello)
* )hello(
* (algorithm
* hello(()
* ((hello)

