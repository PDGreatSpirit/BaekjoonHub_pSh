#include <stdio.h>
#include <stdlib.h>

int main(int argc,char *argv[]){
    float max = 0;
    int k;
    for ( int i = 0 ; i < 3 ; i++) {
        int a, b , p , w;
        scanf("%d %d" , &a, &b);
        p = a*10; w = b*10;
        if( p >= 5000) p= p- 500;
        float h = (float)w/(float)p;
        if(max <= h) {
            k = i;
            max = h;
        }

    }
    if(k == 0) printf("S");
    else if(k == 1) printf("N");
    else printf("U");

    return 0;

}