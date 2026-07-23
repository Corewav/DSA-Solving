-- Last updated: 7/23/2026, 9:35:01 AM
# Write your MySQL query statement below
SELECT today.id
FROM Weather yesterday
CROSS JOIN Weather today

WHERE DATEDIFF(today.recordDate,yesterday.recordDate) = 1
    AND today.temperature > yesterday.temperature
;