SELECT * FROM tbl_menu;

-- 1행부터 5개의 메뉴 행 조회
SELECT
		 *
  FROM tbl_menu
 LIMIT 0, 5;	-- LIMIT 시작 인덱스, 시작 인덱스부터 조회할 행의 갯수

-- 6행부터 5개의 메뉴 행 조회
SELECT
		 *
  FROM tbl_menu
 LIMIT 5, 5;

-- LIMIT의 offset 생략 시
SELECT
		 *
  FROM tbl_menu
 LIMIT 5;

-- LIMIT 를 자주 쓰진 않지만 이후 TOP-N 분석이나 paging 처리를 할 때 사용된다.
