SELECT
    act.machine_id,
    ROUND(AVG(act1.timestamp-act.timestamp),3) AS processing_time
FROM Activity act
JOIN Activity act1
    ON act.machine_id = act1.machine_id
    AND act.process_id=act1.process_id
WHERE act.activity_type='start' and act1.activity_type='end'
GROUP BY act.machine_id;