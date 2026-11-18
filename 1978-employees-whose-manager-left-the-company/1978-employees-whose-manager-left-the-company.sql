# Write your MySQL query statement below
select e.employee_id from Employees as e where e.manager_id not in
(
    select s.employee_id from Employees as s
) and e.salary<30000 order by e.employee_id;