select count(is_payed) as payment_count from bill where is_payed=1 and  meter_id in
(select id from meter where building_id  in
 (select id from building where building_type_id in
  (select id from building_type where connection_type_id in
   (select id from electricity_connection_type where connection_name = 'Commercial'))));
