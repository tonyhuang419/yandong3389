package com.dreams.dream.common.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 数据库操作工具类
 * 
 * @version 2012-05-20
 * @author Lawliet
 */
public class DBUtils {
    
    private static final Logger logger = LoggerFactory.getLogger(DBUtils.class);

//    public static void main(String[] args) {
//        backupDatebase("localhost", "root", "root", "dream_db", "E:/dream_db.sql");
//    }
    
    /**
     * 备份数据库
     * 
     * @param host 备份数据库的IP地址
     * @param username 数据库的用户名
     * @param password 数据库的密码
     * @param datebaseName 数据库名称
     * @param filePath 备份文件存放的位置(含文件名称)
     * @return boolean 备份成功标识
     */
    public static boolean backupDatebase(String host, String username,
            String password, String datebaseName, String filePath) {

        // 命令字符串
        StringBuilder commandBuilder = new StringBuilder();
        // TODO 调用mysql自带的mysqldump命令(需要配置环境变量,否则就要把mysql的全路径带上)
        commandBuilder.append("\"C:/Program Files (x86)/MySQL/MySQL Server 5.1/bin/\"");
        // 调用mysql自带的mysqldump命令
        commandBuilder.append("mysqldump");
        // 主机地址
        commandBuilder.append(" -h").append(host);
        // 数据库用户名
        commandBuilder.append(" -u").append(username);
        // 数据库密码
        commandBuilder.append(" -p").append(password);
        // mysql
        commandBuilder.append(" mysql>");
        // 导出备份文件存放全路径
        commandBuilder.append(filePath);

        // 执行导出数据库文件,接收执行结果
        String result = CommandUtils.execCmd(commandBuilder.toString());
        // 打印执行结果
        logger.debug(result);
        
        return true;
    }

}
