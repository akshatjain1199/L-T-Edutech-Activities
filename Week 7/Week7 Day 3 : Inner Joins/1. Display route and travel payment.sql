SELECT r.*, tp.*
FROM route r
 JOIN station_route sr ON r.id = sr.route_id 
 JOIN station s ON sr.station_id = s.id 
 JOIN travel_payment tp ON s.id = tp.entry_station_id 
ORDER BY r.route_name ASC;
