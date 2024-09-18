# Write your MySQL query statement below
SELECT DISTINCT l1.num AS ConsecutiveNums
from logs l1
join logs l2 on l1.id = l2.id-1
join logs L3 on l1.id = l3.id-2
where l1.num = l2.num AND l2.num = l3.num;