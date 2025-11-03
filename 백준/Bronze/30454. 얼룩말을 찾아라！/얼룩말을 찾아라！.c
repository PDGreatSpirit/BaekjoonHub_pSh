#include <stdio.h>

int main() {
    int N, W;

    scanf("%d %d", &N ,&W);
    int best[W+1] ;
    for (int i = 0; i < W+1; ++i) {
        best[i] = 0;
    }
    for(int i = 0 ; i < N ; i++) {
        char arr[W+1];
        scanf("%s" , arr);
        int color = 2;
        int colors[2] = {0,0};
        for (int j = 0; j < W; j++) {
            if(color != arr[j] - '0') {
                colors[arr[j]- '0']++;
                color = arr[j]- '0';
            }
        }
        best[colors[1]]++;
    }
    for (int i = W; i >= 0 ; i--) {
        if(best[i] != 0 ) {
            printf("%d %d", i,best[i]);
            return 0;
        }
    }
}