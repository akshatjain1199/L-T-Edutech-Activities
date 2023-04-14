CREATE PROCEDURE getBillLevel (IN bill_id INT, OUT level VARCHAR(50))
BEGIN
    DECLARE totalunits INT;
    SELECT total_units INTO totalunits FROM bill WHERE id = bill_id;
    IF totalunits < 10000 THEN
        SET level = 'GOLD';
    ELSE
        SET level = 'PLATINUM';
    END IF;
END
