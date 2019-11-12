-- student_score 테이블 조회
select * from student_score;

-- 의미없는 데이터 추가
insert into snack values(null,null,null,null);
insert into snack values(5, '허니버터칩', 1500, 30);
select * from snack;

-- no는 필수항목이며 중복이 불가능
-- name은 필수항목이며 중복은 가능
-- price는 필수항목이며 중복은 가능
-- stock은 필수항목이며 중복은 가능
drop table snack;
create table snack(
no number not null unique,
name varchar2(21) not null,
price number not null,
stock number not null
);

insert into snack values(null,null,null,null);
insert into snack values(5, '허니버터칩', 1500, 30);
select * from snack;

create table menu_coffee(
name VARCHAR2(20) not null unique,
type VARCHAR2(20) not null, -- check(type in ('커피', '프라푸치노', '스무디')), 
tall number not null, -- check(tall >= 0)
grande number not null, -- check(grande >= 0)
venti number not null -- check(venti >= 0)
);

insert into menu_coffee values('자바칩', '프라푸치노', 6100, 6600, 7100);
insert into menu_coffee values('카라멜', '프라푸치노', 5600, 6100, 6600);
insert into menu_coffee values('콜드브루', '커피', 4500, 5000, 5500);
insert into menu_coffee values('아메리카노', '커피', 4100, 4600, 5100);

select * from menu_coffee;

drop table subject_price;

create table subject_price(
subject varchar2(20) not null,
field varchar2(20) not null check(field in('개발', '보안')),
price number not null check(price >= 0),
begin date,
finish date
);

-- 운 좋아서 된것... 한국식 날짜 형식이라 추가된 것; to_date('2019-11-20', 'YYYY-MM-DD')
--                                                   to_date('20191120', 'YYYYMMDD')
insert into subject_price values('자바', '개발', 500000, '2019-11-20', '2019-12-20');
insert into subject_price values('JSP', '개발', 600000, '2019-12-21', '2020-01-15');
insert into subject_price values('리버싱', '보안', 800000, '2019-11-15', '2019-12-10');
insert into subject_price values('악성코드분석', '보안', 950000, '2020-01-05', '2020-02-01');

select * from subject_price;

-- not null unique == primary key(하나만 가능)

commit;

create table naver_member(
id varchar2(200) PRIMARY key,
pwd varchar2(200) not null,
name varchar2(200) not null,
birth date,
email varchar2(200),
phone varchar2(200)
);

commit;
                                  
