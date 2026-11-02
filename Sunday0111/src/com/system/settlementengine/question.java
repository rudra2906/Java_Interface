package com.system.settlementengine;

public class question {

}
/*Scenario: Every stock exchange trade goes through an abstract Base Exchange Order (which tracks SEBI registration in a 
 * static block, generates an audit state in an instance block, and overrides equals() to prevent duplicate order IDs) 
 * while also signing a SEBI Settlement Interface.

Requirements (Choose your own names and data types):

Settlement Interface:

1 abstract method to calculate brokerage, 1 default method to generate a contract note (which calls a Java 9 private 
interface helper to attach a digital signature), and 1 static method to compute STT (Securities Transaction Tax).

Abstract Base Class (Implements the Interface partially or leaves it to subclasses):

SIB: Initialize a static exchange code (e.g., "NSE_EQ").

IIB: Set default order status to "PENDING_VALIDATION".

Attributes: Order ID, stock ticker (pool in SCP via .intern()), quantity, price per share.

Object.equals(Object obj) Override: Safely downcast Object to check if two orders have the same Order ID and stock ticker.

Two Concrete Subclasses (Intraday Equity Order & Delivery Equity Order):

Extend the abstract base class and implement the brokerage calculation (e.g., Intraday charges 0.03% capped at ₹20; 
Delivery charges ₹0 brokerage).

Independent Processor Class:

Write a settlement processor method that accepts the Interface or Abstract Parent reference (Upcasting) and processes both 
Intraday and Delivery orders polymorphically without if-else chains.

Evaluation Criteria:

Combining an Abstract Class lifecycle (SIB, IIB, Constructor) with a Java 8/9 Interface (6 marks)

Overriding Object.equals(Object) with safe explicit downcasting and .intern() pooling (5 marks)

Intraday vs. Delivery polymorphic implementations (4 marks)

Open/Closed Processor class and Driver testing (5 marks)
 * 
 */
