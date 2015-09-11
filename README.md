CPEN 221 - Fall 2015 - MP0
===
**Fibonacci Numbers**

### Important Notes
* Due September 18, by 6:00 p.m.
* This is an *individual* assignment and you cannot use any late days for this assignment.

### Background

We will start our foray into the elements of software construction with the classic question of computing the Fibonacci numbers.

All students of computing should know about the Fibonacci numbers. If you do not know about the history of the Fibonacci numbers, [Wikipedia](https://en.wikipedia.org/wiki/Fibonacci_number) is a click away.

The Fibonacci numbers are recursively defined, but the recursion here is a trivial form of recursion and we will explore more sophisticated recursive operations and structures in this course.

The Fibonacci Sequence is a sequence of integers, Fibonacci(0), Fibonacci(1), Fibonacci(2), ... that is described as follows:
```
  Fibonacci(0) = 0
  Fibonacci(1) = 1
  Fibonacci(n) = Fibonacci(n-1)+Fibonacci(n-2) for n >= 2
```
Thus the first few numbers of the sequence are 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55.

For the many of you that are also completing a course on differential equations in parallel, you should keep in mind that recurrences such as the Fibonacci recurrence are also called *difference equations* and one can obtain closed-form expressions for the sequence using techniques that are identical to solution techniques for ordinary differential equations.

This first machine problem is to help you get started with Java, Git and GitHub, so the programming difficulty itself is quite low. You have two tasks to complete:

1. Develop a method to compute the n<sup>th</sup> Fibonacci number and plot the execution times for the computation of the first 55  Fibonacci numbers as a graph.

1. Develop a method to test if a given number *n* is a Fibonacci number or not.

### Details

#### Step 1: Grabbing the starter source code

1. You will start work by obtaining the initial code provided in this GitHub repository. To do so, open up a terminal (on a Linux or Mac OS X system) or Git Bash (on a Windows system), and then change your working directory to the workspace directory for Eclipse. You can use the `cd` command to achieve this.

1. Once you have changed your working directory to the Eclipse workspace directory, you can clone this repository using the following command:

``git clone https://github.com/CPEN-221/mp0-fall2015``

#### Step 2: Opening a new project in Eclipse

Once you have cloned the repository, you can create a new Eclipse project for this machine problem.

You do this by starting Eclipse and then selecting the following menu item: `File -> New -> Java Project`. You will be asked to provide a project name, and if you had cloned files to the correct location then you can simply enter `mp0-fall2015` as the project name and Eclipse will auto-complete the remaining entries in the `New Project` window, and you can select `Finish`.

#### Step 3: Implementing the required methods

When you open up the project in Eclipse, in the Package Explorer frame you should see two [packages](https://docs.oracle.com/javase/tutorial/java/package/packages.html): `fibonacci1` and `fibonacci2`.

You will have to implement a method in each of these packages. The exact files where you will write code are `Fibonacci.java` in the package `fibonacci1` and `CheckFib.java` in `fibonacci2`. The methods that you will have to implement will have a comment that starts with `TODO`. You may also notice that Eclipse marks up these comments in a special manner near the line numbers.

Implement the methods requested. You should find this part of the task easy if you are comfortable with iterative structures (`for` loops, for example) and conditional structures (`if` statements) in a language like C. 

#### Step 4: Submitting your work

There are two parts to submitting your work.

1. You will submit your code to a specific repository on GitHub. Instructions on which repository to use and how to submit your work will be updated closer to the submission date.

1. You will create a PDF document with (i) the graph that shows the running times for the first 55 Fibonacci numbers and (ii) a short discussion (one paragraph) on whether it is easier to test if a number is a Fibonacci number or whether it is easier to generate the Fibonacci numbers. The exact format for this document will also be made available in a few days and you will submit this document using Gradescope.

(This last section will be updated with complete instructions in a few days.)