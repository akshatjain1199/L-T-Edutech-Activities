select meter_number from meter where id in 
(select meter_id from bill where fine_amount = (select max(fine_amount) from bill)); 
