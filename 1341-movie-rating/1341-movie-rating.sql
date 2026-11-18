# Write your MySQL query statement below
with g_name as(
    select name,count(rating) as cnt from Users as u left join MovieRating as mr
    on u.user_id=mr.user_id 
    group by u.user_id order by cnt desc,name asc limit 1
)
,m_name as(
    select title,avg(rating) as avg_rate from Movies as m left join MovieRating as mr on m.movie_id=mr.movie_id where created_at>='2020-02-01' and created_at<'2020-03-01' group by m.movie_id
    order by avg_rate desc,title asc limit 1
)
select name as 'results' from g_name 
union all
select title as 'results' from m_name;