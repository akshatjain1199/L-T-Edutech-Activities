select address from building where building_type_id in
(select id from building_type where connection_type_id in
 (select id from electricity_connection_type where connection_name = 'Home'))
 order by address asc;
