USE replicaDB;

CREATE TABLE tbl_slave(
       member_code INT PRIMARY KEY AUTO_INCREMENT COMMENT '멤버 코드',
       mamber_name VARCHAR(30) NOT NULL COMMENT '멤버 이름',
       member_phone_number VARCHAR(30) COMMENT '멤버 전화번호'
) ENGINE=INNODB COMMENT '멤버';

SHOW DATABASES;
SHOW TABLES;

desc tbl_slave;

INSERT
     INTO tbl_slave VALUES (NULL,"LeeTest",NULL);
     
     SELECT * FROM tbl_slave;

SELECT * FROM tbl_slave;

INSERT INTO test_student
(
	std_id
	,std_name
	,std_age
)
VALUES
(
	7
	,''
	,
);

SELECT * FROM test_student;

SHOW DATABASES;
SHOW TABLES;