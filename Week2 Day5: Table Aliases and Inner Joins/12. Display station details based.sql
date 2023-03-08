SELECT distinct  s.name, s.locality
FROM metro_train mt 
INNER JOIN route r ON mt.route_id = r.id
INNER JOIN station_route sr ON r.id = sr.route_id
INNER JOIN station s ON sr.station_id = s.id
INNER JOIN train_schedule ts ON s.id = ts.station_id
WHERE date(ts.scheduled_time)= '2017-12-21' and r.route_name= 'Circle line' 
ORDER BY s.name asc;
