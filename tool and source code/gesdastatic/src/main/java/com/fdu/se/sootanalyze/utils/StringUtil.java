package com.fdu.se.sootanalyze.utils;

//字符串处理帮助类
public class StringUtil {
    public static String convertToAct(String classStr){
        int len = classStr.length();
        String str = classStr.substring(8, len - 2);
        return str.replace('/', '.');
    }

    //转换为标签形式的字符串
    public static String convertToLabel(String apkPath){
        String[] nameArray = null;
        if(apkPath.contains("/")){
            nameArray = apkPath.split("/");
        }else{
            nameArray = apkPath.split("\\\\");
        }
        String appFullName = nameArray[nameArray.length - 1];
        int length = appFullName.length();
        return appFullName.substring(0, length - 4);
    }
}
