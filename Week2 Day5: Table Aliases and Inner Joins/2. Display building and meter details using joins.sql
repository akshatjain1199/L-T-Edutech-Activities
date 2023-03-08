select m.meter_number , b.owner_name , b.address , b.contact_number from building b 
inner join meter m on b.id = m.building_id  order by b.owner_name , m.meter_number;
