-- 620. 有趣的电影 https://leetcode-cn.com/problems/not-boring-movies/

DROP TABLE IF EXISTS `cinema`;
CREATE TABLE `cinema`  (
  `id` int NULL DEFAULT NULL,
  `movie` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `description` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `rating` float(2, 1) NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

INSERT INTO `cinema` VALUES (1, 'War', 'great 3D', 8.9);
INSERT INTO `cinema` VALUES (2, 'Science', 'fiction', 8.5);
INSERT INTO `cinema` VALUES (3, 'irish', 'boring', 6.2);
INSERT INTO `cinema` VALUES (4, 'Ice song', 'Fantacy', 8.6);
INSERT INTO `cinema` VALUES (5, 'House card', 'Interesting', 9.1);

SELECT
	* 
FROM
	`cinema` c 
WHERE
	c.description != 'boring' 
	AND c.id&1
ORDER BY
	c.rating DESC