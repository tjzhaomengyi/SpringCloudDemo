use ssm;
create table dept(
    deptno BIGINT AUTO_INCREMENT,
    dname VARCHAR(50),
    loc varchar(50),
    CONSTRAINT pk_deptno PRIMARY KEY (deptno)
);

INSERT INTO dept(dname,loc) VALUES ('开发部',database());
INSERT INTO dept(dname,loc) VALUES ('财务部',database());
INSERT INTO dept(dname,loc) VALUES ('市场部',database());
INSERT INTO dept(dname,loc) VALUES ('后勤部',database());
INSERT INTO dept(dname,loc) VALUES ('公关部',database());

