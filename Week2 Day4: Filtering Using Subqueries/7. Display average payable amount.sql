select avg(payable_amount) as payable_amount from bill where meter_id in
(select id  from meter where building_id in
 (select id from building where building_type_id in 
 (select id from building_type where connection_type_id in
 (select id from electricity_connection_type where id in
 (select connection_type_id from slab where rate<24)))));
