-- <JOIN 미사용 연습문제>
-- 1. 모든 사원 모든 컬럼 조회
SELECT
		 *
  FROM employee;
  
-- 2. 사원들의 사번(사원번호), 이름 조회
SELECT
		 emp_id
	  , emp_name
  FROM employee;
  
-- 3. 201번 사번의 사번 및 이름 조회
SELECT
		 emp_id
	  , emp_name
  FROM employee
 WHERE emp_id = 201;
 
-- 4. employee 테이블에서 부서 코드가 'D9'인 사원 조회
SELECT
		 *
  FROM employee
 WHERE dept_code = 'D9';
 
-- 5. employee 테이블에서 직급 코드가 'J1'인 사원 조회
SELECT
		 *
  FROM employee
 WHERE job_code = 'J1';
 
-- 6. employee 테이블에서 급여가 300만원 이상(>=)인 사원의
-- 사번, 이름, 부서코드, 급여를 조회하시오.
SELECT
		 emp_id
	  , emp_name
	  , dept_code
	  , salary
  FROM employee
 WHERE salary >= 3000000;

-- 7. 부서코드가 'D6'이고 급여를 300만원보다 많이 받는
-- 직원의 이름, 부서코드, 급여 조회
SELECT
		 emp_id
	  , emp_name
	  , dept_code
	  , salary
  FROM employee
 WHERE dept_code = 'D6' and salary >= 3000000;

-- 8. 보너스를 받지 않는 사원에 대한
-- 사번, 직원명, 급여, 보너스를 조회
SELECT
		 emp_id
	  , emp_name
	  , salary
	  , bonus
  FROM employee
 WHERE bonus is NULL;
 
-- 9. 'D9' 부서에서 근무하지 않는 사원의
-- 사번, 이름, 부서코드를 조회
SELECT
		 emp_id
	  , emp_name
	  , dept_code
  FROM employee
 WHERE dept_code != 'D9';
 
-- 10. employee 테이블에서 퇴사 여부가 N인 직원들 조회하고
-- 사번, 이름, 입사일을 별칭을 사용해 조회해 보기
-- (퇴사 여부 컬럼은 ENT_YN이고 N은 퇴사 안한 사람, Y는 퇴사 한 사람)
SELECT
		 emp_id AS '사번'
	  , emp_name AS '이름'
	  , hire_date AS '입사일'
  FROM employee
 WHERE ENT_YN = 'N';

-- 11. employee 테이블에서 급여 350만원 이상
-- 550만원 이하를 받는 직원의
-- 사번, 이름, 급여, 부서코드, 직급코드를 별칭을 사용해 조회해 보기
SELECT
		 emp_id AS '사번'
	  , emp_name AS '이름'
	  , salary AS '급여'
	  , dept_code AS '부서코드'
	  , job_code AS '직급코드'
  FROM employee
 WHERE salary > 3000000 AND salary < 5500000;
 
-- 12. employee 테이블에서 '성이 김씨'인 직원의 사번, 이름, 입사일 조회
SELECT
		 emp_id AS '사번'
	  , emp_name AS '이름'
	  , hire_date AS '입사일'
  FROM employee
 WHERE emp_name LIKE "김%";
 
-- 13. employee 테이블에서 '성이 김씨'가 아닌 직원의 사번, 이름, 입사일 조회
SELECT
		 emp_id AS '사번'
	  , emp_name AS '이름'
	  , hire_date AS '입사일'
  FROM employee
 WHERE emp_name not LIKE "김%";

-- 14. EMPLOYEE 테이블에서 '하'문자가 이름에 포함 된
-- 직원의 이름, 주민번호, 부서코드 조회
SELECT
		 emp_name AS '이름'
	  , emp_no AS '주민번호'
	  , dept_code AS '부서코드'
  FROM employee
 WHERE emp_name LIKE "%하%";
 
-- 15. 'J2'직급이면서 급여가 200만원 이상인 직원이거나
-- 'J7'직급인 직원의 이름, 급여, 직급코드 조회
SELECT
		 emp_name
	  , salary
	  , job_code
  FROM employee
 WHERE (job_code = 'J2' AND salary > 2000000) OR job_code = 'J7';
 
-- 16. 'J2'직급이거나 'J7'직급인 직원들 중에
-- 급여가 200만원 이상인 직원의 이름, 급여, 직급코드 조회
SELECT
		 emp_name
	  , salary
	  , job_code
  FROM employee
 WHERE (job_code = 'J2' OR job_code = 'J7') AND salary > 2000000;

-- 17. IN 연산자로 업그레이드
SELECT
		 emp_name
	  , salary
	  , job_code
  FROM employee
 WHERE job_code IN ('J2','J7') AND salary >= 2000000;

-- ------------------------------------------
-- <JOIN 사용 연습문제>              

-- 1. 이름에 '형'자가 들어가는 직원들의 사번, 사원명, 부서명을 조회하시오.(1명)
SELECT
		 a.emp_id
	  , a.emp_name
	  , b.dept_title
  FROM employee AS a
  JOIN department AS b ON (a.dept_code = b.dept_id)
 WHERE a.emp_name LIKE "%형%";

-- 2. 해외영업팀에 근무하는 사원명, 직급명, 부서코드, 부서명을 조회하시오.(9명)
SELECT
		 a.emp_name
	  , c.JOB_NAME
	  , a.DEPT_CODE
	  , b.dept_title
  FROM employee AS a
  JOIN department AS b ON (a.dept_code = b.dept_id)
  JOIN job AS c ON (a.JOB_CODE = c.JOB_CODE)
 WHERE b.DEPT_TITLE LIKE "해외영업%";

-- 3. 보너스포인트를 받는 직원들의 사원명, 보너스포인트, 부서명, 근무지역명을 조회하시오.(8명)(INNER JOIN 결과)
SELECT
		 a.emp_name
	  , a.bonus
	  , b.DEPT_TITLE
	  , d.NATIONAL_NAME
  FROM employee AS a
  JOIN department AS b ON (a.dept_code = b.dept_id)
  JOIN location AS c ON (b.LOCATION_ID = c.LOCAL_CODE)
  JOIN national AS d ON (c.NATIONAL_CODE = d.NATIONAL_CODE)
 WHERE a.bonus IS NOT NULL;

-- 4. 부서코드가 D2인 직원들의 사원명, 직급명, 부서명, 근무지역명을 조회하시오.(3명)
SELECT
		 a.emp_name
	  , e.JOB_NAME
	  , b.DEPT_TITLE
	  , c.LOCAL_NAME
  FROM employee AS a
  JOIN department AS b ON (a.dept_code = b.dept_id)
  JOIN location AS c ON (b.LOCATION_ID = c.LOCAL_CODE)
  JOIN job AS e ON (a.JOB_CODE = e.JOB_CODE)
 WHERE a.DEPT_CODE = "D2";

-- 5. 급여 테이블의 등급별 최소급여(MIN_SAL)보다 많이 받는 직원들의
-- 사원명, 직급명, 급여, 연봉을 조회하시오.
-- 연봉에 보너스포인트를 적용하시오.(20명)
SELECT
		 a.emp_name AS "사원명"
	  , e.JOB_NAME AS "직급명"
	  , a.SALARY AS "급여"
	  , case when a.bonus IS NOT NULL then a.SALARY * 12 * (a.BONUS + 1)
	    ELSE a.SALARY * 12 END AS "연봉"
  FROM employee AS a
  JOIN department AS b ON (a.dept_code = b.dept_id)
  JOIN location AS c ON (b.LOCATION_ID = c.LOCAL_CODE)
  JOIN national AS d ON (c.NATIONAL_CODE = d.NATIONAL_CODE)
  JOIN job AS e ON (a.JOB_CODE = e.JOB_CODE)
  JOIN sal_grade AS f ON (a.SAL_LEVEL = f.SAL_LEVEL)
 WHERE a.salary > f.MIN_SAL;
 
-- 6. 한국(KO)과 일본(JP)에 근무하는 직원들의 
-- 사원명, 부서명, 지역명, 국가명을 조회하시오.(15명)
SELECT
		 a.emp_name AS "사원명"
	  , b.DEPT_TITLE AS "부서명"
	  , c.LOCAL_NAME AS "지역명"
	  , d.NATIONAL_NAME AS "국가명"
  FROM employee AS a
  JOIN department AS b ON (a.dept_code = b.dept_id)
  JOIN location AS c ON (b.LOCATION_ID = c.LOCAL_CODE)
  JOIN national AS d ON (c.NATIONAL_CODE = d.NATIONAL_CODE)
 WHERE d.NATIONAL_CODE IN ("KO","JP");

-- 7. 같은 부서에 근무하는 직원들의 사원명, 부서코드, 동료이름을 조회하시오.
-- self join 사용(60명)
SELECT
		 b.emp_name AS "사원명"
	  , a.DEPT_CODE AS "부서코드"
	  , a.EMP_NAME AS "동료이름"
  FROM employee AS a
  JOIN employee AS b ON (a.DEPT_CODE = b.DEPT_CODE)
 WHERE a.EMP_ID != b.EMP_ID
 ORDER BY 1;



-- 8. 보너스포인트가 없는 직원들 중에서 직급코드가 J4와 J7인 직원들의 사원명, 직급명, 급여를 조회하시오.
-- 단, join과 IN 사용할 것(8명)
SELECT
		 a.emp_name AS "사원명"
	  , e.JOB_NAME AS "직급명"
	  , a.SALARY AS "급여"
  FROM employee AS a
  JOIN job AS e ON (a.JOB_CODE = e.JOB_CODE)
 WHERE a.BONUS IS NULL and a.JOB_CODE IN ("J4","J7");

-- 9. 직급이 대리이면서 아시아 지역(ASIA1, ASIA2, ASIA3 모두 해당)에 근무하는 직원 조회
-- 사번(EMPLOYEE.EMP_ID), 이름(EMPLOYEE.EMP_NAME), 직급명(JOB.JOB_NAME), 부서명(DEPARTMENT.DEPT_TITLE),
-- 근무지역명(LOCATION.LOCAL_NAME), 급여(EMPLOYEE.SALARY)를 조회하시오
-- (해당 컬럼을 찾고, 해당 컬럼을 지닌 테이블들을 찾고, 테이블들을 어떤 순서로 조인해야 하는지 고민하고 SQL문을 작성할 것)
SELECT
		 a.EMP_ID AS "사번"
	  , a.emp_name AS "이름"
	  , e.JOB_NAME AS "직급명"
	  , b.DEPT_TITLE AS "부서명"
	  , c.LOCAL_NAME AS "근무지역명"
	  , a.SALARY AS "급여"
  FROM employee AS a
  JOIN department AS b ON (a.dept_code = b.dept_id)
  JOIN location AS c ON (b.LOCATION_ID = c.LOCAL_CODE)
  JOIN job AS e ON (a.JOB_CODE = e.JOB_CODE)
 WHERE e.JOB_NAME = "대리" AND c.LOCAL_NAME LIKE ("ASIA%");