/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50552
Source Host           : localhost:3306
Source Database       : tl_web

Target Server Type    : MYSQL
Target Server Version : 50552
File Encoding         : 65001

Date: 2017-08-03 16:37:22
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for item
-- ----------------------------
DROP TABLE IF EXISTS `item`;
CREATE TABLE `item` (
  `id` int(255) unsigned NOT NULL AUTO_INCREMENT,
  `item_title` varchar(255) NOT NULL,
  `item_description` text,
  `item_url` varchar(255) DEFAULT NULL,
  `view_times` int(11) DEFAULT NULL,
  `section_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `section_id` (`section_id`),
  CONSTRAINT `item_ibfk_1` FOREIGN KEY (`section_id`) REFERENCES `sub_section` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of item
-- ----------------------------
INSERT INTO `item` VALUES ('1', 'javaSE视频教程', '传智播客视频教程', 'http://www.baidu.com', null, '1');

-- ----------------------------
-- Table structure for permission
-- ----------------------------
DROP TABLE IF EXISTS `permission`;
CREATE TABLE `permission` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `permission_name` varchar(50) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `role_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `role_id` (`role_id`),
  CONSTRAINT `permission_ibfk_1` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of permission
-- ----------------------------
INSERT INTO `permission` VALUES ('1', 'java', 'java版主权限', null);

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `id` int(11) NOT NULL,
  `role_name` varchar(50) NOT NULL,
  `description` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('1', 'admin', '管理员');
INSERT INTO `role` VALUES ('2', 'moderator', '版主');
INSERT INTO `role` VALUES ('3', 'user', '普通用户');

-- ----------------------------
-- Table structure for section
-- ----------------------------
DROP TABLE IF EXISTS `section`;
CREATE TABLE `section` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `sectionName` varchar(50) NOT NULL,
  `sectionDescription` varchar(255) DEFAULT NULL,
  `pageView` int(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of section
-- ----------------------------
INSERT INTO `section` VALUES ('1', 'Java', 'Java版块描述', null);
INSERT INTO `section` VALUES ('2', 'MySQL', 'MySQL数据库版块', null);
INSERT INTO `section` VALUES ('3', 'C', 'C语言版块', null);
INSERT INTO `section` VALUES ('8', 'zxc', 'zxc', null);
INSERT INTO `section` VALUES ('34', 'test2', 'test2', null);
INSERT INTO `section` VALUES ('35', 'zzz', 'zzz', null);

-- ----------------------------
-- Table structure for sub_section
-- ----------------------------
DROP TABLE IF EXISTS `sub_section`;
CREATE TABLE `sub_section` (
  `id` int(11) NOT NULL,
  `section_name` varchar(30) NOT NULL,
  `section_description` text NOT NULL,
  `parent_section` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `parent_section` (`parent_section`),
  CONSTRAINT `sub_section_ibfk_1` FOREIGN KEY (`parent_section`) REFERENCES `section` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sub_section
-- ----------------------------
INSERT INTO `sub_section` VALUES ('1', 'JavaSE', 'Java基础版块', '1');
INSERT INTO `sub_section` VALUES ('2', 'JavaEE', 'Java web版块', '1');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `username` varchar(50) NOT NULL COMMENT '用户账号',
  `password` varchar(100) NOT NULL COMMENT '用户密码',
  `salt` varchar(100) NOT NULL,
  `registrationTime` date DEFAULT NULL,
  `loginTimes` int(11) DEFAULT NULL COMMENT '登陆次数',
  `roleId` int(11) NOT NULL DEFAULT '1',
  `locked` int(11) NOT NULL DEFAULT '0' COMMENT '是否锁定状态',
  PRIMARY KEY (`username`),
  KEY `role_id` (`roleId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('ke', '202cb962ac59075b964b07152d234b70', '123', '2017-08-01', '1', '1', '0');
INSERT INTO `user` VALUES ('ke2', '202cb962ac59075b964b07152d234b70', '123', '2017-08-02', '1', '2', '0');
INSERT INTO `user` VALUES ('ke3', '202cb962ac59075b964b07152d234b70', '123', '2017-08-02', '1', '3', '0');
