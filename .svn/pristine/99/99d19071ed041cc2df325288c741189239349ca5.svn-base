-- set up two roles: Administrator and User
insert into jhs_roles(id, SHORT_NAME, name) 
select jhs_seq.nextval, 'ADMIN','ADMIN'
from dual
where not exists (select '1' from jhs_roles where short_name=substr('ADMIN',1,10));

insert into jhs_roles(id, SHORT_NAME, name) 
select jhs_seq.nextval, 'ADMIN','ADMIN'
from dual
where not exists (select '1' from jhs_roles where short_name=substr('ADMIN',1,10));


-- Create two users SKING and AHUNOLD
insert into jhs_users (ID, EMAIL_ADDRESS, USERNAME, ORG_KEY, PASSWORD, DISPLAY_NAME) 
select jhs_seq.nextval,'SKING','SKING','DEFAULT','welcome1', 'Steven King'
from dual 
where not exists (select '1' from jhs_users where username='SKING');

insert into jhs_users (ID, EMAIL_ADDRESS, USERNAME, ORG_KEY, PASSWORD, DISPLAY_NAME)
select jhs_seq.nextval,'AHUNOLD','AHUNOLD','DEFAULT','welcome1', 'Alexander Hunold'
from dual 
where not exists (select '1' from jhs_users where username='AHUNOLD');

-- Make Steven King Administrator
insert into jhs_user_role_grants (id,rle_id,usr_id) 
select jhs_seq.nextval, rle.id, usr.id
from jhs_roles rle, jhs_users usr
where rle.short_name=substr('ADMIN',1,10)
and usr.username='SKING'
and not exists (select '1' from jhs_user_role_grants urg2
                where urg2.usr_id = usr.id
                and   urg2.rle_id = rle.id); 

-- Make Alexander Hunold User
insert into jhs_user_role_grants (id,rle_id,usr_id) 
select jhs_seq.nextval, rle.id, usr.id
from jhs_roles rle, jhs_users usr
where rle.short_name=substr('ADMIN',1,10)
and usr.username='AHUNOLD'
and not exists (select '1' from jhs_user_role_grants urg2
                where urg2.usr_id = usr.id
                and   urg2.rle_id = rle.id); 

commit;  
  