# Write your MySQL query statement below
select W2.id from Weather AS W1 join Weather AS W2 on DATEDIFF(W2.recordDate,W1.recordDate)=1 where W2.temperature>W1.temperature;