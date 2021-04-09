DROP TABLE IF EXISTS `customers`;
CREATE TABLE `customers`  (
  `Id` int,
  `Name` varchar(255)
);
INSERT INTO `customers` VALUES (1, 'Joe');
INSERT INTO `customers` VALUES (2, 'Henry');
INSERT INTO `customers` VALUES (3, 'Sam');
INSERT INTO `customers` VALUES (4, 'Max');

DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders`  (
  `Id` int,
  `CustomerId` int
);
INSERT INTO `orders` VALUES (1, 3);
INSERT INTO `orders` VALUES (2, 1);

SELECT
    c.`Name` 'Customers' 
FROM
    customers c 
WHERE
    c.Id NOT IN (
    SELECT
        o.CustomerId 
    FROM
    orders o 
    );

SELECT
    c.`Name` 'Customers' 
FROM
    customers c
    LEFT JOIN orders o ON c.Id = o.CustomerId 
WHERE
    o.Id IS NULL;