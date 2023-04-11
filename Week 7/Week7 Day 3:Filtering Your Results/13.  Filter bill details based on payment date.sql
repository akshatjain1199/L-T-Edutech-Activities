select * from bill 
where day(payment_date) = 2
order by total_units desc;
