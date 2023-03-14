select tc.person_name , tc.contact_number ,tc.balance 
from travel_card tc
inner join travel_payment tp on tc.id=tp.travel_card_id
where tp.amount in (select min(tpt.amount) from travel_payment tpt) 
order by tc.person_name desc;
