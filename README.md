# Cracking the Coding Interview Questions Template

## Progess
On Page: 91

Skipped Problems:
Chapter 1 - Arrays and Strings: #7, #8

## Notes
### Big O
O(log x) < O(x) < O(x log x) < O(x^2) < O(2^x) < O(x!) 

- When you see a problem where # of elements in problem space gets halved each time, it'll likely be O(log n) runtime (example: finding an element in a balanced binary search tree).
- When you have a recursive function that makes multiple calls, the runtime will usually look like O(branches^depth) where branches is the # of times each recursive call branches.

VI.1: n
VI.2: n
VI.3: 1
VI.4: 1 --- a/b
VI.5: log n
VI.6: sqrt n
VI.7: n
VI.8: n
VI.9: a*b --- n^2
VI.10: 1 --- log n
VI.11: n*s --- kc^k
VI.12: n^2 --- blogb + alogb

### Arrays and Strings
StringBuilder can help with creation of strings (don't have to recopy x characters for a string/allocate new space for a string).

```StringBuilder sentence = new StringBuilder();```


Questions for preparing for technical interviews, placed into java files.
From the 6th Edition of "Cracking the Coding Interview" by Gayle Laakmann Mcdowell