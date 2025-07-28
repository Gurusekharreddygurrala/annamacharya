#include <stdio.h>
#include <string.h>

int main() {
    char input[100];
    char alpha[20], beta[20];
    char nonTerminal;

    printf("Enter production (e.g., A->Aa|b): ");
    scanf("%s", input);

    nonTerminal = input[0]; // Get the non-terminal (e.g., A)

    // Check if left recursion exists (A->Aa|b → input[3] == A)
    if (input[3] == nonTerminal) {
        // Extract alpha part (after A in Aa)
        alpha[0] = input[4]; // e.g., 'a'
        alpha[1] = '\0';     // make it a string

        // Extract beta part (after | symbol)
        int i = 5; // find where '|' is
        while (input[i] != '|' && input[i] != '\0') {
            i++;
        }

        beta[0] = input[i + 1]; // the symbol after '|' 
        beta[1] = '\0';

        // Print left factored grammar
        printf("Left Recursion Detected!\n");
        printf("%c -> %s%c'\n", nonTerminal, beta, nonTerminal);
        printf("%c' -> %s%c' | ε\n", nonTerminal, alpha, nonTerminal);
    } else {
        // No left recursion
        printf("No Left Recursion.\n");
        printf("%s\n", input);
    }

    return 0;
}
