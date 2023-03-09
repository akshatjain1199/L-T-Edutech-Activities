select m.meter_number , b.owner_name , b.address , b.contact_number , bt.name , ect.connection_name
from electricity_connection_type ect
join building_type bt on ect.id=bt.connection_type_id
join building b on bt.id=b.building_type_id
join meter m on b.id=m.building_id
order by b.owner_name , m.meter_number;
