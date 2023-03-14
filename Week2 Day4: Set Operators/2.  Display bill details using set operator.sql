SELECT COUNT(*) as no_of_bills
FROM bill
WHERE MONTH(payment_date) = 10
UNION
SELECT COUNT(*) as no_of_bills
FROM bill
WHERE MONTH(payment_date) = 12
ORDER BY no_of_bills DESC;
