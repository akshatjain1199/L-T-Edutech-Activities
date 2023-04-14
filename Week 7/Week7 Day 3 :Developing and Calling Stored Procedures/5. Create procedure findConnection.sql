CREATE PROCEDURE findConnection (
    IN contact_number VARCHAR(100),
    OUT connection VARCHAR(100))
BEGIN
    SELECT ect.connection_name INTO connection
    FROM building as b  join building_type as bt on b.building_type_id = bt.id
    join electricity_connection_type as ect on bt.connection_type_id = ect.id
    WHERE b.contact_number = contact_number;
END
