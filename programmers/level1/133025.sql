-- 과일로 만든 아이스크림 고르기
SELECT FH.FLAVOR
FROM FIRST_HALF AS FH, ICECREAM_INFO AS INFO
WHERE FH.TOTAL_ORDER > 3000 AND FH.FLAVOR = INFO.FLAVOR AND INFO.INGREDIENT_TYPE = 'fruit_based'
ORDER BY FH.TOTAL_ORDER DESC