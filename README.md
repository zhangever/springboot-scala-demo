# springboot-scala-demo
springBoot+scala，清爽的不能再清爽了， 行走江湖必备

目前已有springMvc、接口文档以及在线测试以及访问数据库的能力

接口文档以及在线测试请访问:
http://localhost:8080/swagger-ui.html

http://localhost:8080/demo/listAllParameters

初始化脚本:
CREATE SCHEMA IF NOT EXISTS `localdb` DEFAULT CHARACTER SET utf8 ;
USE `localdb` ;

CREATE TABLE IF NOT EXISTS `localdb`.`t_parameter` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `code` VARCHAR(100) NOT NULL COMMENT '系统参数编码',
  `value` VARCHAR(500) NOT NULL COMMENT '系统参数值',
  `status` SMALLINT(2) NOT NULL DEFAULT '1' COMMENT '状态,0:无效(invalid);1:有效(valid)',
  `remark` VARCHAR(100) NULL COMMENT '备注',
  PRIMARY KEY (`id`))
ENGINE = InnoDB
COMMENT = '系统参数表';

insert into t_parameter(code,value)
values
("max_item_size","10"),
("default_item_size","5");
