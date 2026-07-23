-- Last updated: 7/23/2026, 9:35:09 AM
# Write your MySQL query statement below
SELECT 
    Person.firstName,
    Person.lastName,
    Address.city,
    Address.state
FROM Person
LEFT JOIN Address
    ON Person.personId = Address.personId;