package com.system.oopspractise;

public class RevisionConcept {

}

/*
 * String - it is a sequence of character which is immutable-> once the object is created then
 * it cannot be modify if you try to modify then new object will be created.
 * as every project major 90% part is used by string because it is secure but to optimize the 
 * memory because every time new object is created so it will consume memory there is SCP
 * after java 7 it is a part of heap before that it was a part of perm-gem metadata 
 * SCP is string constant pool whatever is inside the literals first scp will check that it is present 
 * there or not if it is present then it will return the same address to that content if it is not
 * there then it will created new object this help in memory optimization 
 * if a object which is in heap memory want to reffer to scp then there is a method named .intern()
 * it will check if object is present or not if object is not present inside heap memory it will 
 * copy form heap to scp and start pointing/reffering to it if it is present then it will return 
 * address.
 * 
 * now advantage is String is secure because no modification as it is immutable 
 * but it has a disadvantage of memory like if im using inside iterable so every time new object will
 * created it will consume a lot of memory to overcome
 * there is StringBuffer and StringBuilder they are mutable means both can be modify whenever we 
 * wanted to without creating new object this help in memory optimization
 * StringBuffer is thread safe it is scyncronized one thread at a time but it is slow
 * StringBuilder is not thread safe it is for single threaded environment it is fast from StringBuffer
 * the default capacity of String buffer and StringBuilder is 16 if you want to increase it it 
 * can be increase and if this capacity of char array is full then new will be allocated with new
 * capacity of 34 initial *2 +2 
 * 
 * first pillar of oops is encapsulation
 * --> binding the attributes with behaviour so that no one directly able to
 * modify attributes. it is done by using access modifiers( public, protected,
 * default, private ) modification can be done by using getter and setters
 */




/*
 * abstraction --> Hiding the core functionality and exposing the required functionality 
 * for example if Bankaccount class has a method to create account and there is one channel which 
 * does the creation if all these are public then any one can make there own channel and try 
 * to bypass some verification method thats why it is necessary to hide the core functionality 
 * it can be achieved by using access modifiers Low level abstraction  
 * 
 * Inheritance --> Derived class can access/inherit the attribute and behaviour of parent class 
 * is know as inheritance, it forms IS-A relationship
 * this help in resulability of code , scalability 
 * disadvantage is tightly coupled, high loading
 * 
 * there are four type of inheritance;
 * single level inheritance: where only one child can access/inherit the behaviour and attribute 
 * of parent class
 * multilevel inheritance : child class can inherit the behaviour and attribute of parent class and
 * that child can be parent of it child class
 * hirerchy inheritance : where multiple child can inherit the property of parent class
 * multiple inheritance: for classes it is not allowed in java it can be achieved in interface
 * it causes diamond problem due to which ambiguity arises
 * for example there is a parent class A and there is child class B,C which extends A 
 * three of them have a method name display() it is overridden by B and C so it does their own 
 * functionality now if one more class extends B and C and it calls the display method which one
 * will be called this arises ambiguity and that why in classes it is not supported by java know as
 * diamond problem
 * 
 * polymorphism: poly mean many phism means forms
 * so method can have different functionality with same name within a class is know as compile time
 * polymorphism also method overloading
 * there is no such rule for overloading just method signature should be different
 * like order, type, datatype should be different in method argument
 * 
 * method can behave differently based on the its object is know as overriding or run time polymorphism
 * overriding 
 * to achieve method overriding there are certain rules
 * method return type should be same or covariant
 * method name should be same 
 * method args, data type order should be same 
 * access modifier should be same or broder scope than parent not narrow scope
 * 
 * this refers to current object
 * super refers to parent object
 * 
 * this.method() refers to current object method
 * super.method() refers to parent object method
 * 
 * 
 *  constructor: it is a special type of method which is used to initilize the object attributes
 *  it is named as class name and does not have return type, first line of constructor is either this() or 
 *  super() 
 *  if in class there is no constructor then compiler will add default constructor
 *  there are two typer of constructor first is default constructor and parameterized constructor
 *  
 *  
 *  Instance intilization block --> it is executed when then new object is created inside heap
 *  the second line of construct is of init block 
 *  static initilization block --> it is executed once per class loading 
 */
