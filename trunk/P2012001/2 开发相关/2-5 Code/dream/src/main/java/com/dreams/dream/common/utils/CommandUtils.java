package com.dreams.dream.common.utils;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 命令行工具类
 * 
 * @author Lawliet
 * 
 */
public class CommandUtils {

    private static final Logger logger = LoggerFactory.getLogger(CommandUtils.class);
    
    /**
     * 命令行执行命令
     * @param cmd 命令
     * @return 执行结果
     */
    public static String execCmd(String cmd) {

        StringBuffer sb = new StringBuffer("");

        StringBuffer str = new StringBuffer();

        str.append("cmd.exe /c \"").append(cmd).append("\"");

        // 打印执行的命令
        logger.debug(str.toString());

        Process ls_proc;

        try {

            ls_proc = Runtime.getRuntime().exec(str.toString());
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    new DataInputStream(ls_proc.getInputStream())));
            String ss = "";
            while ((ss = in.readLine()) != null) {
                sb.append(ss).append("\n");
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return sb.toString();
    }
}
