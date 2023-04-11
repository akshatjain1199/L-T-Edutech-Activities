SELECT due_date,    payment_date, DATEDIFF( due_date,payment_date) AS date_difference,  payable_amount
FROM  bill 
WHERE payment_date <= due_date;
