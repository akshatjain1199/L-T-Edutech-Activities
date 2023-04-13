SELECT tc.person_name, tc.contact_number, tc.balance
FROM travel_card tc
INNER JOIN travel_payment tp ON tc.id = tp.travel_card_id
GROUP BY tc.person_name, tc.contact_number, tc.balance
HAVING COUNT(*) = ( SELECT MAX(travel_count)
FROM (  SELECT COUNT(*) AS travel_count FROM travel_payment group by travel_card_id)as travel_max_count) 
ORDER BY tc.person_name DESC;
