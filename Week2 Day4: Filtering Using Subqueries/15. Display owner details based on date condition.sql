SELECT owner_name, contact_number FROM building WHERE id IN
( SELECT building_id  FROM meter  WHERE id IN 
 (  SELECT meter_id  FROM bill  WHERE MONTH = 10)) 
ORDER BY owner_name ASC;
