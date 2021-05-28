# -*- coding: utf-8 -*-
# UTF-8 encoding when using korean

def divisor_sum(n) :
	sum_ = 0
	for i in range(1, n + 1) :
		if n % i == 0 :
			sum_ += i
	
	return sum_

if __name__=="__main__" :
	num = int(input())
	print(divisor_sum(num))
	
