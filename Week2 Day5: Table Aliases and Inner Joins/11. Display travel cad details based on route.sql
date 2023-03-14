SELECT tc.person_name , tc.contact_number
FROM travel_card tc
INNER JOIN travel_payment tp ON  tc.id=tp.travel_card_id
inner join station s on tp.exit_station_id = s.id
inner join station_route sr on s.id= sr.station_id
inner join route r on sr.route_id=r.id
WHERE r.route_name= 'North East line'  and tp.amount>25
ORDER BY tc.person_name asc;
