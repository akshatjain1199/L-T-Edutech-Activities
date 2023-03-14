SELECT COUNT(*) AS number_of_queries 
FROM query 
WHERE EXTRACT(hour FROM date) BETWEEN 1 AND 5;
