select company_name , count(current) as alumni_count
from experience where current =1 group by company_name;
