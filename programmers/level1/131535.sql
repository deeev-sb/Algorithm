-- 조건에 맞는 회원수 구하기
SELECT COUNT(*) AS USERS
FROM USER_INFO
WHERE joined LIKE "2021%" AND 20 <= AGE AND AGE <= 29