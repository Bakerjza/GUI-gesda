package com.fdu.se.sootanalyze.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//文件处理帮助类
public class FileUtil {
    //获取apk的真实路径
    public static List<String> getApkPaths(String path){
        List<String> apkPaths = new ArrayList<>();
        File apkDir = new File(path);
        File[] files = apkDir.listFiles();
        for(File f:files){
            if(f.isFile() && f.getName().endsWith(".apk")){
                String apkPath = f.getAbsolutePath();
                apkPaths.add(apkPath);
            }
        }
        return apkPaths;
    }

    //使用该方法写入文件
    public static void filePrintln(String fileName, String content){
        try{
            BufferedWriter out=new BufferedWriter(new FileWriter(fileName,true));
            out.write(content);
            out.newLine();
            out.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    //获取app的真实路径
    public static void main(String[] args) {
        List<String> apkPaths = getApkPaths("E:\\E backup\\AndroidTesting\\test app\\APP1");
        for(String apkPath:apkPaths){
            System.out.println(apkPath);
        }
    }
}
