# Write your MySQL query statement below
with q1 as(
    select requester_id as id,count(*) as cnt
    from RequestAccepted as ra 
    group by requester_id
)
,q2 as(
    select accepter_id as id,count(*) as cnt
    from RequestAccepted as ra 
    group by accepter_id
)
,q3 as(
select id,cnt from q1 
union all
select id,cnt from q2
)
,q4 as(
    select id,sum(cnt)as total_friends from q3 group by id
)
select id,total_friends as num from q4 order by num desc limit 1;