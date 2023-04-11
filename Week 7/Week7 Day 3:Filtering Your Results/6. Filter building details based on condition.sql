select owner_name , address , contact_number from building
where email_address is null 
order by owner_name asc;
