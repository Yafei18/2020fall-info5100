<h3>Questions:</h3>

Given a few circumstances, try to think in objects and design the objects and behaviors for each question. Use the pseudo code to describe a certain sequence of invoking behaviors and objects. Try to think as much details as you can and come up with the solution independently.

1. Design a course management system (Like Canvas);
2. Design a pet adoption platform

3. Design an app to book airline ticket.

4. Design a course registration platform.

5. Order food in a food delivery app.(Like Uber Eats)



>**Example: Process of buying a computer on Online shop**
>
> *- Customer*:
>
>+ Data: emailAddress, Name, loginCredentials, Address, Phone, credit card
>+ Behaviors: logIn, Buy, writeReview, requestCancelOrder, requestRefund, Search, writeReview
>
> *- Online shop*:
>
>+ Data: Computers
>+ Behaviors: sendReceipt, checkOut, refund, sendToShipper, 
>
> *- Computer*:
>
>+ Data: Brand, Size, Price, Color
>+ Behaviors: 
>
>*- Delivery Service Company:*
>
>+ Data: Couriers
>+ Behaviors: allocateCourier, Ship
>
>*- Courier:*
>
>+ Data: Name,
>+ Behaviors: deliverPackage, contactCustomer
>
>**Sequence of invoking behaviors on objects**
>
>```java
>Customer emma;
>OnlineShop amazon;
>DeliveryServiceCompany ups;
>emma.login(loginCredentials);
>Computer macbook = emma.search(brand, size, price, color);
>if amazon isInStock 
>  emma.buy(macbook);
>  amazon.checkout(emma.address, emma.phone, emma.creditCard);
>  amazon.sendReceipt(emma.emailAddress);
>  if emma change her mind
>    emma.requestCancelOrder(macbook);
>    amazon.refund(macbook, emma);
>  else
>    amazon.sendToShipper(macbook, ups);
>    ups.ship(macbook);
>    Courier jamie = ups.allocateCourier;
>    jamie.contactCustomer(emma);
>    jamie.deliverPackage(macbook, emma.address);
>    if emma satisfied with the product
>      emma.writeReview("*****");
>    else
>      emma.writeReview("ooooo");
>      emma.requestRefund(macbook, amazon);
>      amazon.refund(emma);
>else product outOfStock
>```



<h3>Requirements:</h3>

1. Use pseudo code.
2. Write the objects (with data and behaviors) and sequence of invoking behaviors on objects. (you can reference the example above)
3. Create a repo in you github(the github account should be same in the google spreadsheet) and upload the assignment on that repo.
4. You can upload your assignment in .md or .pdf
5. Due date is Friday, Sep 18th,  11:59pm PST.

