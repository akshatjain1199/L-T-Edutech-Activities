select sum(h20) as total_amount , avg(h20) as average_amount from electricity_reading where meter_id in
(select id from meter where building_id in
 (select id from building where building_type_id in
  (select id from building_type where connection_type_id in
   (select id from electricity_connection_type where connection_name= 'Commercial'))));  
