SELECT
    r.contest_id,
    ROUND(count(distinct r.user_id)*100/(Select count(*)from Users), 2) AS percentage
FROM Register r
GROUP BY r.contest_id
ORDER BY percentage DESC, r.contest_id ASC;