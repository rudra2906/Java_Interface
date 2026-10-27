
public class questions {

}

/*
 * Problem 1: Multi-Tier Payment Gateway & Dynamic Routing Engine (Razorpay / BillDesk)
Total: 20 Marks

Concepts Tested: Upcasting, Safe Explicit Downcasting, Covariant Return Types, Runtime Polymorphism, 
Practical Abstraction, and String.intern().

Real-World Context:
Payment aggregators route transactions through different rails (UPI, Card, NetBanking). The engine must dynamically produce gateway 
response receipts using a covariant factory method, optimize merchant identifiers across millions of hits in the String Constant Pool (SCP),
 and allow client-specific downcasting to invoke low-level rail diagnostics without breaking overall abstraction.

Architecture & Requirements:
Base Class — TransactionRequest:

Attributes: transactionId, merchantName, amount, currency

Behavior:

Validate that amount is strictly greater than zero and normalize merchantName in the SCP.

Exposed Gateway: processPayment() — returns a base PaymentReceipt reference containing base transaction info built using StringBuilder.

Covariant Method Hook: getReceiptDetails() — return type declared as PaymentReceipt.

Base Return Type — PaymentReceipt:

Attributes: receiptId, status, finalAmount

Behavior: Method to generate a summary string of the receipt.

Specialized Return Type — CardPaymentReceipt (Extends PaymentReceipt):

Attributes: authCode, cardNetwork

Behavior: Overrides receipt summary to append the authorization code and network.

Child Class — CardTransactionRequest (Extends TransactionRequest):

Attributes: cardNumber, cardNetwork, cvv

Core Functionality (Hidden / Private):

maskCardNumber(): Uses StringBuilder to mask all but the last 4 digits (e.g., "************3421").

verifyCvv(): Validates that the CVV is either 3 or 4 digits.

calculateMdrFee(): Calculates a 1.75% Merchant Discount Rate on amount.

Required Overriding:

Override processPayment() to execute the hidden steps in order and return a new CardPaymentReceipt.

Override getReceiptDetails() using a Covariant Return Type (declaring the return type specifically as CardPaymentReceipt instead of PaymentReceipt).

Rail-Specific Diagnostic (Not in Parent):

trigger3dSecureChallenge(): Simulates OTP/Biometric secondary authentication.

Driver / Processor Class Requirements:

Demonstrate Upcasting: assign a CardTransactionRequest instance to a TransactionRequest reference and invoke processPayment().

Demonstrate Covariant Return: show that calling getReceiptDetails() directly on a CardTransactionRequest reference allows calling card-specific methods without manual casting.

Demonstrate Safe Downcasting: take the upcasted parent reference, verify safety, downcast back to CardTransactionRequest, and call trigger3dSecureChallenge().

Add a commented-out section showing an invalid downcast that would trigger a runtime ClassCastException, with a comment explaining why the JVM throws it.

Evaluation Criteria:
Optimal data types, zero/negative validation, and SCP interning: 4 Marks

Practical abstraction (private core steps vs public gateway): 5 Marks

Method overriding and covariant return type implementation: 5 Marks

Safe downcasting, dynamic dispatch, and ClassCastException demonstration: 6 Marks









Problem 2: Centralized Railway Booking & Quota Allocation Engine (IRCTC)
Total: 20 Marks

Concepts Tested: Static Initialization Blocks (SIB), Instance Initialization Blocks (IIB), 3-Level Multilevel Constructor Chaining (this() and super()), 
Overriding Object.equals(Object obj), and Access Modifier Widening.

Real-World Context:
When IRCTC boots, global Indian Railway quota rules load once into memory. Every time an individual booking object is instantiated, 
an internal audit tracking sequence runs before the constructor completes. If a passenger attempts to re-book an existing itinerary on the same train,
 the system catches duplicates by overriding equals() using downcasting.

Architecture & Requirements:
Level 1 Base Class — RailwayBooking:

Static Members: railwayZoneCode, maxAdvanceBookingDays

Instance Members: pnrNumber, trainNumber, passengerName, baseFare, bookingStatus

Class Lifecycle:

Use a Static Initialization Block (SIB) to initialize railwayZoneCode ("IR-CENTRAL") and maxAdvanceBookingDays (120), logging a startup configuration string.

Use an Instance Initialization Block (IIB) to automatically assign bookingStatus as "INITIATED" and generate an internal timestamp before any constructor body executes.

Constructors (Constructor Chaining via this(...)):

Constructor 1: Accepts pnrNumber, trainNumber, passengerName, and baseFare. Chains to Constructor 2.

Constructor 2: Accepts all fields plus an explicit status if overriding default behavior.

Behavior:

calculatePayableFare(): Defined with protected access; returns baseFare.

Override public boolean equals(Object obj): Downcast Object to RailwayBooking and check whether both pnrNumber and trainNumber match.

Level 2 Intermediate Class — TatkalBooking (Extends RailwayBooking):

Attributes: tatkalPremiumRate

Behavior:

Constructor chains to super(...).

Override calculatePayableFare(): Widen the access modifier from protected to public. Add Tatkal charges (e.g., 30% of baseFare).

Level 3 Derived Class — PremiumTatkalBooking (Extends TatkalBooking):

Attributes: dynamicSurgeMultiplier

Behavior:

Constructor chains through super(...).

Override calculatePayableFare(): Multiplies the Tatkal fare by the dynamic surge rate.

Driver Requirements:

Instantiate two separate RailwayBooking objects with identical pnrNumber and trainNumber but different heap references. Compare them using == and .equals() to verify address comparison vs content comparison.

Instantiate a PremiumTatkalBooking object and verify through console logs the execution sequence of SIB, IIB, and constructors across all 3 levels.

Demonstrate access modifier widening: verify that calculatePayableFare() can now be accessed publicly from any package on a TatkalBooking or PremiumTatkalBooking reference.

Evaluation Criteria:
Correct execution timing and syntax of SIB and IIB: 5 Marks

3-level constructor chaining using this() and super(): 5 Marks

Proper overriding of Object.equals(Object obj) with downcasting: 5 Marks

Access modifier widening and cumulative fare math: 5 Marks







Problem 3: Multi-Channel Cart Checkout & Loyalty Engine (Flipkart / Myntra)
Total: 20 Marks

Concepts Tested: Compile-Time Polymorphism (Method Overloading) + Runtime Polymorphism (Method Overriding via Parent Reference) + 
Open/Closed Principle (SOLID) + StringBuilder Memory Optimization.

Real-World Context:
An e-commerce order processing engine supports different order categories (Standard Retail, Grocery/Supermart, and 
Electronics with mandatory insurance). The central checkout processor must remain closed for modification (Open/Closed Principle) while
 handling diverse customer billing options via method overloading.

Architecture & Requirements:
Base Class — CartOrder:

Attributes: orderId, customerEmail, rawCartTotal

Behavior:

Validation ensuring rawCartTotal is non-negative.

computeFinalBill(): Returns rawCartTotal plus a standard platform packaging fee.

Subclass 1 — GroceryCartOrder (Extends CartOrder):

Attributes: refrigeratedBagFee, minimumFreeDeliverySlot

Behavior:

Override computeFinalBill(): Adds cold-storage packaging fees. If rawCartTotal is below minimumFreeDeliverySlot, appends a delivery surcharge.

Subclass 2 — ElectronicsCartOrder (Extends CartOrder):

Attributes: extendedWarrantyCharge, transitInsuranceFee

Behavior:

Override computeFinalBill(): Appends both warranty and mandatory transit insurance to the bill.

Independent Processor — CheckoutProcessingEngine (Does NOT inherit from CartOrder):

Behavior (Compile-Time Overloading + Runtime Dispatch):

Overload 1: processCheckout(CartOrder order) — Accepts any order via upcasting, executes computeFinalBill() dynamically, and prints the generated invoice using StringBuilder.

Overload 2: processCheckout(CartOrder order, String couponCode) — Validates couponCode. If matches "FLIPKART50", applies a flat discount before calculating final payable amount.

Overload 3: processCheckout(CartOrder order, String couponCode, boolean useSuperCoins, int superCoinBalance) — Combines the coupon check with SuperCoin redemption (e.g., each coin = ₹1 discount, up to a maximum cap of 20% of order value).

Driver Class Requirements:

Create instances of GroceryCartOrder and ElectronicsCartOrder.

Pass both child instances to all 3 overloaded versions of processCheckout() in CheckoutProcessingEngine.

In comments, identify which method calls are resolved at compile time (overload resolution based on signature) and which are resolved at runtime (dynamic dispatch on computeFinalBill()).

Evaluation Criteria:
Architecture: Independent processor using parent reference (Open/Closed Principle): 5 Marks

Method overloading design with distinct, unambiguous signatures: 5 Marks

Correct runtime overriding and StringBuilder receipt formatting: 5 Marks

Driver verification and written explanation of Compile-Time vs Runtime binding: 5 Marks

Take your time to analyze the requirements, select the cleanest data types and access levels, and build the classes. When you are ready, share your code for whichever problem you tackle first, and we will run a full evaluation!
 */
