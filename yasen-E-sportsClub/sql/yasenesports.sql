/*
 Navicat Premium Dump SQL

 Source Server         : MySQL
 Source Server Type    : MySQL
 Source Server Version : 80041 (8.0.41)
 Source Host           : localhost:3306
 Source Schema         : yasenesports

 Target Server Type    : MySQL
 Target Server Version : 80041 (8.0.41)
 File Encoding         : 65001

 Date: 11/08/2026 13:37:43
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_config
-- ----------------------------
DROP TABLE IF EXISTS `tb_config`;
CREATE TABLE `tb_config`  (
                              `id` int NOT NULL,
                              `pid` int NULL DEFAULT NULL,
                              `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
                              `is_exist` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '是否展示',
                              `created` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
                              `updated` datetime NULL DEFAULT NULL,
                              `deleted` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
                              `create_time` datetime NULL DEFAULT NULL,
                              `update_time` datetime NULL DEFAULT NULL,
                              `dlete_time` datetime NULL DEFAULT NULL,
                              PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '配置表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for tb_config_prodrict
-- ----------------------------
DROP TABLE IF EXISTS `tb_config_prodrict`;
CREATE TABLE `tb_config_prodrict`  (
                                       `id` int NOT NULL,
                                       `config_id` int NULL DEFAULT NULL COMMENT '配置表',
                                       `prodrict_id` int NULL DEFAULT NULL COMMENT '商品表',
                                       PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '配置订单关联表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for tb_discount_coupon
-- ----------------------------
DROP TABLE IF EXISTS `tb_discount_coupon`;
CREATE TABLE `tb_discount_coupon`  (
                                       `id` int NOT NULL,
                                       `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '名称',
                                       `types` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '类型',
                                       `price` decimal(10, 2) NULL DEFAULT NULL COMMENT '面值',
                                       `Minimum_price` decimal(10, 2) NULL DEFAULT NULL COMMENT '最低要求金额',
                                       `used_quantity` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '已用数量',
                                       `total_number` int NULL DEFAULT NULL COMMENT '总数量',
                                       `strat_time` datetime NULL DEFAULT NULL COMMENT '开始时间',
                                       `end_time` datetime NULL DEFAULT NULL COMMENT '结束时间',
                                       `status` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '状态',
                                       `created` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
                                       `updated` datetime NULL DEFAULT NULL,
                                       `create_time` datetime NULL DEFAULT NULL,
                                       `update_time` datetime NULL DEFAULT NULL,
                                       `picture` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '图片',
                                       PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '优惠卷表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for tb_last_login_info
-- ----------------------------
DROP TABLE IF EXISTS `tb_last_login_info`;
CREATE TABLE `tb_last_login_info`  (
                                       `id` int NOT NULL,
                                       `user_id` int NULL DEFAULT NULL,
                                       `first_active_time` datetime NULL DEFAULT NULL COMMENT '当天',
                                       `last_active_time` datetime NULL DEFAULT NULL COMMENT '最后',
                                       PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '用户在线统计表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for tb_menu
-- ----------------------------
DROP TABLE IF EXISTS `tb_menu`;
CREATE TABLE `tb_menu`  (
                            `menu_id` bigint NOT NULL AUTO_INCREMENT COMMENT '菜单ID',
                            `menu_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '菜单名称',
                            `parent_id` bigint NULL DEFAULT 0 COMMENT '父菜单ID',
                            `order_num` int NULL DEFAULT 0 COMMENT '显示顺序',
                            `path` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '路由地址',
                            `component` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '组件路径',
                            `query` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '路由参数',
                            `route_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '路由名称',
                            `is_frame` int NULL DEFAULT 1 COMMENT '是否为外链（0是 1否）',
                            `is_cache` int NULL DEFAULT 0 COMMENT '是否缓存（0缓存 1不缓存）',
                            `menu_type` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '菜单类型（M目录 C菜单 F按钮）',
                            `visible` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '0' COMMENT '菜单状态（0显示 1隐藏）',
                            `status` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '0' COMMENT '菜单状态（0正常 1停用）',
                            `perms` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '权限标识',
                            `icon` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '#' COMMENT '菜单图标',
                            `create_by` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '创建者',
                            `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
                            `update_by` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '更新者',
                            `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
                            `remark` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '备注',
                            PRIMARY KEY (`menu_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2000 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '菜单权限表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for tb_order
-- ----------------------------
DROP TABLE IF EXISTS `tb_order`;
CREATE TABLE `tb_order`  (
                             `id` int NOT NULL,
                             `prodrict_id` int NULL DEFAULT NULL COMMENT '商品id',
                             `user_id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户id',
                             `employee_id` int NULL DEFAULT NULL COMMENT '员工id',
                             `status` int NULL DEFAULT NULL COMMENT '状态0未接单，1接单，2.进行中。3结束，4异常，5流单，6未付款',
                             `create_time` datetime NULL DEFAULT NULL COMMENT '下单时间',
                             `strat_time` datetime NULL DEFAULT NULL COMMENT '接单时间',
                             `end_time` datetime NULL DEFAULT NULL COMMENT '结单时间',
                             `note` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注',
                             `pid` int NULL DEFAULT NULL COMMENT '补单父id',
                             `created` tinyint NULL DEFAULT NULL COMMENT '创建者',
                             `updated` tinyint NULL DEFAULT NULL COMMENT '修改者',
                             `update_time` datetime NULL DEFAULT NULL COMMENT '修改时间',
                             PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '订单信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for tb_order_price_info
-- ----------------------------
DROP TABLE IF EXISTS `tb_order_price_info`;
CREATE TABLE `tb_order_price_info`  (
                                        `id` int NOT NULL,
                                        `emp_id` int NULL DEFAULT NULL COMMENT '打手id',
                                        `price` decimal(10, 2) NULL DEFAULT NULL COMMENT '金额',
                                        `order_id` int NULL DEFAULT NULL COMMENT '订单id',
                                        PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '打手金额日志表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for tb_permission
-- ----------------------------
DROP TABLE IF EXISTS `tb_permission`;
CREATE TABLE `tb_permission`  (
                                  `id` bigint NOT NULL,
                                  `prem_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '名称',
                                  `status` tinyint NULL DEFAULT NULL COMMENT '状态0是正常1是停用·1\r\n',
                                  `created` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '创建者',
                                  `updated` datetime NULL DEFAULT NULL COMMENT '修改者',
                                  `deleted` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '删除者',
                                  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
                                  `update_time` datetime NULL DEFAULT NULL COMMENT '修改时间',
                                  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '权限设计表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for tb_points
-- ----------------------------
DROP TABLE IF EXISTS `tb_points`;
CREATE TABLE `tb_points`  (
                              `id` int NOT NULL,
                              `user_id` int NULL DEFAULT NULL,
                              `available_points` decimal(10, 2) NULL DEFAULT NULL COMMENT '可用积分',
                              `total_number_points` decimal(10, 2) NULL DEFAULT NULL COMMENT '总积分',
                              `consumed_points` decimal(10, 2) NULL DEFAULT NULL COMMENT '已消费积分',
                              `update_time` datetime NULL DEFAULT NULL COMMENT '修改时间',
                              PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '积分信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for tb_points_log
-- ----------------------------
DROP TABLE IF EXISTS `tb_points_log`;
CREATE TABLE `tb_points_log`  (
                                  `id` int NOT NULL,
                                  `points_id` int NULL DEFAULT NULL,
                                  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
                                  `price` decimal(10, 2) NULL DEFAULT NULL COMMENT '金额',
                                  `points` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '积分',
                                  `status` int NULL DEFAULT NULL COMMENT '状态',
                                  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '积分日志表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for tb_price
-- ----------------------------
DROP TABLE IF EXISTS `tb_price`;
CREATE TABLE `tb_price`  (
                             `id` int NOT NULL,
                             `user_id` int NULL DEFAULT NULL,
                             `price` decimal(10, 2) NULL DEFAULT NULL COMMENT '总金额',
                             `Today_price` decimal(10, 2) NULL DEFAULT NULL COMMENT '今日金额',
                             `withdrawal_price` decimal(10, 2) NULL DEFAULT NULL COMMENT '可提现金额',
                             `Withdrawn_price` decimal(10, 2) NULL DEFAULT NULL COMMENT '已提现金额',
                             PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '打手金额表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for tb_price_info
-- ----------------------------
DROP TABLE IF EXISTS `tb_price_info`;
CREATE TABLE `tb_price_info`  (
                                  `id` int NOT NULL,
                                  `emp_id` int NULL DEFAULT NULL COMMENT '打手id',
                                  `price` decimal(10, 2) NULL DEFAULT NULL COMMENT '金额',
                                  `status` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '状态0提现成功，1提现失败，2提现中，3提现成功',
                                  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
                                  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '金额提现表\r\n' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for tb_prodrict
-- ----------------------------
DROP TABLE IF EXISTS `tb_prodrict`;
CREATE TABLE `tb_prodrict`  (
                                `id` int NOT NULL,
                                `prod_name` int NULL DEFAULT NULL COMMENT '名称',
                                `prod_price` decimal(10, 2) NULL DEFAULT NULL COMMENT '原价',
                                `prod_title` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '标题',
                                `prod_disc_price` decimal(10, 2) NULL DEFAULT NULL COMMENT '折扣价',
                                `peod_img` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '图片',
                                `prod_start_time` datetime NULL DEFAULT NULL COMMENT '开始时间',
                                `prod_end_time` datetime NULL DEFAULT NULL COMMENT '结束时间',
                                `prod_content` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
                                `prod_text` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '内容',
                                `created` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
                                `updated` datetime NULL DEFAULT NULL,
                                `deleted` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
                                `create_time` datetime NULL DEFAULT NULL,
                                `update_time` datetime NULL DEFAULT NULL,
                                `delete_time` datetime NULL DEFAULT NULL,
                                `prod_status` tinyint NULL DEFAULT NULL COMMENT '是否发布',
                                PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '商品信息表\r\n' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for tb_role_menu
-- ----------------------------
DROP TABLE IF EXISTS `tb_role_menu`;
CREATE TABLE `tb_role_menu`  (
                                 `id` int NOT NULL,
                                 `role_id` int NULL DEFAULT NULL,
                                 `menu_id` int NULL DEFAULT NULL,
                                 `create_time` datetime NULL DEFAULT NULL,
                                 `update_time` datetime NULL DEFAULT NULL,
                                 `delete_time` datetime NULL DEFAULT NULL,
                                 `updated` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
                                 `deleted` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
                                 `created` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
                                 PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '菜单权限关联表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for tb_user
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user`  (
                            `id` int NOT NULL AUTO_INCREMENT,
                            `user_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '账号',
                            `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '密码',
                            `role_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '昵称',
                            `real_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '真实姓名',
                            `email` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '邮箱',
                            `phone` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '手机号',
                            `id_card` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '身份证号',
                            `id_card_img` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '身份证图片',
                            `status` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '状态',
                            `last_login_time` datetime NULL DEFAULT NULL COMMENT '最后登录时间',
                            `open_id` int NULL DEFAULT NULL,
                            `open_img` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '微信头像',
                            `create_time` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
                            `update_time` datetime NULL DEFAULT NULL,
                            `updated` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
                            `created` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
                            `deleted` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
                            PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '用户信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for tb_user_role
-- ----------------------------
DROP TABLE IF EXISTS `tb_user_role`;
CREATE TABLE `tb_user_role`  (
                                 `id` int NOT NULL,
                                 `user_id` int NULL DEFAULT NULL,
                                 `role_id` int NULL DEFAULT NULL,
                                 PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '用户权限关联表' ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
