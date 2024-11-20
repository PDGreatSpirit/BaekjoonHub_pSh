#include <iostream>
#include <deque>

using namespace std;
int main() {
    cin.tie(NULL);
    cout.tie(NULL);
    int num;
    cin >> num;
    int type[num];
    deque<int> qs;
    for (int i = 0; i < num; i++) {
        int n;
        cin >> n;
        type[i] = n;
    }

    for (int i=0; i < num; i++) {
        int n;
        cin >> n;
        if(type[i]==0) {
            qs.push_front(n);
        }
    }

    int loc;
    cin >> loc;
    for (int i = 0; i < loc ; i++) {
            int x ;
            cin >> x;
            qs.push_back(x);
            cout << qs.front()<<  " ";
            qs.pop_front();
        }
    
    return 0;
}