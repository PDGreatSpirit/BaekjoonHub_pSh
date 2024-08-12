N = int(input())  # N 입력 받기
arr = list(map(int, input().split()))  # 숫자 입력 받기
count = 0  # 소수 세기


def is_prime(num):
    if num < 2:  # 2보다 작은 수는 소수가 아님
        return False
    for i in range(2, num):  # 2부터 num-1까지 모든 수로 나누어봄
        if num % i == 0:  # 나누어 떨어지면 소수가 아님
            return False
    return True  # 위에서 나누어 떨어지는 수가 없으면 소수


for num in arr:  # 주어진 숫자 배열 반복
    if is_prime(num):
        count += 1

print(count)
