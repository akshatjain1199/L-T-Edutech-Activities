select count(*) as count_of_buildings_with_email
from building where email_address is not null; 
