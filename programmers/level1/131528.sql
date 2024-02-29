-- 나이 정보가 없는 회원 수 구하기
SELECT COUNT(*)
FROM USER_INFO
WHERE AGE is NULL
