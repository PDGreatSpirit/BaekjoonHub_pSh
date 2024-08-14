def count_firework_show(C, periods):
    fireworks = set()  # 터진 폭죽을 기록할 집합
    for period in periods:
        for time in range(period, C + 1, period):
            fireworks.add(time)  # 각 주기에 따라 터지는 시간을 집합에 추가

    return len(fireworks)  # 집합의 크기가 폭죽이 터진 시간의 총 수


# 입력 받기
N, C = map(int, input().split())  # 학생 수 N과 쇼가 끝나는 시간 C
periods = []
for _ in range(N):
    periods.append(int(input()))  # 각 학생의 폭죽 터뜨리는 주기

# 폭죽 터진 시간의 총 수 출력
print(count_firework_show(C, periods))
