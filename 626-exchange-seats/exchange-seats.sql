# Write your MySQL query statement below
SELECT if(id<(Select max(id) from seat), #if it is true the first if case is executed else second if case
            if(id%2=0, id-1,id+1), #if it is even then swap with previous id, if odd next id
            if(id%2=0,id-1,id)) as id, student
from seat 
order by id;