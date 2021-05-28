# -*- coding: utf-8 -*-
# UTF-8 encoding when using korean

def prime(num) :
	
	if num < 2 :
		return False
	
	isCheck = [True for _ in range(num+1)]
	
	for i in range(2, num + 1) :
		if isCheck[i] :
			for j in range(2*i, num+1, i) :
				if isCheck[j] :
					isCheck[j] = False
	
	return isCheck[num]


if __name__=="__main__" :
	num = int(input())
	print(prime(num))
