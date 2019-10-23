-- ---
-- Globals
-- ---

-- SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
-- SET FOREIGN_KEY_CHECKS=0;

-- ---
-- Table 'i_account'
-- 用户账号表
-- ---

DROP TABLE IF EXISTS `i_account`;
		
CREATE TABLE `i_account` (
  `id` INTEGER NOT NULL AUTO_INCREMENT,
  `account_name` VARCHAR(30) NOT NULL,
  `account_password` VARCHAR(20) NOT NULL,
  `email` VARCHAR(30) NULL,
  `created_date` DATETIME NOT NULL,
  PRIMARY KEY (`id`)
) COMMENT '用户账号表';

-- ---
-- Table 'i_role'
-- 用户角色表
-- ---

DROP TABLE IF EXISTS `i_role`;
		
CREATE TABLE `i_role` (
  `id` INTEGER NOT NULL AUTO_INCREMENT,
  `role_name` VARCHAR(20) NOT NULL,
  `enable` INT NOT NULL,
  `created_by` INT NOT NULL,
  `created_date` DATETIME NOT NULL,
  PRIMARY KEY (`id`)
) COMMENT '用户角色表';

-- ---
-- Table 'i_privilege'
-- 权限表
-- ---

DROP TABLE IF EXISTS `i_privilege`;
		
CREATE TABLE `i_privilege` (
  `id` INTEGER NOT NULL AUTO_INCREMENT,
  `privilege_name` VARCHAR(50) NULL,
  `privilege_url` VARCHAR(200) NOT NULL,
  PRIMARY KEY (`id`)
) COMMENT '权限表';

-- ---
-- Table 'i_account_role'
-- 账号角色关联表
-- ---

DROP TABLE IF EXISTS `i_account_role`;
		
CREATE TABLE `i_account_role` (
  `id` INTEGER NOT NULL AUTO_INCREMENT,
  `account_id` INTEGER NOT NULL,
  `role_id` INTEGER NOT NULL,
  PRIMARY KEY (`id`)
) COMMENT '账号角色关联表';

-- ---
-- Table 'role_privilege'
-- 角色权限关联表
-- ---

DROP TABLE IF EXISTS `role_privilege`;
		
CREATE TABLE `role_privilege` (
  `id` INTEGER NOT NULL AUTO_INCREMENT,
  `role_id` INTEGER NOT NULL,
  `privilege_id` INTEGER NOT NULL,
  PRIMARY KEY (`id`)
) COMMENT '角色权限关联表';

-- ---
-- Foreign Keys 
-- ---

-- ALTER TABLE `i_account_role` ADD FOREIGN KEY (account_id) REFERENCES `i_account` (`id`);
-- ALTER TABLE `i_account_role` ADD FOREIGN KEY (role_id) REFERENCES `i_role` (`id`);
-- ALTER TABLE `role_privilege` ADD FOREIGN KEY (role_id) REFERENCES `i_role` (`id`);
-- ALTER TABLE `role_privilege` ADD FOREIGN KEY (privilege) REFERENCES `i_privilege` (`id`);

-- ---
-- Table Properties
-- ---

-- ALTER TABLE `i_account` ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
-- ALTER TABLE `i_role` ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
-- ALTER TABLE `i_privilege` ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
-- ALTER TABLE `i_account_role` ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
-- ALTER TABLE `role_privilege` ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ---
-- Test Data
-- ---

INSERT INTO `i_account` (`account_name`,`account_password`,`email`,`created_date`) VALUES
	('admin001','password','admin001@163.com',now());
INSERT INTO `i_account` (`account_name`,`account_password`,`email`,`created_date`) VALUES
	('tester001','password','tester001@163.com',now());
	
INSERT INTO `i_role` (`role_name`,`enable`,`created_by`,`created_date`) VALUES
	('admin',1,1,now());
INSERT INTO `i_role` (`role_name`,`enable`,`created_by`,`created_date`) VALUES
	('tester',1,1,now());
	
INSERT INTO `i_account_role` (`account_id`,`role_id`) VALUES
	(1,1);
INSERT INTO `i_account_role` (`account_id`,`role_id`) VALUES
	(1,2);
INSERT INTO `i_account_role` (`account_id`,`role_id`) VALUES
	(2,2);
	
INSERT INTO `i_privilege` (`privilege_name`,`privilege_url`) VALUES
	('账号管理','/accountManage');
INSERT INTO `i_privilege` (`privilege_name`,`privilege_url`) VALUES
	('角色管理','/roleManage');
INSERT INTO `i_privilege` (`privilege_name`,`privilege_url`) VALUES
	('系统日志','/systemLog');
INSERT INTO `i_privilege` (`privilege_name`,`privilege_url`) VALUES
	('人员维护','/staffManage');
INSERT INTO `i_privilege` (`privilege_name`,`privilege_url`) VALUES
	('单位维护','/companyManage');


INSERT INTO `i_role_privilege` (`role_id`,`privilege_id`) VALUES
	(1,1);
INSERT INTO `i_role_privilege` (`role_id`,`privilege_id`) VALUES
	(1,2);
INSERT INTO `i_role_privilege` (`role_id`,`privilege_id`) VALUES
	(1,3);
INSERT INTO `i_role_privilege` (`role_id`,`privilege_id`) VALUES
	(2,4);
INSERT INTO `i_role_privilege` (`role_id`,`privilege_id`) VALUES
	(2,5);