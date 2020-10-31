<h3>Assignment 7</h3>

+ Max score is 10. 
+ Deadline is 11:59PM PST, Nov 6th

+ Extra credit are added only if total score is less than 10.

  

<h4>Question 1 [4pt]</h4>

Write a program that calculate the sum value in an array of ints using 4 threads. You should construct an 4,000,000 long array of random numbers and return the sum of the array. Please finish those two method: generateRandomArray and sum.

```java
public class SumValue {

 /*generate array of random numbers*/
 static void generateRandomArray(int[] arr){
 }
 /*get sum of an array using 4 threads*/
 static long sum(int[] arr){
 return 0;
 }
 public static void main(String[] args){
 int[] arr = new int[4000000];
 generateArray(arr);
 long sum = sum(arr);
 System.out.println("Sum: " + sum);
 }
}
```



<h4>Question 2 [6pt]</h4>

The hospital room can hold at most 1 doctor and 3 patients. There are two passes to assess the room, one for doctor, one for patient. Each pass only allows one person to enter or leave the room at a time. The two passes works independently. 

Please use the `HospitalRoom.java`  provided in the assignment package to implement your code.

The main method has been implemented and please don't change any already existed code.

The console output should be same as below. The sequence of doctors and patients is random. But you should print the same sentence when a doctor or patient is doing something.

```
Doctor siva Entered, number of doctor 1
Patient p1 entered, number of patients 1
Doctor john is waiting to Enter, number of doctor 1
Patient p4 entered, number of patients 2
Patient p3 entered, number of patients 3
Patient p2 is waiting to enter, number of patients 3
Patient p5 is waiting to enter, number of patients 3
Patient p4left
Doctor siva Left, number of doctor 0
Patient p2 entered, number of patients 3
Doctor john Entered, number of doctor 1
Patient p3left
Patient p1left
Patient p5 entered, number of patients 2
Patient p2left
Doctor john Left, number of doctor 0
Patient p5left
```





<h4>Extra Points [2pt]</h4>

Write a program called ReverseHello.java that creates a thread (let's call it Thread 1). Thread 1 creates another thread (Thread 2); Thread 2 creates Thread 3; and so on, up to Thread 50. 

Each thread should print `Hello from Thread num!`

but you should structure your program such that the threads print their greetings in reverse order.

