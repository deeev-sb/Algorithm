# 장애물 인식 프로그램

import sys
from collections import deque

def findWalls(i, j) :
    deq = deque()
    deq.append((i, j))
    wall = 0
    while deq :
        cur_r, cur_c = deq.popleft()
        blocks[cur_r][cur_c] = 0
        wall += 1
        for i in range(4) :
            next_r, next_c = cur_r + d[i][0], cur_c + d[i][1]
            if 0 <= next_r < n and 0 <= next_c < n and blocks[next_r][next_c] == 1 and visied[next_r][next_c] == 0:
                deq.append((next_r, next_c))
                visied[next_r][next_c] = 1
    walls.append(wall)


if __name__ == "__main__" :
    n = int(input())
    blocks = [list(map(int, input())) for _ in range(n)]
    visied = [[0 for _ in range(n)] for _ in range(n)]

    d = [(-1, 0), (0, 1), (1, 0), (0, -1)]

    allBlocks = 0
    walls = []

    for i in range(n) : 
        for j in range(n) :
            if blocks[i][j] == 1 :
                allBlocks += 1
                findWalls(i, j)

print(allBlocks)
walls.sort()
for wall in walls:
    print(wall)