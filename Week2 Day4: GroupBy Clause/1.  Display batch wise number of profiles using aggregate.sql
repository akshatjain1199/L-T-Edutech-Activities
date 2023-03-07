select p.batch , count(u.profile_id) as profile_count
from profile p , user u 
where u.profile_id= 1 group by p.batch;
