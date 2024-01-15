SELECT
		 *
  FROM tbl_menu
  JOIN tbl_category
    ON tbl_menu.category_code = tbl_category.category_code;

-- ---------------------------------------
-- 조인할 두 테이블 각각 전체 조회
SELECT
		 *
  FROM tbl_menu;
  
SELECT
		 *
  FROM tbl_category;

-- 메뉴명과 카테고리만 조회
SELECT
		 menu_name
	  , category_name
  FROM tbl_menu
  JOIN tbl_category ON (tbl_menu.category_code = tbl_category.category_code);
  
-- 테이블명도 별칭(alias)을 붙일 수 있다.
SELECT
		 menu_name
	  , category_name
  FROM tbl_menu AS a
  JOIN tbl_category AS b ON (a.category_code = b.category_code);
  
-- 두 테이블에 같은 컬럼명이 있는 상태에서 조인 시 주의할 점
SELECT
		 menu_name
	  , category_name
  FROM tbl_menu AS a
  JOIN tbl_category AS b ON (category_code = category_code);	-- 두 테이블이 동일한 컬럼일 시 별칭 필수

SELECT
		 category_code
  FROM tbl_menu AS a
  JOIN tbl_category AS b ON (a.category_code = b.category_code);

SELECT
		 a.category_code	-- SELECT절도 동일한 컬럼은 별칭을 필수로 달아야 한다.
  FROM tbl_menu AS a
  JOIN tbl_category AS b ON (a.category_code = b.category_code);

-- 관례상 JOIN 시에는 쿼리에 사용되는 모든 컬럼에 별칭을 다는 것을 원칙으로 한다.
SELECT
		 a.menu_name
	  , b.category_name
	  , a.category_code
  FROM tbl_menu AS a
  JOIN tbl_category AS b ON (a.category_code = b.category_code)
 WHERE b.category_code = 8;

-- ---------------------------------------------------------------------
-- 1) INNER JOIN : ON 또는 USING 뒤에 오는 JOIN의 조건을 만족하여 매칭되는 결과들만 JOIN됨
SELECT
		 a.menu_name
	  , b.category_name
	  , a.category_code
  FROM tbl_menu AS a
  JOIN tbl_category AS b ON (a.category_code = b.category_code)
 WHERE b.category_code = 7;	-- 조회 결과 없음(7번 카테고리(퓨전)는 존재하지만 JOIN에는 존재X)

-- 2) LEFT JOIN : JOIN 키워드 기준 왼쪽 테이블의 행이 모두 나오도록 JOIN

-- 카테고리가 없는 메뉴를 만들기 위해
-- a. 메뉴 카테고리에 null이 들어갈 수 있게 not null 제약 조건 해제
SELECT * FROM tbl_menu WHERE menu_code = 1;
ALTER TABLE tbl_menu CHANGE category_code category_code INTEGER DEFAULT NULL;
-- ALTER TABLE tbl_menu MODIFY COLUMN category_code INTEGER NOT NULL; -- NOT NULL로 재설정

-- b. 1번 메뉴의 메뉴 카테고리가 null로 변경 되게 설정
UPDATE tbl_menu
   SET category_code = null
 WHERE menu_code = 1;
 
-- c. 1번 메뉴의 메뉴 카테고리가 없는 상태에서 inner join vs left join 비교하기   
SELECT
       *
  FROM tbl_menu a
  JOIN tbl_category b ON (a.category_code = b.category_code)
 ORDER BY a.menu_code;
  
SELECT
       *
  FROM tbl_menu a
  LEFT JOIN tbl_category b ON (a.category_code = b.category_code);

-- 3) RIGHT JOIN : JOIN 키워드 기준 오른쪽 테이블의 행이 모두 나오도록 JOIN
SELECT
		 a.menu_name
	  , b.category_name
	  , a.category_code
  FROM tbl_menu AS a
 RIGHT JOIN tbl_category AS b ON (a.category_code = b.category_code);

-- 4) CROSS JOIN
-- cross join 은 의도했다기 보다는 on에 쓰는 join 조건을 잘못 썼을 가능성이 높다.
SELECT
		 *
  FROM tbl_menu AS a
  JOIN tbl_category b ON (1=1);

SELECT
		 *
  FROM tbl_menu AS a
 CROSS JOIN tbl_category b;

-- 5) SELF JOIN
-- self join은 하나의 테이블에 상위 개념과 하위 개념이 모두 들어있을 때 자기 자신 테이블을
-- join하게 되는 경우에 사용한다
-- (ex : 신입사원 vs 사수(선배 사원),
-- 하위 카테고리 vs 상위 카테고리
-- 댓글 vs 대댓글, 등)
SELECT
		 a.category_name
	  , b.category_name
  FROM tbl_category AS a
  JOIN tbl_category AS b ON (a.ref_category_code = b.category_code);