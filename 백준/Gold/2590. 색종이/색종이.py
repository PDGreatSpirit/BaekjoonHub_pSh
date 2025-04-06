import math

a = [int(input()) for _ in range(6)]  # 1x1 ~ 6x6 색종이 개수
count = 0

# 6x6
count += a[5]

# 5x5
count += a[4]
a[0] = max(0, a[0] - 11 * a[4])

# 4x4
count += a[3]
if a[1] >= 5 * a[3]:
    a[1] -= 5 * a[3]
else:
    rest = 5 * a[3] - a[1]
    a[0] = max(0, a[0] - 4 * rest)
    a[1] = 0

# 3x3
count += a[2] // 4
rest = a[2] % 4
if rest:
    count += 1
    if rest == 1:
        # 남은 공간: 27칸, 2x2 최대 5개
        if a[1] >= 5:
            a[1] -= 5
            a[0] = max(0, a[0] - 7)
        else:
            a[0] = max(0, a[0] - (27 - 4 * a[1]))
            a[1] = 0
    elif rest == 2:
        # 남은 공간: 18칸, 2x2 최대 3개
        if a[1] >= 3:
            a[1] -= 3
            a[0] = max(0, a[0] - 6)
        else:
            a[0] = max(0, a[0] - (18 - 4 * a[1]))
            a[1] = 0
    elif rest == 3:
        # 남은 공간: 9칸, 2x2 최대 1개
        if a[1] >= 1:
            a[1] -= 1
            a[0] = max(0, a[0] - 5)
        else:
            a[0] = max(0, a[0] - 9)
            a[1] = 0

# 2x2
count += a[1] // 9
rest = a[1] % 9
if rest:
    count += 1
    a[0] = max(0, a[0] - (36 - 4 * rest))

# 1x1
count += math.ceil(a[0] / 36)

print(count)