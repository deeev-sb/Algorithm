# 아기 상어
from collections import deque

def eat_fish() : # 아기 상어의 물고기 먹기
    global r, c, w, t, eat
    q = deque()
    q.append((r, c))
    visited = [[0]*N for _ in range(N)] # 방문 시간 기록
    visited[r][c] = t # 현재 상어 위치의 시간 저장
    can_eat = [] # 먹을 수 있는 물고기를 저장하는 리스트
    while q :
        # 현재 아기 상어가 먹을 수 있는 물고기 찾기
        cr, cc = q.popleft() # 아기 상어의 현재 위치
        for i in range(4) :
            nr, nc = cr + d[i][0], cc + d[i][1] # 아기 상어가 갈 수 있는 위치
            if 0 <= nr < N and 0 <= nc < N and matrix[nr][nc] <= w and visited[nr][nc] == 0 :
                visited[nr][nc] += visited[cr][cc] + 1 # 현재 시간 + 1
                q.append((nr, nc)) # 다음으로 갈 장소 추가
                if 0 < matrix[nr][nc] < w : # 먹을 수 있는 물고기 위치
                    can_eat.append((nr, nc, visited[nr][nc]))
    # 현재 아기 상어가 먹을 물고기 선택하기
    if can_eat : # 먹을 수 있는 물고기가 존재하는 경우
        can_eat = sorted(can_eat, key = lambda x : (x[2], x[0], x[1]))
        r, c, dist = can_eat[0] # 가장 위쪽, 왼쪽 물고기 선택
        t = visited[r][c] # 물고기 위치에 기록된 시간으로 시간 업데이트
        matrix[r][c] = 0 # 물고기 먹음
        eat += 1
        if eat == w : # 물고기 크기만큼 먹으면 물고기 크기 증가
            w += 1
            eat = 0
        return 1 # 먹은 물고기 있음 전달
    return 0 # 먹을 수 있는 물고기가 없음 전달

if __name__=="__main__" :
    N = int(input()) # 공간 크기
    r, c, w, t, eat = 0, 0, 2, 0, 0 # 아기상어 위치 (행, 열), 크기, 시간, 먹은 횟수
    d = [(-1, 0), (0, 1), (1, 0), (0, -1)] # 위쪽부터 시계방향
    matrix = []
    for i in range(N) :
        matrix.append(list(map(int, input().split())))
        for j in range(N) :
            if matrix[i][j] == 9 :
                r, c = i, j # 아기 상어 현재 위치 기록
                matrix[i][j] = 0 # 아기 상어가 존재한 위치를 지나갈 수 있도록 0으로 변경
    
    while True :
        if not eat_fish() : break
    
    print(t)

'''
NxN 크기의 공간에 물고기 M마리와 아기 상어 1마리 존재
가장 처음 아기 상어의 크기는 2, 1초에 상하좌우로 인접한 한 칸씩 이동
아기 상어보다 큰 물고기가 있는 칸은 지나갈 수 없음
아기 상어는 자신보다 크기가 작은 물고기를 먹을 수 있음
먹을 수 있는 물고기가 1마리면, 그 물고기를 먹음
먹을 수 있는 물고기가 1마리보다 많으면, 가장 가까운 물고기를 먹음
이 때, 가장 위쪽, 가장 왼쪽에 있는 물고기를 먹음
아기 상어의 크기와 같은 수의 물고기를 먹을 때마다 크기 1 증가
몇 초 동안 도움 요청 없이 물고기를 먹을 수 있는지 구하기
---
빈칸  : 0
물고기 : 1~6
아기상어 위치 : 9
'''