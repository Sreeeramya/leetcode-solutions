# Write your MySQL query statement below
with queue_weight as(
    
    select turn,person_id,person_name,weight,SUM(weight) 
    over(order by turn) as Total_weight from Queue
)
select person_name from queue_weight where Total_weight<=1000
order by turn desc limit 1
