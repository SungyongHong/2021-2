# -*- coding: cp949 -*-
n = 1260
cnt = 0
# ū ������ ȭ����� ���ʴ�� Ȯ���ϱ�
array = [500, 100, 50, 10]

for coin in array:
    cnt += n // coin # �ش� ȭ��� �Ž��� �� �� �ִ� ������ ���� ����
    n %= coin
    
print(cnt)
