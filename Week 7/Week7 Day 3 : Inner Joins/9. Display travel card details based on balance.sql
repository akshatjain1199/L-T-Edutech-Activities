SELECT tc.person_name, tc.contact_number, tc.balance, tp.entry_time, tp.exit_time
FROM travel_card tc
INNER JOIN travel_payment tp ON tc.id = tp.travel_card_id
WHERE tc.balance = (SELECT MAX(balance)FROM travel_card
WHERE balance < (SELECT MAX(balance)FROM travel_card ))
ORDER BY tc.person_name ASC;
