Edit String

This program prompts a user for a string and then repeatedly prompts the user for changes to the string, until the user enters X , indicating the end of changes. 
Legal change operations are 
U - make all letters uppercase
L - make all letters lowercase
R - reverse the string
C ch1 ch2 - change all occurence of ch1 to ch2
Z - undo the most recent change 

# code explanantion 

- Used scanner to read user input
- Used string builder to be able to modify the content of the string builder object without creating a new one
- Used a main loop to accept commands
- Used switch statement to handle different operations
- For the C ch1 to ch2 command, I created a method .
- For the U command, i converted the string to uppercase.
- For the L command, i converted the string to lowercase.
- For the R command, i reversed the characters of the string.
- For the Z command, i undid the most recent change by reverting to the original string. 




