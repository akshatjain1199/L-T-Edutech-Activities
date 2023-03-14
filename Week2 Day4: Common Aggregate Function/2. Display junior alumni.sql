SELECT max(batch) AS Junior_PM_Batch
FROM profile
WHERE designation = 'Project Manager'  order by batch;
