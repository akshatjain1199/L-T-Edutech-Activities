select contact_number from building where building_type_id in 
(select id from building_type where name ='Police Station') 
order by contact_number asc;
