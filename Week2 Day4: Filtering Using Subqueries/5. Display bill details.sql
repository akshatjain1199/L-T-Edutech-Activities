select total_units , payable_amount from bill where id in 
(select building_id from meter where meter_number ='SG934826');
