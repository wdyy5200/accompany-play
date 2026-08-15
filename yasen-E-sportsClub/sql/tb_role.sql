-- 角色表
CREATE TABLE `tb_role` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT '角色ID',
  `role_name` VARCHAR(50) NOT NULL COMMENT '角色名称',
  `role_key` VARCHAR(50) NOT NULL COMMENT '角色标识',
  `status` INT DEFAULT 1 COMMENT '状态 1:正常 0:禁用',
  `remark` VARCHAR(255) DEFAULT NULL COMMENT '备注',
  `create_time` DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_role_key` (`role_key`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='角色表';

-- 初始化三种角色
INSERT INTO `tb_role` (`role_name`, `role_key`, `status`, `remark`) VALUES
('普通用户', 'user', 1, '普通用户，可浏览和下单'),
('管理员', 'admin', 1, '系统管理员，拥有全部权限'),
('打手', 'booster', 1, '陪玩打手，可接单和管理订单');

