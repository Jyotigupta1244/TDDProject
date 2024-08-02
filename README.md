# TDDProject

1)the requirements for the StringCalculator based on the examples you provided, you'll need to ensure the following functionality:

    Handle an empty string: It should return 0.
    Handle a single number: It should return the number itself.
    Handle multiple comma-separated numbers: It should return the sum of those numbers.


2)Empty String: If numbers is an empty string, the method returns 0.
3)Single Number: If numbers contains only one number, it splits the string by commas (though there are no commas in this case), converts it to an integer, and returns it.
4)Comma-Separated Numbers: If numbers contains multiple numbers separated by commas, the method splits the string by commas, converts each part to an integer.
5)To handle any number of numbers in the add method, you'll need to ensure the method can manage both the scenario where there are multiple comma-separated numbers and the scenario.
6)To extend the StringCalculator to support custom delimiters specified in the format //[delimiter]\n[numbers...].
7)The provided implementation and test cases cover all the specified scenarios.
