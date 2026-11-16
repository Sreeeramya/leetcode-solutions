# Write your MySQL query statement below
select emp.name,b.bonus from Employee as emp left join bonus as b on emp.empid=b.empid
where b.bonus<1000 or b.bonus is null;