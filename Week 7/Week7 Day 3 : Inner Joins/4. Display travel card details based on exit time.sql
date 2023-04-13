SELECT tc.* , tp.*
FROM travel_card tc
INNER JOIN travel_payment tp ON  tp.travel_card_id=tc.id
WHERE date(tp.exit_time) = '2017-12-21' and tp.amount>25
ORDER BY tc.person_name ASC;
