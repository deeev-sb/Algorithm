# 연구소3
from collections import deque
from itertools import combinations
import sys
input = sys.stdin.readline

def spread(cmatrix, active, empty) : # 바이러스 퍼트리기
    q = deque()
    
    for r, c in active : # 활성 바이러스 표시
        q.append((r, c))
        cmatrix[r][c] = 0

    max_time = 0
    while q :
        if max_time > min_time : break # 크면 확인할 필요가 X
        if empty == 0 : break # 빈 공간이 존재하지 않으면 바이러스를 퍼트릴 필요가 없음
        cr, cc = q.popleft() # 현재 위치
        for i in range(4) : # 4방향에 대해 확인
            nr, nc = cr + d[i][0] , cc + d[i][1]
            if 0 <= nr < N and 0 <= nc < N and (cmatrix[nr][nc] == -1 or cmatrix[nr][nc] == '*'):
                if cmatrix[nr][nc] == -1 : # 빈 공간일 때만 시간 증가
                    empty -= 1 # 빈 공간이 줄어들었음을 표시
                cmatrix[nr][nc] = cmatrix[cr][cc] + 1
                max_time = max(max_time, cmatrix[nr][nc])
                q.append((nr, nc))
    if empty : return -1
    return max_time

def combi(L, cur) : # 바이러스 조합
    global min_time
    if L == M : # M개의 활성 바이러스 선택
        print(visited)
        active = [virus[i] for i in range(viruslen) if visited[i]]
        cmatrix = [temp[:] for temp in matrix]
        t = spread(cmatrix, active, empty_num)
        if t != -1 :
            min_time = min(min_time, t)
        return
    for i in range(cur, viruslen) :
        if visited[i] == 0 :
            visited[i] = 1
            combi(L+1, i + 1)
            visited[i] = 0

if __name__=="__main__" :
    N, M = map(int, input().split())
    d = [(-1, 0), (0, 1), (1, 0), (0, -1)] # 위쪽부터 상하좌우
    virus = [] # 바이러스
    matrix = [] # 연구소
    empty_num = 0 # 빈 공간 개수 세기
    for i in range(N) :
        temp = list(map(int, input().split()))
        for j in range(N) :
            if temp[j] == 1 : # 벽
                temp[j] = '-'
            elif temp[j] == 2 :
                temp[j] = '*' # 초기 바이러스는 비활성 상태
                virus.append((i, j))
            else : #  빈 칸
                temp[j] = -1
                empty_num += 1
        matrix.append(temp)

    viruslen = len(virus)
    min_time = 2147000000 # 대략적으로 큰 수
    visited = [0] * viruslen # 바이러스 인덱스를 사용했는지 확인용
    combi(0, 0)
    # for active in list(combinations(virus, M)) :
    #     # print(combi)
    #     # active = [virus[i] for i in range(viruslen) if visited[i]]
    #     cmatrix = [temp[:] for temp in matrix]
    #     t = spread(cmatrix, active, empty_num)
    #     if t != -1 : min_time = min(min_time, t)

    if min_time == 2147000000 : print(-1)
    else : print(min_time)

'''
NxN 정사각형 크기 연구소 => 빈칸 0, 벽 1, 바이러스 2
벽 -, 비활성 바이러스 *, 활성 바이러스는 0, 빈칸은 바이러스가 퍼지는 시간 표시
M개의 바이러스를 활성시켰을 때 모든 빈 칸에 바이러스가 있게 되는 최소 시간 출력
바이러스를 어떻게 놓아도 모든 빈칸에 바이러스를 퍼트릴 수 없는 경우 -1 출력
'''