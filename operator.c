#include<stdio.h>
#include <string.h>
int main(){
    char ch[10];
    printf("enter ch");
    scanf("%s",&ch);
    if(strcmp(ch,"+")==0||strcmp(ch,"-")==0||
strcmp(ch,"*")==0||strcmp(ch,"/")==0){
    printf("valid operator");
}
else{
    printf("not valid operator:");
}
}