# Extract Method
------------------------------------

> You have a code fragment that can be grouped together.
> Turn the fragment into a method whose name explains the purpose of the method.

## Motivation

- A method that is **too long**.
- A method containing some code **needs a comment** to understand its purpose.

## Benefit

- It increases the chances that other methods can use a method when the method is finely grained.
- It allows the high-level methods to read more like a series of comments.
- Overriding is easier when the method is finely grained.
