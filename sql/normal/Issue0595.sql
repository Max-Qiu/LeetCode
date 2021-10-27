-- 大的国家 https://leetcode-cn.com/problems/big-countries/

DROP TABLE IF EXISTS `world`;
CREATE TABLE `world`  (
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `continent` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `area` bigint NULL DEFAULT NULL,
  `population` bigint NULL DEFAULT NULL,
  `gdp` bigint NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of world
-- ----------------------------
INSERT INTO `world` VALUES ('Afghanistan', 'Asia', 652230, 25500100, 20343000000);
INSERT INTO `world` VALUES ('Albania', 'Europe', 28748, 2831741, 12960000000);
INSERT INTO `world` VALUES ('Algeria', 'Africa', 2381741, 37100000, 188681000000);
INSERT INTO `world` VALUES ('Andorra', 'Europe', 468, 78115, 3712000000);
INSERT INTO `world` VALUES ('Angola', 'Africa', 1246700, 20609294, 100990000000);

SELECT
    `name`,
    population,
    area
FROM
    World
WHERE
        area > 3000000 UNION
SELECT
    `name`,
    population,
    area
FROM
    World
WHERE
        population > 25000000