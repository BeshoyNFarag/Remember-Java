/*
*

3. Main class
Create a Student object:
Student s = new Student("John", "Alex");
s.display();
What you are testing
Constructor chaining (super(...))
Variable shadowing (this.name vs super.name)
Method inheritance (this.show() vs super.show())
Expected output (try to predict before running)
Person constructor: John
Student constructor: Alex
Alex
John
Person: Alex
Person: John
* */
package com.beshoy.basic.this_super;

public class Student extends Person {

    protected String firstName;
    protected String lastName;


    public Student(String firstName, String lastName) {
        super(firstName);
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Student Constructor: " + firstName);

    }

    public void display() {
        System.out.println(super.name);
        System.out.println(this.firstName);
        this.show();
        super.show();

    }




}
