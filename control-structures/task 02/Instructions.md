# Task 3.2: Value added tax calculation

Create a new Tax class and add a main method to the class.

The class should read a gross amount and VAT rate from the keyboard, and then calculate the corresponding net amount and
the VAT included.

After the calculation, the results should be appropriately displayed on the screen, e.g.

```
Please enter a gross amount: 500
Please enter a VAT rate: 0.19
Net amount: 420.1680672268908
Taxes: 79.8319327731092
Net amount formatted: 420.17 €
Tax rounded: 79.83 €
```

Use the following calculation formula:
net = gross / (1 + vat)

Use appropriate data types and name your variables in a meaningful way. Then test your programme with different values.

To format your text, please refer to this online tutorial:
https://books.trinket.io/thinkjava2/chapter3.html#sec38

So sth like this should work: `String.format(Locale.ENGLISH,"%1.2f €", net)`
