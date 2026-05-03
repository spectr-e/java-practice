# Exercise 2.3 — Number Utilities Library

Create `NumberUtils.java` with 6 static utility methods of your own design:

- `isPrime(int n)` — returns true if n is prime

Solution
```
      [ NUMBER N ]

           |
           v
   +-------+-------+
   |   N < 2 ?     |-----> [ NO ] 🛑 (Exit False)
   +-------+-------+

           | [ YES ]
           v
   +-------+-------+
   |  2 or 3 ?     |-----> [ YES ] ✅ (Exit True)
   +-------+-------+

           | [ NO ]
           v
   +-----------------------+
   | Divisible by 2 or 3?  |-----> [ YES ] 🛑 (Exit False)
   +-----------------------+

           | [ NO ]
           v
   [ START THE LOOP ] <-------------------+
           |                              |
           v                              |
   +-----------------------+              |

   | Is (i * i) > N ?      |-----> [ YES ] ✅ (Exit True)
   +-----------------------+              |

           | [ NO ]                       |
           v                              |
   +-----------------------+              |

   | Check Traps:          |              |
   | Is N % i == 0 ?       |-----> [ YES ] 🛑 (Exit False)
   | Is N % (i+2) == 0 ?   |              |
   +-----------------------+              |

           | [ NO ]                       |
           v                              |
   [ Jump 6: i = i + 6 ] -----------------+
```

- `factorial(int n)` — returns n! (use a loop, not recursion yet)
- `fibonacci(int n)` — returns the nth Fibonacci number
- `isPalindrome(int n)` — true if n reads same forwards and backwards (e.g. 121)
- `sumOfDigits(int n)` — sum of all digits
- `reverseNumber(int n)` — reverses digits (123 → 321)

1. Write a main that calls each one
2. and prints results for several inputs.