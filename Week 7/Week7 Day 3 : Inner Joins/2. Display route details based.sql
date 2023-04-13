SELECT r.route_name
FROM route r
inner JOIN station_route sr ON r.id = sr.route_id
JOIN station s ON sr.station_id = s.id
WHERE s.name = 'Woodlands MRT station'
ORDER BY r.route_name ASC;
