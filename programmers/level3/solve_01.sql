-- 없어진 기록 찾기
SELECT O.ANIMAL_ID, O.NAME
FROM ANIMAL_INS I RIGHT JOIN ANIMAL_OUTS O ON I.ANIMAL_ID = O.ANIMAL_ID
WHERE I.ANIMAL_ID IS NULL

/*
입양을 간 기록은 있는데 보호소에 들어온 기록이 없으므로, 보호소에 들어온 기록을 기준으로 OUTER JOIN을 진행한다.
OUTER JOIN 결과, 보호소에 들어온 기록이 없는 경우 NULL로 표시가 된다.
그러므로 보호소에 들어온 기록이 NULL에 해당하는 입양 간 동물 정보를 조회한다.
*/