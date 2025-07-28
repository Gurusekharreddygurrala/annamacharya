#include <stdio.h>

int main() {
    int n, i;
    char str[10][100]; // Array to store 10 strings of max 100 characters each

    printf("Enter number of strings: ");
    scanf("%d", &n);

    for (i = 0; i < n; i++) {
        printf("Enter string %d: ", i + 1);
        scanf("%s", str[i]); // Only accepts single-word input
    }

    printf("\nYou entered:\n");
    for (i = 0; i < n; i++) {
        printf("%s\n", str[i]);
    }

    return 0;
}
