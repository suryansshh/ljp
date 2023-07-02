SELECT t.id, SUM(t.count) AS num
FROM
(
    SELECT r.accepter_id AS id, COUNT(r.accepter_id) AS count
    FROM requestaccepted r
    GROUP BY id
    UNION ALL
    SELECT rr.requester_id AS id, COUNT(rr.requester_id) AS count
    FROM requestaccepted rr
    GROUP BY id
) t
GROUP BY id
ORDER BY num DESC
LIMIT 1;
