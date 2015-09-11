CPEN 221 - Fall 2015 - MP0
===
Fibonacci Numbers

## Background

We will start our foray into the elements of software construction with the classic question of computing the Fibonacci numbers.

All students of computing should know about the Fibonacci numbers. If you do not know about the history of the Fibonacci numbers, [Wikipedia](https://en.wikipedia.org/wiki/Fibonacci_number) is a click away.

The Fibonacci numbers are recursively defined, but the recursion here is a trivial form of recursion and we will explore more sophisticated recursive operations and structures in this course.

The Fibonacci Sequence is a sequence of integers, Fibonacci(0), Fibonacci(1), Fibonacci(2), ... that is described as follows:
```
  Fibonacci(0) = 0
  Fibonacci(1) = 1
  Fibonacci(n) = Fibonacci(n-1)+Fibonacci(n-2) for n >= 2
```
Thus the first few numbers of the sequence are 1, 1, 2, 3, 5, 8, 13, 21, 34, 55.

For the many of you that are also completing a course on differential equations in parallel, you should keep in mind that recurrences such as the Fibonacci recurrence are also called *difference equations* and one can obtain closed-form expressions for the sequence using techniques that are identical to solution techniques for ordinary differential equations.

This first machine problem is to help you get started with Java, Git and GitHub, so the programming difficulty itself is quite low. You have two tasks to complete:

1. Develop a method to compute the n<sup>th</sup> Fibonacci number and plot the execution times for the computation of the first 60  Fibonacci numbers as a graph.

1. Develop a method to test if a given number *n* is a Fibonacci number or not.