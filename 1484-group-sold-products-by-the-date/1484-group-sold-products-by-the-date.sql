select sell_date,count(distinct product) as num_sold,
GROUP_CONCAT(distinct product order by product asc separator',') as products from Activities as a group by sell_date order by sell_date;
