package com.tony.jee.common.utils;

import java.io.File;
import java.io.IOException;

import com.tony.jee.common.exception.SystemException;

/**
 * 类名称：FileUtil 文件操作共通类
 * 内容摘要：对于文件的共通操作
 * @version 1.0 2011-9-6
 */
public class FileUtil {

    /**
     * 新建文件
     * @param filePath 文件路径
     * @throws SystemException
     */
    public static void createFile(String filePath) throws SystemException {
        File file = new File(filePath);
        try {
            file.getParentFile().mkdirs();
            file.createNewFile();
        } catch (IOException e) {
            throw new SystemException(e, "新建文件失败。");
        }

    }

    /**
     * 新建文件夹
     * @param filePath 文件路径
     */
    public static void createDir(String filePath) {
        File file = new File(filePath);
        file.mkdirs();
    }

    /**
     * 删除指定路径的文件
     * @param filePath 文件路径
     */
    public static void deleteFile(String filePath) {
        File file = new File(filePath);
        if (!file.isDirectory()) {
            file.delete();
        }
        else {
            deleteDir(file);
        }
    }

    /**
     * 递归删除目录所有内容
     * @param dir
     * @return
     */
    public static boolean deleteDir(File dir) {
        if (dir.isDirectory()) {
            File[] listFiles = dir.listFiles();
            for (int i = 0; i < listFiles.length && deleteDir(listFiles[i]); i++) {
            }
        }
        return dir.delete();
    }
}
