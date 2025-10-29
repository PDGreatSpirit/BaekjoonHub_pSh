#include <stdio.h>

int main() {
    int N, W, H, L;

    scanf("%d %d %d %d", &N, &W, &H, &L);

    int max_cows_in_barn = (W / L) * (H / L);

    if (max_cows_in_barn < N) {
        printf("%d\n", max_cows_in_barn);
    } else {
        printf("%d\n", N);
    }

    return 0;
}