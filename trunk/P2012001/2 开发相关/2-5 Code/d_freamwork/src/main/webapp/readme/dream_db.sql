/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2012/4/9 20:45:43                            */
/*==============================================================*/


drop table if exists admin_info;

drop table if exists article_comment_info;

drop table if exists article_info;

drop table if exists article_type_info;

drop table if exists browsing_history;

drop table if exists comment_reply_info;

drop table if exists gift_info;

drop table if exists login_log;

drop table if exists operate_log;

drop table if exists subscribe_info;

drop table if exists support_info;

drop table if exists system_config_info;

drop table if exists user_comment_info;

drop table if exists user_info;

/*==============================================================*/
/* Table: admin_info                                            */
/*==============================================================*/
create table admin_info
(
   user_id              int not null auto_increment,
   login_name           varchar(50),
   login_pass           varchar(50),
   is_invalid           int comment '0：禁用、1：启用',
   primary key (user_id)
);

/*==============================================================*/
/* Table: article_comment_info                                  */
/*==============================================================*/
create table article_comment_info
(
   article_comment_id   int not null auto_increment,
   article_id           int,
   comment_content      varchar(500),
   comment_user_id      int,
   comment_time         datetime,
   verify_state         int comment '0：未审核、2：审核通过、3：审核未通过',
   primary key (article_comment_id)
);

/*==============================================================*/
/* Table: article_info                                          */
/*==============================================================*/
create table article_info
(
   article_id           int not null auto_increment,
   article_content      varchar(2000),
   article_image        varchar(500),
   publish_time         datetime,
   user_id              int comment '对应用户表中的user_id',
   article_type_id      int comment '对应博文类型表中的博文类型ID',
   video_address        varchar(500),
   article_keywords     varchar(500),
   verify_state         int comment '0：未审核、2：审核通过、3：审核未通过',
   primary key (article_id)
);

/*==============================================================*/
/* Table: article_type_info                                     */
/*==============================================================*/
create table article_type_info
(
   article_type_id      int not null auto_increment,
   article_type_name    varchar(50),
   primary key (article_type_id)
);

/*==============================================================*/
/* Table: browsing_history                                      */
/*==============================================================*/
create table browsing_history
(
   browsing_history_id  int not null auto_increment,
   article_id           int,
   user_id              int,
   browse_time          datetime,
   ip_address           varchar(20),
   primary key (browsing_history_id)
);

/*==============================================================*/
/* Table: comment_reply_info                                    */
/*==============================================================*/
create table comment_reply_info
(
   reply_id             int not null auto_increment,
   article_comment_id   int,
   comment_type         int,
   reply_content        varchar(500),
   reply_time           datetime,
   reply_user_id        int,
   verify_state         int comment '0：未审核、2：审核通过、3：审核未通过',
   primary key (reply_id)
);

alter table comment_reply_info comment '记录文章评论的回复信息';

/*==============================================================*/
/* Table: gift_info                                             */
/*==============================================================*/
create table gift_info
(
   gift_id              int not null auto_increment,
   gift_name            varchar(50),
   gift_quantity        int,
   gift_image_address   varchar(500),
   primary key (gift_id)
);

/*==============================================================*/
/* Table: login_log                                             */
/*==============================================================*/
create table login_log
(
   login_log_id         int not null auto_increment,
   login_time           datetime,
   login_ip_address     varchar(20),
   login_user_id        int,
   primary key (login_log_id)
);

/*==============================================================*/
/* Table: operate_log                                           */
/*==============================================================*/
create table operate_log
(
   operate_log_id       int not null auto_increment,
   operate_content      varchar(500),
   operate_target       varchar(100),
   operate_time         datetime,
   operate_result       varchar(500),
   operate_user_id      int,
   primary key (operate_log_id)
);

alter table operate_log comment '记录用户操作记日(普通用户操作、管理员操作)';

/*==============================================================*/
/* Table: subscribe_info                                        */
/*==============================================================*/
create table subscribe_info
(
   subscribe_id         int not null auto_increment,
   user_id              int,
   subscribe_user_id    int,
   primary key (subscribe_id)
);

/*==============================================================*/
/* Table: support_info                                          */
/*==============================================================*/
create table support_info
(
   support_id           int not null auto_increment,
   article_id           int,
   support_user_id      int,
   primary key (support_id)
);

alter table support_info comment '记录文章被支持的数量';

/*==============================================================*/
/* Table: system_config_info                                    */
/*==============================================================*/
create table system_config_info
(
   system_config_id     int not null auto_increment,
   primary key (system_config_id)
);

/*==============================================================*/
/* Table: user_comment_info                                     */
/*==============================================================*/
create table user_comment_info
(
   user_comment_id      int not null auto_increment,
   user_id              int,
   comment_content      varchar(500),
   video_address        varchar(500),
   gift_id              int,
   gift_address         varchar(500),
   images_address       varchar(500),
   comment_user_id      int,
   comment_time         datetime,
   verify_state         int comment '0：未审核、2：审核通过、3：审核未通过',
   primary key (user_comment_id)
);

alter table user_comment_info comment '记录用户对其他人评论的信息';

/*==============================================================*/
/* Table: user_info                                             */
/*==============================================================*/
create table user_info
(
   user_id              int not null auto_increment,
   login_name           varchar(50),
   login_pass           varchar(50),
   user_mail            varchar(100),
   user_name            varchar(50),
   user_sex             int comment '0：女、1：男',
   user_birthday        datetime,
   nation               varchar(50),
   about_myself         varchar(500),
   is_public_mail       int comment '0：不公开、1：公开 ',
   is_send_mail         int comment '0：不接收、1：接收',
   register_time        datetime,
   primary key (user_id)
);

