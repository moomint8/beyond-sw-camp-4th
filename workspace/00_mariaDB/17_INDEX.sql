-- INDEX
CREATE TABLE phone (
    phone_code INT PRIMARY KEY,
    phone_name VARCHAR(100),
    phone_price DECIMAL(10, 2)
);

INSERT 
  INTO phone (phone_code , phone_name , phone_price )
VALUES 
(1, 'galaxyS23', 1200000),
(2, 'iPhone14pro', 1433000),
(3, 'galaxyZfold3', 1730000);

SELECT * FROM phone;

-- 단순 조회
SELECT * FROM phone WHERE phone_name = 'galaxyS23';

-- 조회의 실행 계획 확인
EXPLAIN SELECT * FROM phone WHERE phone_name = 'galaxyS23';

-- where절에 활용한 컬럼에 index를 추가해보자
CREATE INDEX idx_name ON phone (phone_name);

SHOW INDEX FROM phone;

-- index 추가 후 다시 해당 컬럼을 조건으로 해서 조회
EXPLAIN SELECT * FROM phone WHERE phone_name = 'iPhone14pro';

-- index는 주기적으로 다시 달아주어야 한다.
OPTIMIZE TABLE phone;

-- index 삭제 후 확인
DROP INDEX idx_name ON phone;
SHOW INDEX FROM phone;