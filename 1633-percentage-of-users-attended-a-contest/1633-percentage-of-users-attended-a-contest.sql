# Write your MySQL query statement below
WITH TotalUsers AS (
    SELECT COUNT(*) AS total_users
    FROM Users
),
ContestAttendance AS (
    SELECT 
        r.contest_id,
        COUNT(DISTINCT r.user_id) AS registered_users
    FROM 
        Register r
    GROUP BY 
        r.contest_id
)
SELECT 
    c.contest_id,
    ROUND((c.registered_users * 100.0) / t.total_users, 2) AS percentage
FROM 
    ContestAttendance c
CROSS JOIN 
    TotalUsers t
ORDER BY 
    percentage DESC, 
    c.contest_id ASC;
