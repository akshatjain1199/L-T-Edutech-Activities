create procedure  insertConnection(connection_name varchar(100))
begin
	declare cntid int default 0;
    select count(*) into cntid from electricity_connection_type;
    insert into electricity_connection_type(id,connection_name) values((cntid+1),connection_name);
end
