SELECT b.owner_name, b.address, COUNT(m.id) AS connection_count
from building_type bt 
 join building b  ON bt.id = b.building_type_id
 JOIN meter m ON b.id = m.building_id
GROUP BY b.owner_name, b.address
ORDER BY b.owner_name ASC;
