SELECT tc.person_name, tc.contact_number, tc.balance, tp.entry_time, tp.exit_time
FROM travel_card tc
INNER JOIN travel_payment tp ON tc.id = tp.travel_card_id
INNER JOIN station s ON tp.entry_station_id = s.id
WHERE s.name = 'Sengkang MRT station'
ORDER BY tc.person_name ASC;
