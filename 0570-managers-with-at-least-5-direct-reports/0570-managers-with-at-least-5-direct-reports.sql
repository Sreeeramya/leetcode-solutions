# Write your MySQL query statement below
select emp.name from Employee as emp join Employee as emp1 on emp.id=emp1.managerId group by emp1.managerId having count(emp1.managerId)>=5;