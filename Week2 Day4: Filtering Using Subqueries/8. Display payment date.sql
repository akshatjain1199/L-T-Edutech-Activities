select payment_date from bill where meter_id in 
(select building_id from meter where meter_number = 'SG288942');
