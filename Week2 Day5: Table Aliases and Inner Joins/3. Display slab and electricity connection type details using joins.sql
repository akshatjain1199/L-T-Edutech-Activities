select ect.connection_name , s.from_unit , s.to_unit , s.rate from electricity_connection_type ect 
inner join slab s on ect.id=s.connection_type_id order by rate asc;
