# Challenge

The problem
-When synthesizing chemicals we need to be able to keep track of each batch. For Intellectual Property reasons each batch needs to be assigned a unique ID. We are looking for a program/service to take a positive integer and generate a deterministic unique ID (meaning that if the same integer is passed twice it will return the same Unique ID both times even when the solution is restarted and any in memory indexes are lost) which conforms to the following:

Minimum of 4 characters up to a maximum of 6 characters in length
All letters should be uppercase.
The first character must be a letter, but not a vowel.
the remaining characters can be letters or numbers
Example:
(note: this is not an expected ID output but just an example of a valid result)
Input: 2
ID Output: K3B1


This file is a java file and can be run on editor (Eclipse IDE,Netbeans) and on Windows machine.

The address of the file where data needs to be stored should be manually set(which for time being can be the desktop location/or the server ,wherever you need to store the file) .

Certain assumptions-
No null key will be allowed to stored ,so you have to given an input id to either retrieve the output and store the output(if you are entering it first time)

The Id to be stored wont take zero ,negative number and number greater than Integer.maxValue and less than integer.minValue.

The output id will be 4 -6 characters ,where the first character is a letter(not a vowel) and rest all are numbers.
