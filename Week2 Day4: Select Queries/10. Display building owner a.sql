select owner_name , concat(contact_number , '-', email_address) as contact_details from building order by owner_name desc;
