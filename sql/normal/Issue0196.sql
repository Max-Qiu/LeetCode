DROP TABLE IF EXISTS `person`;
CREATE TABLE `person`  (
  `Id` int,
  `Email` varchar(255)
);
INSERT INTO `person` VALUES (1, 'john@example.com');
INSERT INTO `person` VALUES (2, 'bob@example.com');
INSERT INTO `person` VALUES (3, 'john@example.com');

DELETE 
FROM
    person 
WHERE
    Id IN (
    SELECT
        * 
    FROM
        (
        SELECT
            p1.Id 
        FROM
            person p1
            LEFT JOIN person p2 ON p1.Email = p2.Email 
        WHERE
        p1.Id > p2.Id 
    ) a)