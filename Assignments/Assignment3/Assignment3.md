<h3>Assignment3</h3>

**Deadline：Dec 2, 23:59 PST **

+ Please submit .java files Extra credits are added only if total score is less than 10



<h4>1.(score: 5) Design a simple registration system  </h4>

 Design a simple registration system that allows Student to register in a course.

**Requirements**

+ using 2 classes: **class Student **& **class Course**. 
+ Implement the scenarios in **class Test’s main method**. 
+ Each student has a **name** and an **id** variable. 
+ Each object of class Student is initialized using values of **name** and **id** passed to constructor. 
+ Class Student has **get** methods for its instance variables.(getters and setters) 
+ Each Course has a **name**, and a variable **numberOfStudent** representing the number of registered students. 
+ A course can have a maximum number of 10 students registered in it. 
+ Class Course store the registered students in students which is an array of type Student. When a student register in a course, he is added to the array. Each object of class Course is initialized using the title(name). 
+ Class Course has the following methods: 
  + method getStudents(): return the array of registered students; 
  + method boolean isFull(): return true if the course is full, 
  + get method for the name and numberOfStudent field; 
  + method registerStudent (Student student): if the course is not full, register a student in course. 



<h4>2. (score: 5) reverse the string</h4>

Given an input string, reverse the string word by word. 

Example: Input: “The sky is blue”, 

output: “blue is sky the”.

1. A word is defined as a sequence of non-space characters.
2. Input string may contain leading or trailing spaces. However, your reversed string should **not** contain leading or trailing spaces.
3. You need to reduce multiple spaces between two words to a single space in the reversed string.

```java
public String reverse(String s) { }
```



<h4>3.(extra credits: 3) Using Builder Pattern</h4>

> The builder pattern is a design pattern designed to provide a flexible solution to various object creation problems in object-oriented programming. The intent of the Builder design pattern is to separate the construction of a complex object from its representation. 
>
> Advantages of the Builder pattern include:
>
> - Allows you to vary a product's internal representation.
> - Encapsulates code for construction and representation.
> - Provides control over steps of construction process.
>
> The builder pattern simplifies the creation of objects. It also simplifies the code as your do not have to call a complex constructor or call several setter methods on the created object.

**Requirements**

+ Try to refractor the Student class in the first question using builder pattern.

+ For this question please implement the builder class as the inner class. 

+ Example are provided in the folder name *Employee.java*

