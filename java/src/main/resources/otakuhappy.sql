动画表

DROP TABLE IF EXISTS `cartoon`;
CREATE TABLE `cartoon` (
  `cartoonId` int(10) NOT NULL AUTO_INCREMENT,
  `cartoonName` varchar(64) DEFAULT NULL,
  `episodes` varchar(64) DEFAULT NULL,
  `episodesAll` varchar(64) DEFAULT NULL,
  `weekPlay` varchar(64) DEFAULT NULL,
  `timePlay` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`cartoonid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `cartoon` VALUES (NULL , '魔法少女 俺', '1',NULL ,'1','22:00');
INSERT INTO `cartoon` VALUES (NULL , '赛马娘', '1',NULL ,'1','0:00');
INSERT INTO `cartoon` VALUES (NULL , '琴之森', '1',NULL ,'1','2:40');
INSERT INTO `cartoon` VALUES (NULL , '樱花忍法帖', '1',NULL ,'1','23:30');
INSERT INTO `cartoon` VALUES (NULL , '美男高校地球防卫部 HAPPY KISS！', '1',NULL ,'1','1:35');
INSERT INTO `cartoon` VALUES (NULL , '魔法少女 俺（中配）', '1',NULL ,'1','22:00');
INSERT INTO `cartoon` VALUES (NULL , 'Four of a Kind 四牌士', '1',NULL ,'1','3:05');
INSERT INTO `cartoon` VALUES (NULL , '智龙迷城', '1',NULL ,'1','18:25');


INSERT INTO `cartoon` VALUES (NULL , '黑色四叶草', '1',NULL ,'2','18:25');
INSERT INTO `cartoon` VALUES (NULL , '宇宙战舰提拉米斯', '1',NULL ,'2','1:00');
INSERT INTO `cartoon` VALUES (NULL , '高达创形者', '1',NULL ,'2','18:00');
INSERT INTO `cartoon` VALUES (NULL , '飙速宅男 GLORY LINE', '1',NULL ,'2','2:05');
INSERT INTO `cartoon` VALUES (NULL , '少年阿贝 GO!GO!小芝麻 第三季', '1',NULL ,'2','20:00');

INSERT INTO `cartoon` VALUES (NULL , '齐木楠雄的灾难', '1',NULL ,'3','1:35');
INSERT INTO `cartoon` VALUES (NULL , 'ALICE or ALICE', '1',NULL ,'3','21:25');
INSERT INTO `cartoon` VALUES (NULL , '重神机潘多拉', '1',NULL ,'3','23:00');
INSERT INTO `cartoon` VALUES (NULL , '鹿枫堂', '1',NULL ,'3','0:30');
INSERT INTO `cartoon` VALUES (NULL , '重神机潘多拉（中配）', '1',NULL ,'3','23:00');


INSERT INTO `cartoon` VALUES (NULL , '博人传 火影忍者新时代', '1',NULL ,'4','19:25');
INSERT INTO `cartoon` VALUES (NULL , '多田君不恋爱', '1',NULL ,'4','21:30');
INSERT INTO `cartoon` VALUES (NULL , 'Comic Girls', '1',NULL ,'4','23:00');
INSERT INTO `cartoon` VALUES (NULL , '原书·原书使', '1',NULL ,'4','22:30');
INSERT INTO `cartoon` VALUES (NULL , 'Butlers～千年百年物语～', '1',NULL ,'4','0:35');

INSERT INTO `cartoon` VALUES (NULL , '超能力女儿', '1',NULL ,'5','20:00');
INSERT INTO `cartoon` VALUES (NULL , '宅男腐女恋爱真难', '1',NULL ,'5','1:30');
INSERT INTO `cartoon` VALUES (NULL , 'Megalo Box', '1',NULL ,'5','2:02');

INSERT INTO `cartoon` VALUES (NULL , '我的英雄学院 第三季', '1',NULL ,'6','17:30');
INSERT INTO `cartoon` VALUES (NULL , '皇帝圣印战记', '1',NULL ,'6','0:30');
INSERT INTO `cartoon` VALUES (NULL , '恶魔战线', '1',NULL ,'6','23:30');

INSERT INTO `cartoon` VALUES (NULL , '魔卡少女樱 CLEAR CARD篇', '1',NULL ,'7','9:00');
INSERT INTO `cartoon` VALUES (NULL , 'Fate/EXTRA Last Encore', '1',NULL ,'7','0:30');
INSERT INTO `cartoon` VALUES (NULL , '女神异闻录5 动画版', '1',NULL ,'7','1:00');


