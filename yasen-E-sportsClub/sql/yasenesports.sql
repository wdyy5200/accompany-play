-- Yasen E-sports Club database initialization
-- Target: MySQL 8.0+
-- WARNING: This script drops and recreates all application tables.

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

CREATE DATABASE IF NOT EXISTS `yasenesports`
    DEFAULT CHARACTER SET utf8mb4
    DEFAULT COLLATE utf8mb4_unicode_ci;

USE `yasenesports`;

DROP TABLE IF EXISTS `user_card_info`;
DROP TABLE IF EXISTS `tb_user_role`;
DROP TABLE IF EXISTS `user_info`;
DROP TABLE IF EXISTS `tb_user`;

CREATE TABLE `tb_user`
(
    `id`              INT NOT NULL AUTO_INCREMENT COMMENT '主键ID',
    `user_name`       VARCHAR(64) DEFAULT NULL COMMENT '账号',
    `password`        VARCHAR(255) DEFAULT NULL COMMENT '密码',
    `role_name`       VARCHAR(64) DEFAULT NULL COMMENT '昵称',
    `real_name`       VARCHAR(64) DEFAULT NULL COMMENT '真实姓名',
    `email`           VARCHAR(254) DEFAULT NULL COMMENT '邮箱',
    `phone`           VARCHAR(32) DEFAULT NULL COMMENT '手机号',
    `id_card`         VARCHAR(32) DEFAULT NULL COMMENT '身份证号',
    `id_card_img`     VARCHAR(1024) DEFAULT NULL COMMENT '身份证图片',
    `status`          VARCHAR(32) DEFAULT NULL COMMENT '状态',
    `last_login_time` DATETIME DEFAULT NULL COMMENT '最后登录时间',
    `open_id`         INT DEFAULT NULL COMMENT '微信OpenID',
    `open_img`        VARCHAR(1024) DEFAULT NULL COMMENT '微信头像',
    `create_time`     VARCHAR(32) DEFAULT NULL COMMENT '创建时间',
    `update_time`     DATETIME DEFAULT NULL COMMENT '更新时间',
    `updated`         VARCHAR(64) DEFAULT NULL COMMENT '更新人',
    `created`         VARCHAR(64) DEFAULT NULL COMMENT '创建人',
    `deleted`         VARCHAR(8) DEFAULT NULL COMMENT '删除标记',
    PRIMARY KEY (`id`),
    KEY `idx_tb_user_user_name` (`user_name`),
    KEY `idx_tb_user_phone` (`phone`),
    KEY `idx_tb_user_email` (`email`),
    KEY `idx_tb_user_status` (`status`),
    KEY `idx_tb_user_open_id` (`open_id`),
    KEY `idx_tb_user_last_login_time` (`last_login_time`),
    KEY `idx_tb_user_update_time` (`update_time`)
) ENGINE = InnoDB
  DEFAULT CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_unicode_ci
  COMMENT = '用户信息表';

CREATE TABLE `user_info`
(
    `user_id`         VARCHAR(64) NOT NULL COMMENT '用户ID',
    `password`        VARCHAR(255) DEFAULT NULL COMMENT '密码',
    `status`          VARCHAR(32) DEFAULT NULL COMMENT '状态',
    `phone`           VARCHAR(32) NOT NULL COMMENT '手机号',
    `avatar`          VARCHAR(1024) DEFAULT NULL COMMENT '头像',
    `job`             VARCHAR(128) DEFAULT NULL COMMENT '职位',
    `company`         VARCHAR(255) DEFAULT NULL COMMENT '公司',
    `user_name`       VARCHAR(64) DEFAULT NULL COMMENT '昵称',
    `email`           VARCHAR(254) DEFAULT NULL COMMENT '邮箱',
    `create_time`     DATETIME DEFAULT NULL COMMENT '创建时间',
    `last_login_time` DATETIME DEFAULT NULL COMMENT '最后登录时间',
    `user_money`      DECIMAL(12, 2) DEFAULT NULL COMMENT '金额',
    PRIMARY KEY (`user_id`, `phone`),
    KEY `idx_user_info_phone` (`phone`),
    KEY `idx_user_info_user_name` (`user_name`),
    KEY `idx_user_info_email` (`email`),
    KEY `idx_user_info_status` (`status`),
    KEY `idx_user_info_create_time` (`create_time`),
    KEY `idx_user_info_last_login_time` (`last_login_time`)
) ENGINE = InnoDB
  DEFAULT CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_unicode_ci
  COMMENT = '用户信息表';

CREATE TABLE `tb_user_role`
(
    `id`      INT NOT NULL AUTO_INCREMENT COMMENT '主键ID',
    `user_id` INT NOT NULL COMMENT '用户ID',
    `role_id` INT NOT NULL COMMENT '角色ID',
    PRIMARY KEY (`id`),
    UNIQUE KEY `uk_tb_user_role_user_role` (`user_id`, `role_id`),
    KEY `idx_tb_user_role_role_id` (`role_id`),
    CONSTRAINT `fk_tb_user_role_user`
        FOREIGN KEY (`user_id`) REFERENCES `tb_user` (`id`)
            ON UPDATE CASCADE
            ON DELETE CASCADE
) ENGINE = InnoDB
  DEFAULT CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_unicode_ci
  COMMENT = '用户权限关联表';

CREATE TABLE `user_card_info`
(
    `user_card_id`           VARCHAR(32) NOT NULL COMMENT '身份证号',
    `user_id`                VARCHAR(64) NOT NULL COMMENT '用户ID',
    `user_card_font`         VARCHAR(1024) DEFAULT NULL COMMENT '身份证正面',
    `user_card_reverse`      VARCHAR(1024) DEFAULT NULL COMMENT '身份证反面',
    `user_card_bank_card`    VARCHAR(32) DEFAULT NULL COMMENT '银行卡号',
    `user_card_opening_bank` VARCHAR(255) DEFAULT NULL COMMENT '开户行',
    `user_card_bank`         VARCHAR(128) DEFAULT NULL COMMENT '银行名称',
    PRIMARY KEY (`user_card_id`, `user_id`),
    KEY `idx_user_card_info_user_id` (`user_id`),
    KEY `idx_user_card_info_bank_card` (`user_card_bank_card`)
) ENGINE = InnoDB
  DEFAULT CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_unicode_ci
  COMMENT = '用户身份信息表';

SET FOREIGN_KEY_CHECKS = 1;
