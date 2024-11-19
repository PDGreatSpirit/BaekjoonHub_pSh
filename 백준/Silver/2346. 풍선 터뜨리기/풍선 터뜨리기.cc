    #include <iostream>
    #include <deque>

    using namespace std;
    void pushPopFQueue(deque<int*>& q) {
        q.push_back(q.front());
        q.pop_front();
    }

    void pushPopBQueue(deque<int*>& q) {
        q.push_front(q.back());
        q.pop_back();
    }
    int main() {
        int n; // 첫 번째 입력: 요소의 개수
        cin >> n;

        deque<int*> q;

        for (int i=0 ; i< n; i++) {
            int* value = new int[2];
            cin >> value[0];
            value[1] = i+1;
            q.push_back(value);
        }

        while (!q.empty()) {
            int* value= q.front();
            cout << value[1] << " ";
            q.pop_front();
            if(value[0] > 0)
                for(int i =1; i < value[0] ; i++)
                    pushPopFQueue(q);
            else
                for(int i = 0; i< -value[0] ; i++)
                pushPopBQueue(q);
        }

        return 0;
    }