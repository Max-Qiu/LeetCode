-- 超过5名学生的课 https://leetcode-cn.com/problems/classes-more-than-5-students/
CREATE TABLE `courses`  (
  `student` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `class` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of courses
-- ----------------------------
INSERT INTO `courses` VALUES ('A', 'Math');
INSERT INTO `courses` VALUES ('B', 'English');
INSERT INTO `courses` VALUES ('C', 'Math');
INSERT INTO `courses` VALUES ('D', 'Biology');
INSERT INTO `courses` VALUES ('E', 'Math');
INSERT INTO `courses` VALUES ('F', 'Computer');
INSERT INTO `courses` VALUES ('G', 'Math');
INSERT INTO `courses` VALUES ('H', 'Math');
INSERT INTO `courses` VALUES ('I', 'Math');

SELECT
	`class` 
FROM
	`courses` 
GROUP BY
	`class` 
HAVING
	COUNT( student ) >= 5