# 단어 공부

text = list(input().upper())
unique = list(set(text))
counts = []

for t in unique :
    cnt = text.count(t)
    counts.append(cnt)

m = max(counts)


if counts.count(m) > 1 :
    print('?')
else :
    print(unique[counts.index(m)])