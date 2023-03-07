select batch, count(gender) as male_alumni_count 
from profile where gender= 'male' group by batch;
