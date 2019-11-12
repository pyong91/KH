-- student_score ���̺� ��ȸ
select * from student_score;

-- �ǹ̾��� ������ �߰�
insert into snack values(null,null,null,null);
insert into snack values(5, '��Ϲ���Ĩ', 1500, 30);
select * from snack;

-- no�� �ʼ��׸��̸� �ߺ��� �Ұ���
-- name�� �ʼ��׸��̸� �ߺ��� ����
-- price�� �ʼ��׸��̸� �ߺ��� ����
-- stock�� �ʼ��׸��̸� �ߺ��� ����
drop table snack;
create table snack(
no number not null unique,
name varchar2(21) not null,
price number not null,
stock number not null
);

insert into snack values(null,null,null,null);
insert into snack values(5, '��Ϲ���Ĩ', 1500, 30);
select * from snack;

create table menu_coffee(
name VARCHAR2(20) not null unique,
type VARCHAR2(20) not null, -- check(type in ('Ŀ��', '����Ǫġ��', '������')), 
tall number not null, -- check(tall >= 0)
grande number not null, -- check(grande >= 0)
venti number not null -- check(venti >= 0)
);

insert into menu_coffee values('�ڹ�Ĩ', '����Ǫġ��', 6100, 6600, 7100);
insert into menu_coffee values('ī���', '����Ǫġ��', 5600, 6100, 6600);
insert into menu_coffee values('�ݵ���', 'Ŀ��', 4500, 5000, 5500);
insert into menu_coffee values('�Ƹ޸�ī��', 'Ŀ��', 4100, 4600, 5100);

select * from menu_coffee;

drop table subject_price;

create table subject_price(
subject varchar2(20) not null,
field varchar2(20) not null check(field in('����', '����')),
price number not null check(price >= 0),
begin date,
finish date
);

-- �� ���Ƽ� �Ȱ�... �ѱ��� ��¥ �����̶� �߰��� ��; to_date('2019-11-20', 'YYYY-MM-DD')
--                                                   to_date('20191120', 'YYYYMMDD')
insert into subject_price values('�ڹ�', '����', 500000, '2019-11-20', '2019-12-20');
insert into subject_price values('JSP', '����', 600000, '2019-12-21', '2020-01-15');
insert into subject_price values('������', '����', 800000, '2019-11-15', '2019-12-10');
insert into subject_price values('�Ǽ��ڵ�м�', '����', 950000, '2020-01-05', '2020-02-01');

select * from subject_price;

-- not null unique == primary key(�ϳ��� ����)

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