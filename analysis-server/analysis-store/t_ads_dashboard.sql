CREATE TABLE `t_ads_dashboard` (
	`dash_id` VARCHAR(20) NOT NULL COMMENT '屏幕ID',
	`board_id` VARCHAR(20) NOT NULL COMMENT '模块ID',
	`data` JSON NOT NULL COMMENT '数据',
	`disable` SMALLINT(6) UNSIGNED ZEROFILL NOT NULL DEFAULT '000000' COMMENT '是否有效',
	`version` SMALLINT(6) NOT NULL DEFAULT '1' COMMENT '版本',
	`created_user` VARCHAR(50) NULL DEFAULT NULL COMMENT '创建用户',
	`gmt_created` DATETIME NULL DEFAULT NULL COMMENT '创建时间',
	`modified_user` VARCHAR(50) NOT NULL COMMENT '更新用户',
	`gmt_modified` DATETIME NULL DEFAULT NULL COMMENT '更新时间',
	PRIMARY KEY (`dash_id`, `board_id`)
)
COMMENT='指标数据库'
COLLATE='utf8_general_ci'
ENGINE=InnoDB;
