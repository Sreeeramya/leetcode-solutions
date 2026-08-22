# Write your MySQL query statement below
Select p.lastName,p.firstName,a.city,a.state from person as p left join address as a 
on p.personId=a.personId;