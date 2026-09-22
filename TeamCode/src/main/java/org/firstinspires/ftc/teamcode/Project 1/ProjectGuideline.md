# John’s Ice Cream Store Simulation

## Scenario

John is setting up an ice cream store. He needs Java classes to represent customer orders, calculate prices, record flavors, and handle special orders.

Create the classes described below. The purpose of this activity is to demonstrate that you can use each required Java concept correctly. You do not need to create a complete application or user interface.

## Files to Create

Create these four files:

1. `OrderSize.java` — an enum for the available order sizes
2. `IceCreamOrder.java` — an abstract parent class for a standard order
3. `SpecialIceCreamOrder.java` — a child class for an order with an additional special fee
4. `StoreSimulation.java` — contains a `simulateDay()` method that creates and works with orders; do not add a `main` method

## Part 1 OrderSize Enum

Create an enum named `OrderSize` with these constants:

- `SMALL`
- `MEDIUM`
- `LARGE`

The enum must be used as the data type of an instance variable in `IceCreamOrder`. It must also be used in a `switch` statement later in the activity.

## Part 2 Abstract IceCreamOrder Class

Declare `IceCreamOrder` as an abstract class.

### Instance Variables

Declare these six instance variables as `private`:

- `String customerName` — the name on the order
- `int scoopCount` — the number of scoops ordered
- `double pricePerScoop` — the price of one scoop
- `boolean paid` — whether the customer has paid
- `OrderSize size` — the selected order size
- `String[] flavors` — the flavors included in the order

These fields demonstrate `String`, `int`, `double`, `boolean`, an enum type, and an array.

### Constructor and This

Create a constructor that receives one parameter for each instance variable. Use `this` to assign every parameter to the matching field.

The constructor must prevent an order from starting with a negative `scoopCount` or `pricePerScoop`. Replace either invalid value with `0`.

### Encapsulation

Create getter methods for `customerName`, `scoopCount`, `paid`, and `size`.

Create these setters:

- `setScoopCount(int scoopCount)` — change the field only when the parameter is `0` or greater
- `setPricePerScoop(double pricePerScoop)` — change the field only when the parameter is greater than `0`
- `setPaid(boolean paid)` — update the payment status

Do not access the private fields directly from another class. Use getters, setters, or other public methods.

## Part 3 IceCreamOrder Methods

Add all of the following methods to `IceCreamOrder`.

### calculateSubtotal

Create `public double calculateSubtotal()`.

- Multiply `scoopCount` by `pricePerScoop`.
- Store the result in a local `double` variable.
- Return the result.

This method demonstrates arithmetic operators, a local variable, and a return value.

### estimatePreparationMinutes

Create `public int estimatePreparationMinutes()`.

- Multiply the number of scoops by `1.5` to produce a `double` estimate.
- Explicitly cast the result to an `int`.
- Return the cast value.

This method demonstrates type casting.

### getOrderMessage

Create `public String getOrderMessage()` using an `if / else if / else` statement.

- If `scoopCount` is `0`, return a message stating that the order is empty.
- Otherwise, if `scoopCount` is greater than `0` **and** `paid` is `false`, return a message stating that payment is required.
- Otherwise, return a message stating that the order is ready to prepare.

This method must use comparison, logical, and boolean operators.

### getContainerType

Create `public String getContainerType()` using a `switch` on `size`.

- `SMALL` returns `"Small cup"`.
- `MEDIUM` returns `"Medium cup"`.
- `LARGE` returns `"Large cup"`.

### hasFlavor

Create `public boolean hasFlavor(String targetFlavor)`.

- Use a `for` loop to examine the `flavors` array.
- Compare each flavor with `targetFlavor`.
- Set a local boolean variable to `true` when a match is found.
- Use `break` to stop searching after the first match.
- Return the boolean result.

### countValidFlavors

Create `public int countValidFlavors()`.

- Use a `for` loop to examine the `flavors` array.
- If an element is `null` or empty, use `continue` to skip it.
- Count and return the remaining flavors.

### prepareScoops

Create `public int prepareScoops()`.

- Declare a local counter starting at `0`.
- Use a `while` loop that continues until the counter equals `scoopCount`.
- Increase the counter once during every repetition.
- Return the final counter value.

### addScoop Method Overloading

Create two methods named `addScoop`:

- `public void addScoop(String flavor)` increases `scoopCount` by `1`.
- `public void addScoop(String flavor, int quantity)` increases `scoopCount` by `quantity` only when `quantity` is greater than `0`.

The two methods must have different parameter lists to demonstrate method overloading. Use the `flavor` parameter meaningfully by placing it into an available position in the `flavors` array.

### Abstract Method

Declare `public abstract double calculateTotal();`.

Do not write a method body in the parent class. The child class will decide how the final total is calculated.

## Part 4 SpecialIceCreamOrder Child Class

Create a class named `SpecialIceCreamOrder` that extends `IceCreamOrder`.

### Additional Field and Constructor

- Add a private `double specialFee` field.
- Create a constructor that accepts the six parent-class values and the special fee.
- Use `super(...)` as the first constructor statement to send the parent values to the `IceCreamOrder` constructor.
- Use `this.specialFee` to assign the remaining parameter.
- If the special fee is negative, store `0` instead.

### Overridden Method

Override `calculateTotal()` and add the `@Override` annotation.

- Call `calculateSubtotal()` to obtain the parent-class subtotal.
- Add `specialFee` to the subtotal.
- If the subtotal is at least `$20.00`, subtract a 10% discount before adding the fee.
- Return the final total.

This method must demonstrate inheritance, method overriding, arithmetic, and an `if / else` decision.

## Part 5 StoreSimulation Class

Create a `StoreSimulation` class with a method named `public void simulateDay()`. Do not create a `main` method.

Inside `simulateDay()`:

1. Create a `String[]` containing at least five flavor names.
2. Create one `SpecialIceCreamOrder` object using realistic constructor values.
3. Declare an `IceCreamOrder` variable and assign the `SpecialIceCreamOrder` object to it.
4. Call `calculateTotal()` through the `IceCreamOrder` variable to demonstrate polymorphism.
5. Call both overloaded versions of `addScoop`.
6. Call `getOrderMessage`, `getContainerType`, `hasFlavor`, `countValidFlavors`, `prepareScoops`, and `estimatePreparationMinutes`.
7. Use at least one getter and one validated setter.

The parent-type variable must call the overridden child method. This is the required example of polymorphism.

## Submission Checklist

- [ ] `OrderSize` contains `SMALL`, `MEDIUM`, and `LARGE` and is used in the class logic.
- [ ] `IceCreamOrder` is abstract and contains all six required private fields.
- [ ] The parent constructor uses `this` and validates negative numeric values.
- [ ] Getters and validated setters demonstrate encapsulation.
- [ ] Arithmetic, comparison, logical, and boolean operators are used as directed.
- [ ] `estimatePreparationMinutes` demonstrates explicit type casting.
- [ ] `getOrderMessage` uses `if / else if / else`.
- [ ] `getContainerType` uses a switch with all three enum values.
- [ ] The array is processed with a `for` loop, `break`, and `continue`.
- [ ] `prepareScoops` uses a `while` loop.
- [ ] Both overloaded `addScoop` methods are included.
- [ ] Methods demonstrate parameters, return values, and correct local-variable scope.
- [ ] `SpecialIceCreamOrder` uses `extends`, `super`, and `@Override`.
- [ ] `calculateTotal` implements the special fee and discount rules.
- [ ] `simulateDay` demonstrates object creation and polymorphism without a `main` method.
