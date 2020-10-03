# Assignment4

Yafei 10/02/2020

Finish before **Oct 9, 2020 23:59 PST**, late work is penalized and not accepted

Please submit .java files

1. **(Score: 2) Kth Largest Element in an Array**

   Find the **k**th largest element in an unsorted array. Note that it is the kth largest element in the sorted order, not the kth distinct element.

   * **Example 1:**

     ```Input: [3, 2, 1, 5, 6, 4] and k = 2 Output: 5```

   * **Example 2:**

     ```Input: [3,2,3,1,2,4,5,5,6] and k = 4 Output: 4```

   * **Note:**

     * You may assume k is always valid, 1 ≤ k ≤ array's length.
     * Inplement the test cases in class Test's main method. Please don't forget to consider about the corner cases.

2. **The Circle and Cylinder Classes**

   | Circle - Superclas                                           |
   | :----------------------------------------------------------- |
   | -radius: double = 1.0<br />-color: String = "red"            |
   | +Circle()<br />+Circle(radius: double)<br />+Circle(radius: double, color: String)<br />+getRadius(): double<br />+setRadius(radius: double): void<br />+getColor(): String<br />+setColor(color: String): void<br />+getArea(): double // return the area of this Circle |

   | Cylinder - Subclass                                          |
   | ------------------------------------------------------------ |
   | -height: double = 1.0                                        |
   | +Cylinder()<br />+Cylinder(height: double)<br />+Cylinder(height: double, radius: double)<br />+Cylinder(height: double, radius: double, Color: String)<br />+getHeight(): double<br />+setHeight(height: double): void<br />+getVolume(): double // return the volume of this Cylinder. Please use Circle's getArea() method |

   * The class Cylinder inherits all the member variables and methods from its superclass Circle

   * The class Cylinder defines a variable called height, two public methods and its own constructors

   * **(Score: 5)** Implement 2 classes: class **Circle** and class **Cylinder**

   * **(Score: 2)** A test Drive for the Cylinder Class(TestCylinder.java)

     * ```
       public class TestCylinder {
          public static void main(String[] args) {
          
             //Constructed a Circle with Circle()
             //Run of the program should produce the following output:
             //Radius is 2.0, Color is yellow, Base area is (your answer)
             
             //Constructed a Cylinder with Cylinder()
             //Run of the program should produce the following output:
             //Radius is 1.0, Height is 1.0, Color is red, Base area is (your answer), Volume is (your answer)
       
             //Constructed a Cylinder with Cylinder(height, radius)
             //Run of the program should produce the following output:
             //Radius is 2.0, Height is 5.0, Color is red, Base area is (your answer), Volume is (your answer)
          }
       }
       ```

   * **(Score: 1)**  override the `getArea()` to compute the surface area of the cylinder in the subclass `Cylinder`

     * ```
       public class Cylinder extends Circle {
          ......
          // Override the getArea() method inherited from superclass Circle
          @Override
          public double getArea() {
             
          }
       }
       ```

   * **Note:**
     * The area of the Circle: `πr^2`
     * The volume of the Cylinder: `πr^2h`
     * The area of the Cylinder: `2πr(r+h)`

   

   

   

   

