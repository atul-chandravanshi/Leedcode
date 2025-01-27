# Write your MySQL query statement below
WITH SalesData AS (
    SELECT
        u.product_id,
        u.units,
        u.purchase_date,
        p.price
    FROM
        UnitsSold u
    JOIN
        Prices p
    ON
        u.product_id = p.product_id
        AND u.purchase_date BETWEEN p.start_date AND p.end_date
),
AggregatedSales AS (
    SELECT
        product_id,
        SUM(price * units) AS total_price,
        SUM(units) AS total_units
    FROM
        SalesData
    GROUP BY
        product_id
)
SELECT
    p.product_id,
    ROUND(COALESCE(a.total_price / a.total_units, 0), 2) AS average_price
FROM
    Prices p
LEFT JOIN
    AggregatedSales a
ON
    p.product_id = a.product_id
GROUP BY
    p.product_id, a.total_price, a.total_units;
