def check_self_num(n):
    # 1부터 n까지의 모든 숫자를 담은 리스트 생성
    all_numbers = list(range(1, n))
    # 셀프 넘버가 아닌 숫자들을 담을 리스트
    not_self_num = []

    # 1부터 n-1까지 숫자를 돌면서 각 숫자의 생성자를 찾는다
    for number in range(1, n):
        total = number
        # 현재 숫자의 각 자릿수를 더한다
        for digit in str(number):
            total += int(digit)
        # 계산한 결과가 n 미만이면 셀프 넘버가 아닌 리스트에 추가
        if total < n:
            not_self_num.append(total)

    # 셀프 넘버를 찾기 위해 모든 숫자 리스트에서 셀프 넘버가 아닌 숫자를 제거
    self_num = []
    for num in all_numbers:
        if num not in not_self_num:
            self_num.append(num)

    # 셀프 넘버 출력
    for num in self_num:
        print(num)

# 10001까지의 셀프 넘버를 확인
check_self_num(10001)