package com.system.taxengine;

public class Question {
/*
 * Question 2: Interface Inheritance (extends) & Method Overloading — IRCTC Quota & Tax Engine (Total: 15 Marks)
Concepts Tested: One interface extending another interface (interface B extends A), overloading abstract methods inside an interface (from the end-of-class Q&A), 
StringBuilder masking, and Object.equals(Object obj).

Parent Interface (IBaseFareRule):

Overloaded Abstract Contracts:

calculateFare (1 parameter: base distance in km)

calculateFare (2 parameters: base distance in km, and coach class code like "3A" or "EC")

Child Interface (ITatkalFareRule extends IBaseFareRule):

Constant: TATKAL_MIN_SURGE (set to 300).

Additional Abstract Contract:

applyTatkalDynamicPricing — takes the calculated base fare and current seat occupancy percentage, and returns the final Tatkal fare.

Implementing Class (VandeBharatBooking implements ITatkalFareRule):

Attributes: pnrNumber, passengerName, govIdNumber (12-digit ID), distanceKm.

Core Functionality (Hidden):

maskGovId — uses StringBuilder to mask the first 8 digits of govIdNumber so only the last 4 digits are visible (e.g., "********4321").

Contract Implementation:

Must implement all 3 abstract methods inherited across IBaseFareRule and ITatkalFareRule.

generateTicketSummary — prints the ticket receipt with the masked ID and final Tatkal fare using StringBuilder.

Duplicate Booking Check (Object.equals):

Override equals(Object obj) using explicit downcasting so two VandeBharatBooking objects are considered equal if they share the same pnrNumber.

Evaluation Criteria:

Interface inheritance (ITatkalFareRule extends IBaseFareRule) and overloaded abstract methods (4 marks)

Implementing all 3 inherited contracts in VandeBharatBooking (4 marks)

Encapsulation, private maskGovId using StringBuilder, and equals(Object obj) downcasting (4 marks)

Driver testing overloaded methods via interface references and duplicate PNR check (3 marks)
 */
}
