SELECT min(batch) AS Senior_PM_Batch
FROM profile
WHERE designation = 'Project Manager'  order by batch;
