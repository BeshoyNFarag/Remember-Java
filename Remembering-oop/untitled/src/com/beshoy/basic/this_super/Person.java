/*
*
2. Class Student extends Person
Field: name (same name as parent → intentional shadowing)
Constructor:
Takes parentName, studentName
Calls super(parentName)
Initializes child name using this.name = studentName
Prints "Student constructor: " + studentName
Method:
display():
Print this.name
Print super.name
Call this.show()
Call super.show()
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

public class Person {

    protected String name;

    public Person(String name) {
        this.name = name;
        System.out.println("Person Constructor " + name);
    }

    public void show(){
        System.out.println("Person: " + name);
    }
}
