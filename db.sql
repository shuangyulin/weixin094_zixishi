/*
SQLyog Ultimate v11.3 (64 bit)
MySQL - 5.7.32-log : Database - ssmujc05
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`ssmujc05` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `ssmujc05`;

/*Table structure for table `config` */

DROP TABLE IF EXISTS `config`;

CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='配置文件';

/*Data for the table `config` */

insert  into `config`(`id`,`name`,`value`) values (1,'picture1','http://localhost:8080/ssmujc05/upload/picture1.jpg'),(2,'picture2','http://localhost:8080/ssmujc05/upload/picture2.jpg'),(3,'picture3','http://localhost:8080/ssmujc05/upload/picture3.jpg'),(6,'homepage',NULL);

/*Table structure for table `messages` */

DROP TABLE IF EXISTS `messages`;

CREATE TABLE `messages` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '留言人id',
  `username` varchar(200) DEFAULT NULL COMMENT '用户名',
  `content` longtext NOT NULL COMMENT '留言内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1616828671330 DEFAULT CHARSET=utf8 COMMENT='留言板';

/*Data for the table `messages` */

insert  into `messages`(`id`,`addtime`,`userid`,`username`,`content`,`reply`) values (81,'2021-03-27 14:50:47',1,'用户名1','留言内容1','回复内容1'),(82,'2021-03-27 14:50:47',2,'用户名2','留言内容2','回复内容2'),(83,'2021-03-27 14:50:47',3,'用户名3','留言内容3','回复内容3'),(84,'2021-03-27 14:50:47',4,'用户名4','留言内容4','回复内容4'),(85,'2021-03-27 14:50:47',5,'用户名5','留言内容5','回复内容5'),(86,'2021-03-27 14:50:47',6,'用户名6','留言内容6','回复内容6'),(1616828671329,'2021-03-27 15:04:30',1616828614688,'001','测试','测试001');

/*Table structure for table `news` */

DROP TABLE IF EXISTS `news`;

CREATE TABLE `news` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `title` varchar(200) NOT NULL COMMENT '标题',
  `introduction` longtext COMMENT '简介',
  `picture` varchar(200) NOT NULL COMMENT '图片',
  `content` longtext NOT NULL COMMENT '内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=77 DEFAULT CHARSET=utf8 COMMENT='图书馆资讯';

/*Data for the table `news` */

insert  into `news`(`id`,`addtime`,`title`,`introduction`,`picture`,`content`) values (71,'2021-03-27 14:50:47','标题1','简介1','http://localhost:8080/ssmujc05/upload/news_picture1.jpg','内容1'),(72,'2021-03-27 14:50:47','标题2','简介2','http://localhost:8080/ssmujc05/upload/news_picture2.jpg','内容2'),(73,'2021-03-27 14:50:47','标题3','简介3','http://localhost:8080/ssmujc05/upload/news_picture3.jpg','内容3'),(74,'2021-03-27 14:50:47','标题4','简介4','http://localhost:8080/ssmujc05/upload/news_picture4.jpg','内容4'),(75,'2021-03-27 14:50:47','标题5','简介5','http://localhost:8080/ssmujc05/upload/news_picture5.jpg','内容5'),(76,'2021-03-27 14:50:47','标题6','简介6','http://localhost:8080/ssmujc05/upload/news_picture6.jpg','内容6');

/*Table structure for table `token` */

DROP TABLE IF EXISTS `token`;

CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='token表';

/*Data for the table `token` */

insert  into `token`(`id`,`userid`,`username`,`tablename`,`role`,`token`,`addtime`,`expiratedtime`) values (1,1616828372847,'11','xuesheng','学生','razigkblkt2r15h0nj0lqi1wfyzjmzve','2021-03-27 14:59:38','2021-03-27 15:59:38'),(2,1616828614688,'001','xuesheng','学生','860v9b58uh4d5idz6e36xtf3ybfdcjz1','2021-03-27 15:03:43','2021-03-27 16:03:43'),(3,1,'abo','users','管理员','s2wj96nbxolcp6buocqn9gxpb28h1fiu','2021-03-27 15:05:23','2021-03-27 16:05:23');

/*Table structure for table `users` */

DROP TABLE IF EXISTS `users`;

CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';

/*Data for the table `users` */

insert  into `users`(`id`,`username`,`password`,`role`,`addtime`) values (1,'abo','abo','管理员','2021-03-27 14:50:47');

/*Table structure for table `xuesheng` */

DROP TABLE IF EXISTS `xuesheng`;

CREATE TABLE `xuesheng` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xuehao` varchar(200) NOT NULL COMMENT '学号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `nianling` int(11) DEFAULT NULL COMMENT '年龄',
  `xueyuan` varchar(200) DEFAULT NULL COMMENT '学院',
  `zhuanye` varchar(200) DEFAULT NULL COMMENT '专业',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `youxiang` varchar(200) DEFAULT NULL COMMENT '邮箱',
  `zhaopian` varchar(200) DEFAULT NULL COMMENT '照片',
  PRIMARY KEY (`id`),
  UNIQUE KEY `xuehao` (`xuehao`)
) ENGINE=InnoDB AUTO_INCREMENT=1616828614689 DEFAULT CHARSET=utf8 COMMENT='学生';

/*Data for the table `xuesheng` */

insert  into `xuesheng`(`id`,`addtime`,`xuehao`,`mima`,`xingming`,`xingbie`,`nianling`,`xueyuan`,`zhuanye`,`shouji`,`youxiang`,`zhaopian`) values (11,'2021-03-27 14:50:46','学生1','123456','姓名1','男',1,'学院1','专业1','13823888881','773890001@qq.com','http://localhost:8080/ssmujc05/upload/xuesheng_zhaopian1.jpg'),(12,'2021-03-27 14:50:46','学生2','123456','姓名2','男',2,'学院2','专业2','13823888882','773890002@qq.com','http://localhost:8080/ssmujc05/upload/xuesheng_zhaopian2.jpg'),(13,'2021-03-27 14:50:46','学生3','123456','姓名3','男',3,'学院3','专业3','13823888883','773890003@qq.com','http://localhost:8080/ssmujc05/upload/xuesheng_zhaopian3.jpg'),(14,'2021-03-27 14:50:46','学生4','123456','姓名4','男',4,'学院4','专业4','13823888884','773890004@qq.com','http://localhost:8080/ssmujc05/upload/xuesheng_zhaopian4.jpg'),(16,'2021-03-27 14:50:46','张三','123456','姓名6','男',6,'学院6','专业6','13823888886','773890006@qq.com','http://localhost:8080/ssmujc05/upload/xuesheng_zhaopian6.jpg'),(1616828372847,'2021-03-27 14:59:32','11','11','11','男',NULL,'学院分类1','专业分类1',NULL,NULL,NULL),(1616828614688,'2021-03-27 15:03:34','001','001','001','男',18,'学院分类3','专业分类3','13800000000','123@qq.com',NULL);

/*Table structure for table `xueyuanfenlei` */

DROP TABLE IF EXISTS `xueyuanfenlei`;

CREATE TABLE `xueyuanfenlei` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xueyuanfenlei` varchar(200) DEFAULT NULL COMMENT '学院分类',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=utf8 COMMENT='学院分类';

/*Data for the table `xueyuanfenlei` */

insert  into `xueyuanfenlei`(`id`,`addtime`,`xueyuanfenlei`) values (51,'2021-03-27 14:50:46','电子信息工程'),(52,'2021-03-27 14:50:46','学院分类2'),(53,'2021-03-27 14:50:46','学院分类3'),(54,'2021-03-27 14:50:46','学院分类4'),(55,'2021-03-27 14:50:46','学院分类5'),(56,'2021-03-27 14:50:46','学院分类6');

/*Table structure for table `zhuanyefenlei` */

DROP TABLE IF EXISTS `zhuanyefenlei`;

CREATE TABLE `zhuanyefenlei` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhuanyefenlei` varchar(200) DEFAULT NULL COMMENT '专业分类',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=67 DEFAULT CHARSET=utf8 COMMENT='专业分类';

/*Data for the table `zhuanyefenlei` */

insert  into `zhuanyefenlei`(`id`,`addtime`,`zhuanyefenlei`) values (62,'2021-03-27 14:50:47','专业分类2'),(63,'2021-03-27 14:50:47','专业分类3'),(64,'2021-03-27 14:50:47','专业分类4'),(65,'2021-03-27 14:50:47','专业分类5'),(66,'2021-03-27 14:50:47','专业分类6');

/*Table structure for table `zixishifenlei` */

DROP TABLE IF EXISTS `zixishifenlei`;

CREATE TABLE `zixishifenlei` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zixishi` varchar(200) DEFAULT NULL COMMENT '自习室',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1616828785147 DEFAULT CHARSET=utf8 COMMENT='自习室分类';

/*Data for the table `zixishifenlei` */

insert  into `zixishifenlei`(`id`,`addtime`,`zixishi`) values (31,'2021-03-27 14:50:46','自习室1'),(32,'2021-03-27 14:50:46','自习室2'),(33,'2021-03-27 14:50:46','自习室3'),(34,'2021-03-27 14:50:46','自习室4'),(35,'2021-03-27 14:50:46','自习室5'),(36,'2021-03-27 14:50:46','自习室6'),(1616828785146,'2021-03-27 15:06:25','自习室7');

/*Table structure for table `zuoweixinxi` */

DROP TABLE IF EXISTS `zuoweixinxi`;

CREATE TABLE `zuoweixinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zuoweibianhao` varchar(200) DEFAULT NULL COMMENT '座位编号',
  `zixishi` varchar(200) DEFAULT NULL COMMENT '自习室',
  `zuoweizhuangtai` varchar(200) DEFAULT NULL COMMENT '座位状态',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `beizhu` varchar(200) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`),
  UNIQUE KEY `zuoweibianhao` (`zuoweibianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8 COMMENT='座位信息';

/*Data for the table `zuoweixinxi` */

insert  into `zuoweixinxi`(`id`,`addtime`,`zuoweibianhao`,`zixishi`,`zuoweizhuangtai`,`tupian`,`beizhu`) values (22,'2021-03-27 14:50:46','座位编号2','自习室2','未预约','http://localhost:8080/ssmujc05/upload/zuoweixinxi_tupian2.jpg','备注2'),(23,'2021-03-27 14:50:46','座位编号3','自习室3','未预约','http://localhost:8080/ssmujc05/upload/zuoweixinxi_tupian3.jpg','备注3'),(24,'2021-03-27 14:50:46','座位编号4','自习室4','未预约','http://localhost:8080/ssmujc05/upload/zuoweixinxi_tupian4.jpg','备注4'),(25,'2021-03-27 14:50:46','座位编号5','自习室5','未预约','http://localhost:8080/ssmujc05/upload/zuoweixinxi_tupian5.jpg','备注5'),(26,'2021-03-27 14:50:46','座位编号6','自习室6','未预约','http://localhost:8080/ssmujc05/upload/zuoweixinxi_tupian6.jpg','备注6');

/*Table structure for table `zuoweiyuyue` */

DROP TABLE IF EXISTS `zuoweiyuyue`;

CREATE TABLE `zuoweiyuyue` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zuoweibianhao` varchar(200) DEFAULT NULL COMMENT '座位编号',
  `zixishi` varchar(200) DEFAULT NULL COMMENT '自习室',
  `zuoweizhuangtai` varchar(200) DEFAULT NULL COMMENT '座位状态',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `xuehao` varchar(200) DEFAULT NULL COMMENT '学号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `yuyueshijian` datetime DEFAULT NULL COMMENT '预约时间',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1616828653070 DEFAULT CHARSET=utf8 COMMENT='座位预约';

/*Data for the table `zuoweiyuyue` */

insert  into `zuoweiyuyue`(`id`,`addtime`,`zuoweibianhao`,`zixishi`,`zuoweizhuangtai`,`tupian`,`xuehao`,`xingming`,`yuyueshijian`,`sfsh`,`shhf`,`userid`) values (41,'2021-03-27 14:50:46','座位编号1','自习室1','座位状态1','http://localhost:8080/ssmujc05/upload/zuoweiyuyue_tupian1.jpg','学号1','姓名1','2021-03-27 14:50:46','是','',1),(42,'2021-03-27 14:50:46','座位编号2','自习室2','座位状态2','http://localhost:8080/ssmujc05/upload/zuoweiyuyue_tupian2.jpg','学号2','姓名2','2021-03-27 14:50:46','是','',2),(43,'2021-03-27 14:50:46','座位编号3','自习室3','座位状态3','http://localhost:8080/ssmujc05/upload/zuoweiyuyue_tupian3.jpg','学号3','姓名3','2021-03-27 14:50:46','是','',3),(44,'2021-03-27 14:50:46','座位编号4','自习室4','座位状态4','http://localhost:8080/ssmujc05/upload/zuoweiyuyue_tupian4.jpg','学号4','姓名4','2021-03-27 14:50:46','是','',4),(45,'2021-03-27 14:50:46','座位编号5','自习室5','座位状态5','http://localhost:8080/ssmujc05/upload/zuoweiyuyue_tupian5.jpg','学号5','姓名5','2021-03-27 14:50:46','是','',5),(46,'2021-03-27 14:50:46','座位编号6','自习室6','座位状态6','http://localhost:8080/ssmujc05/upload/zuoweiyuyue_tupian6.jpg','学号6','姓名6','2021-03-27 14:50:46','是','',6),(1616828642471,'2021-03-27 15:04:02','座位编号4','自习室4','未预约','http://localhost:8080/ssmujc05/upload/zuoweixinxi_tupian4.jpg','001','001','2021-03-27 16:00:08','是','',1616828614688);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
