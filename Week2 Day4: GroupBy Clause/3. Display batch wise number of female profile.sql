select batch, count(gender) as female_alumni_count
from profile where gender= 'female' group by batch;
