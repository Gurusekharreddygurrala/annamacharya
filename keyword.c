#include <stdio.h>
#include <string.h>
char *keywords[]={"int","float","double","long"};
int main(){
    int i;
    char word[10];
    printf("enter a word:");
    scanf("%s",&word);
for(i=0;i<4;i++){
    if(strcmp(keywords[i],word)==0)
    {
        printf("it is an keyword");
        break;
    }
    else{
        printf("not a keyword");
        break;
    }
}
}