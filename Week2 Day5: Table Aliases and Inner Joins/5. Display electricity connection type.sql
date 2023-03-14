SELECT e.connection_name, COUNT(*) AS connection_count 
FROM electricity_connection_type e
inner join building_type bt on e.id=bt.connection_type_id
inner join building b on bt.id=b.building_type_id
inner join meter m on b.id=m.building_id
GROUP BY e.connection_name 
ORDER BY connection_count DESC;
