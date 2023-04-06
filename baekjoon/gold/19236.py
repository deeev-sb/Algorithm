# 청소년 상어

def move_fish(r, c, matrix, fish) : # 물고기 이동
    for i in range(1, 17) : # 물고기는 번호 순서대로 이동
        cr, cc = fish[i] # 물고기의 현재 위치
        if cr > -1 and cc > -1 : # 물고기가 존재할 때
            cd = matrix[cr][cc][1] # 현재 방향
            while True : # 물고기의 이동 방향 확인
                nr, nc = cr + d[cd][0], cc + d[cd][1] # 물고기 예상 이동 방향
                if (nr != r or nc != c) and 0 <= nr < 4 and 0 <= nc < 4 : # 상어의 위치가 아니면서 범위 안에 존재하는 경우
                    nfish, ndist = matrix[nr][nc][0], matrix[nr][nc][1] # 이동 방향에 위치하는 물고기 정보
                    if fish[nfish][0] != -1 : # 두 마리 물고기 다 살아있는 경우, 물고기끼리 위치 변경
                        fish[i], fish[nfish] = (nr, nc), (cr, cc)
                    else : # 상대 물고기가 죽은 경우, 현재 물고기 위치만 변경
                        fish[i] = (nr, nc)
                    matrix[cr][cc], matrix[nr][nc] = (nfish, ndist), (i, cd) # 물고기 위치 변경
                    break # 물고기가 이동했으므로 종료
                cd = (cd % 8) + 1 # 물고기가 이동하지 못했으므로 방향 돌리기
                if cd == matrix[cr][cc][1] : # 모든 방향 확인 후 처음 방향으로 돌아옴
                    break # 물고기가 이동 불가능하므로 종료
    return matrix, fish

def eat_fish(cr, cc, matrix, sum_, f, dist, fish) : # 청소년 상어의 물고기 먹기
    global sum_fish
    sum_fish = max(sum_fish, sum_)

    cmatrix = [temp[:] for temp in matrix]
    cfish = fish[:]
    cfish[f] = (-1, -1) # 상어 위치의 물고기 먹기
    cmatrix[cr][cc] = (0, 0) # 상어의 위치는 빈 칸 취급
    result = move_fish(cr, cc, cmatrix, cfish) # 물고기 이동
    cmatrix = result[0]
    fish = result[1]

    for i in range(1, 4) :
        nr, nc = cr + i * d[dist][0], cc + i * d[dist][1]
        if 0 <= nr < 4 and 0 <= nc < 4 and cmatrix[nr][nc][0] > 0 : # 물고기가 존재하는 칸
            eat_fish(nr, nc, cmatrix, sum_ + cmatrix[nr][nc][0], cmatrix[nr][nc][0], cmatrix[nr][nc][1], cfish) # 청소년 상어의 다음 위치
    
    

if __name__=="__main__" :
    d = [(0, 0), (-1, 0), (-1, -1), (0, -1), (1, -1), (1, 0), (1, 1), (0, 1), (-1, 1)]
    
    matrix = []
    fish = [(-1, -1)] * 17
    for r in range(4) :
        temp1 = list(map(int, input().split()))
        temp2 = []
        for i in range(0, 8, 2) :
            temp2.append((temp1[i], temp1[i+1]))
            fish[temp1[i]] = (r, i//2)
        matrix.append(temp2)
    r, c, sum_fish, dist = 0, 0, matrix[0][0][0], matrix[0][0][1]

    eat_fish(r, c, matrix, sum_fish, sum_fish, dist, fish) # 상어의 이동
    
    print(sum_fish)
    

'''
4x4 크기 공간에 물고기 번호와 방향 존재
물고기의 번호는 모두 다름
청소년 상어가 (0, 0)에 있는 물고기를 먹고 방향은 (0,0) 방향부터 시작
청소년 상어의 이동 후 물고기 이동
물고기는 가장 작은 번호부터 이동하며, 이동할 수 있는 칸은 빈 칸과 다른 물고기가 있는 칸
이동할 수 없는 칸은 공간을 벗어나거나 상어가 있는 칸
이동할 수 있는 칸을 향할 때까지 45도 반시계 회전 (방향 1, 2, 3, 4, 5, 6, 7, 8 순서 => d%8+1)
청소년 상어는 이동 하는 중 지나가는 칸에 있는 물고기를 먹지 않으며, 물고기가 없는 칸으로 갈 수 없다.
청소년 상어가 이동할 수 있는 칸이 없으면 공간에서 벗어나 집으로 간다.
---
청소년 상어의 방향에 존재하는 모든 물고기에 대해 수행할 필요하며 최댓값 찾기
물고기 이동은 청소년 상어의 이동마다 일어나야 함
'''