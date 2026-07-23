-- Last updated: 7/23/2026, 9:33:59 AM
# Write your MySQL query statement below
SELECT * FROM Cinema WHERE MOD( id, 2) = 1 AND 

description <> 'boring' ORDER BY rating DESC