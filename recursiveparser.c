#include <stdio.h>
#include <string.h>
#include <ctype.h> // For isalpha()

char input[100]; // To store the input expression (like "a+b*c")
int i = 0;        // Current position in input

// Function declarations for grammar rules
void E();
void E_prime();
void T();
void T_prime();
void F();

// Function to print an error and exit
void error() {
    printf("Syntax error at position %d\n", i);
    exit(1);
}

// Matches a single expected character from the input
void match(char expected) {
    if (input[i] == expected) {
        i++; // move to the next character
    } else {
        error(); // if not matching, it's a syntax error
    }
}

// Rule: E → T E'
void E() {
    T();       // Parse the first term
    E_prime(); // Then check for + T recursively
}

// Rule: E' → + T E' | ε
void E_prime() {
    if (input[i] == '+') {
        match('+');    // Match the '+' symbol
        T();           // Parse another term
        E_prime();     // Check for more + terms
    }
    // If not '+', do nothing (ε = empty)
}

// Rule: T → F T'
void T() {
    F();        // Parse the first factor
    T_prime();  // Then check for * F recursively
}

// Rule: T' → * F T' | ε
void T_prime() {
    if (input[i] == '*') {
        match('*');    // Match the '*' symbol
        F();           // Parse the next factor
        T_prime();     // Check for more * factors
    }
    // If not '*', do nothing (ε = empty)
}

// Rule: F → (E) | id
void F() {
    if (input[i] == '(') {
        match('('); // match opening parenthesis
        E();        // parse the inner expression
        match(')'); // match closing parenthesis
    }
    else if (isalpha(input[i])) {
        match(input[i]); // match a variable like a, b, x (id = alphabet)
    }
    else {
        error(); // not a valid factor
    }
}

int main() {
    printf("Enter an expression: ");
    scanf("%s", input); // read input like "a+b*c"

    E(); // Start parsing from the start symbol E

    // If all input is consumed and no error, it's valid
    if (input[i] == '\0') {
        printf("Parsing successful: Valid expression\n");
    } else {
        printf("Parsing failed: Extra characters after parsing\n");
    }

    return 0;
}
