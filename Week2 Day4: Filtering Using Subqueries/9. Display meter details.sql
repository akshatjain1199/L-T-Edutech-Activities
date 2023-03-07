select meter_number from meter where id in 
 (select meter_id from electricity_reading where day = '2018/05/07')  
 order by meter_number asc;
