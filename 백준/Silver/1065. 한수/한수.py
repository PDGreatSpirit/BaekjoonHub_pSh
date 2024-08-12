def is_han_number(num):
    num_str = str(num)
    if len(num_str) <= 2:
        # 1자리 또는 2자리 수는 무조건 한수
        return True
    else:
        # 첫 번째 자리수와 두 번째 자리수의 차이를 구함
        diff = int(num_str[1]) - int(num_str[0])
        for i in range(2, len(num_str)):
            # 이후 자리수의 차이가 모두 동일한지 검사
            if int(num_str[i]) - int(num_str[i - 1]) != diff:
                return False
        return True


def count_han_numbers(N):   # 한수 갯수 검사기
    count = 0   # 0부터 시작
    for number in range(1, N + 1):
        # 범위 안에 있는 한수
        if is_han_number(number):
            count += 1
    return count


# 입력받은 N
N = int(input())
# 한수의 개수 출력
print(count_han_numbers(N))
