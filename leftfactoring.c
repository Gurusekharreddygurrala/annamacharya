#include <stdio.h>
#include <string.h>

// Function to find common prefix of two strings
void findCommonPrefix(char *s1, char *s2, char *prefix) {
    int i = 0;
    while (s1[i] == s2[i] && s1[i] != '\0') {
        prefix[i] = s1[i];
        i++;
    }
    prefix[i] = '\0'; // End the prefix string
}

int main() {
    char nonTerminal[10];
    char prod1[100], prod2[100], prefix[100];

    printf("Enter Non-terminal (e.g., A): ");
    scanf("%s", nonTerminal);

    printf("Enter First Production (e.g., ab): ");
    scanf("%s", prod1);

    printf("Enter Second Production (e.g., ac): ");
    scanf("%s", prod2);

    // Find the common prefix
    findCommonPrefix(prod1, prod2, prefix);

    int prefixLen = strlen(prefix);

    if (prefixLen == 0) {
        // No common prefix → no left factoring
        printf("No left factoring needed.\n");
        printf("%s → %s | %s\n", nonTerminal, prod1, prod2);
    } else {
        // Perform left factoring
        printf("\nLeft Factored Grammar:\n");
        printf("%s → %s%s'\n", nonTerminal, prefix, nonTerminal); // A → aA'
        printf("%s%s' → %s | %s\n", nonTerminal, nonTerminal,
               &prod1[prefixLen], &prod2[prefixLen]); // AA' → b | c
    }

    return 0;
}
