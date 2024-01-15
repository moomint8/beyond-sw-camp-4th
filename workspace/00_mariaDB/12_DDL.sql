CREATE TABLE IF NOT EXISTS tb1 (
    pk INT PRIMARY KEY, -- 컬럼 레벨에서  제약조건 추가
    fk INT,
    col1 VARCHAR(255),
    CHECK(col1 IN ('Y', 'N')) -- 테이블 레벨에서 제약조건 추가
) ENGINE=INNODB;

DESC tb1;

INSERT
  INTO tb1
VALUES 
(
  1, 2, 'Y'
);

-- -------------------------------------
-- auto_increment

CREATE TABLE IF NOT EXISTS tb2 (
    pk INT PRIMARY KEY auto_increment,
    fk INT,
    col1 VARCHAR(255),
    CHECK(col1 IN ('Y', 'N')) -- 테이블 레벨에서 제약조건 추가
) ENGINE=INNODB;

DESC tb2;

INSERT
  INTO tb2
VALUES 
(
  NULL, 2, 'Y'
);

SELECT * FROM tb2;

-- ---------------------
-- ALTER
-- 컬럼 추가
ALTER TABLE tb2 ADD col2 INT NOT NULL;

DESC tb2;

-- 컬럼 삭제
ALTER TABLE tb2 DROP COLUMN col2;

DESC tb2;

-- 컬럼 이름 및 컬럼 정의 변경
ALTER TABLE tb2
CHANGE COLUMN fk change_fk INT NOT NULL;

DESC tb2;

-- 제약조건 제거(auto_increment로 인해 제거 불가)
ALTER TABLE tb2 DROP PRIMARY KEY;

-- auto_increment 제거
ALTER TABLE tb2 MODIFY pk INT;

-- 다시 pk 제거
ALTER TABLE tb2 DROP PRIMARY KEY;

-- --------------------
-- truncate
CREATE TABLE if NOT EXISTS tb6 (
  pk INT AUTO_INCREMENT PRIMARY KEY,
  fk INT,
  col1 VARCHAR(255),
  CHECK (col1 IN ('Y','N'))
) ENGINE = INNODB;

INSERT
  INTO tb6
VALUES
(NULL, 10, 'Y'),
(NULL, 20, 'Y'),
(NULL, 30, 'Y'),
(NULL, 40, 'Y');

SELECT * FROM tb6;
DESC tb6;

TRUNCATE tb6;