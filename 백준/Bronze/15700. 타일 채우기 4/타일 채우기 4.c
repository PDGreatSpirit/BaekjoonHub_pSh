#include <stdio.h>
#include <stdlib.h>

int main(int argc,char *argv[]){
    long long  a, b;
    scanf("%lld %lld"  ,&a ,&b );
    if ((a*b) % 2 == 0) printf("%lld" , (a*b)/2);
    else printf("%lld" , (a*b-1)/2);


    return 0;

}