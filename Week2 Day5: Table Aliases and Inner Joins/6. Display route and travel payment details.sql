SELECT r.*, tp.*
FROM route r
INNER JOIN station_route sr ON r.id = sr.route_id 
INNER JOIN station s ON sr.station_id = s.id 
INNER JOIN travel_payment tp ON s.id = tp.entry_station_id 
ORDER BY r.route_name ASC;
