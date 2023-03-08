select b.* , m.* from bill b
inner join meter m on   b.meter_id= m.id 
order by payable_amount asc;
