## [Java Currency Formatter](https://www.hackerrank.com/challenges/java-currency-formatter)

Given a [double-precision](https://en.wikipedia.org/wiki/Double-precision_floating-point_format) number, `payment`, denoting an amount of money, use the [NumberFormat](https://docs.oracle.com/javase/8/docs/api/java/text/NumberFormat.html) class' [getCurrencyInstance](https://docs.oracle.com/javase/8/docs/api/java/text/NumberFormat.html#getCurrencyInstance-java.util.Locale-) method to convert `payment` into the US, Indian, Chinese, and French currency formats. 

Then print the formatted values as follows:
````
    US: formattedPayment
    India: formattedPayment
    China: formattedPayment
    France: formattedPayment
````
where formattedPayment is payment formatted according to the appropriate Locale's currency.
**Note:**  India does not have a built-in [Locale](https://docs.oracle.com/javase/8/docs/api/java/util/Locale.html), so you must construct one where the language is en (i.e., English).

**Input Format**

A single double-precision number denoting `payment`.

**Constraints**
* ` 0 <= payment <= 1000000000`

**Output Format**
* On the first line, print US: u where  is  formatted for US currency.
* On the second line, print India: i where  is  formatted for Indian currency.
* On the third line, print China: c where  is  formatted for Chinese currency.
* On the fourth line, print France: f, where  is  formatted for French currency.

**Example**
````
Sample Input
12324.134

Sample Output
US: $12,324.13
India: Rs.12,324.13
China: ￥12,324.13
France: 12 324,13 €
Explanation

Each line contains the value of payment formatted according to the four countries' respective currencies.
````