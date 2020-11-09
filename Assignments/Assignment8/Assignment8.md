# Assignment8

Yafei Sun

*Due Date: 11/13/2020 23:59 PST*

## Email Application

*Scenario: You are an IT Support Administrator Specialist and are charged with the task of creating email accounts for new hires.*

Your application should do the following:

* Generate an email with the following syntax: firstname.lastname@department.company.com

* Determine the department(sales, development, accounting), if none leave blank

  * We import the scanner to help us get input from the user, by adding `import java.util.Scanner` to the top of our program

* Generate a random String for a password

  * The password set is "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%"

* Have set methods to change the password, set the mailbox capacity, and define an alternate email address

* Have get methods to display the name, email and mailbox capacity

* Your output should be like the following:

  ```
  New Worker: John Smith. Department Codes:
  1 for Sales
  2 for Development
  3 for Accounting
  0 for none
  Enter department code: 
  2
  DISPLAY NAME: John Smith
  DEPARTMENT: dev
  COMPANY EMAIL: john.smith@dev.aeycompany.com
  PASSWORD: 76G0Y4BXOJ
  MAILBOX CAPACITY: 500mb
  ```

* **Please don't make any changes to the Email.java file**

## Tic Tac Toe Game

We're going to make a tic tak toe game in the console window. **It's you VS the computer!**

Your application should do the following:

* The program prints out a 3x3 board filled with dashes, signifying empty spots.
* Each turn it asks either player or CPU (your computer) to enter placement (1-9) which is where they want to place their x and o, and then the board is printed again with the x or o in the right spot.
* If the position the player or CPU entered is already has an x or o on it, then our program notifies the player, who is prompted to enter another placement.
* Once the player or CPU wins by getting 3 in a row, column, or diagonal, the program prints that player or CPU has won and prints out the final board.
* *I put some codes I wrote in ticTacToe.java file which can give some tips I think. You can just delete codes or functions I wrote if you come up with some other methods to finish the requirements.*

Requirements:

* Create a 3x3 array to represent the tic tac toe board and fill it

* Create a function that draws the board and prints it out like a 3*3 square

  ```
  public static void printGameBoard(char[][] gameBoard) {}
  ```

* Ask the user for the placement (1-9) and check if it is valid

  * We import the scanner to help us get input from the user, by adding `import java.util.Scanner` to the top of our program
  * If the user or CPU types a placement that is a spot that already has an X or O on it, then the placement isn't valid. We can use `while` loop to check this!

* Set the right position on the board to the player or CPU char

  ```
  public static void placePiece(char[][] gameBoard, int pos, String user) {}
  ```

* Create a function that checks if either player or CPU has won

  ```
  public static String checkWinner() {}
  ```

  * In tic tac toe, a player or CPU wins if they have 3 of their symbols in one row, column, or diagonal.
  * If player wins, we print "Congratulations you won!". If CPU wins, we print "CPU wins! Sorry:(". If we reach the end of our function, that means nobody has won, we can just print "CAT!".

* Check if the game has ended in a tie

  * Tic tac toe ends in a tie if nobody has won and the board is full. 

* The player (you) start to play firstly, then CPU (your computer) select a random position atomically to type. **This game is you VS your computer!**

  * We can use `while(true)` loop to let player and computer take turns selecting the placement. And the `while(true)` loop can be breaked until someone win or the board is full.

## Multithreading

1. Give a very large array of integers, find the maximum value within the array using multithreading.
2. **(Extra Credit)** 
   1. Write a BankAccount class which implements:
      1. deposit(int amount)
      2. withdraw(int amount)
      3. getBalance()
   2. Write a main function to simulate the back system. Use multi threading to randomly deposit of withdraw random amount.





















