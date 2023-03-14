select b.owner_name, b.address , m.meter_number ,  bi.total_units from building b 
inner join meter m on b.id= m.building_id
inner join bill bi on m.id= bi.meter_id 
where bi.month = 12 and bi.year = 2017 order by total_units desc;
