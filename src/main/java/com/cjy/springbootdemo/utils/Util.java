package com.cjy.springbootdemo.utils;

import lombok.extern.log4j.Log4j2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/**
 * @ClassName:Util
 * @Descirpiton: TODO
 * @Author: Gaoww
 * @Date: 2020/6/2 10:27
 * @Version: 1.0
 */
@Log4j2
public class Util {


    /**
     * Is null boolean.
     *
     * @param objList List
     * @return boolean boolean
     */
    public static boolean isNull(List objList){
        return objList==null||objList.size()==0;
    }
    /**判断字符串是否为空*/
    /**
     * Is null boolean.
     *
     * @param value String
     * @return boolean boolean
     */
    public static boolean isNull(String value){
        return (value==null||value.trim().length()==0);
    }
    /**判断日期变量是否为空*/
    /**
     * Is null boolean.
     *
     * @param date Date
     * @return boolean boolean
     */
    public static boolean isNull(Date date){
        return date==null;
    }
    /**判断整型变量是否为空*/
    /**
     * Is null boolean.
     *
     * @param value Integer
     * @return boolean boolean
     */
    public static boolean isNull(Integer value){
        return value==null||value.intValue()<0;
    }

    /**
     *
     * @param value Long
     * @return boolean
     */
    public static boolean isNull(Long value){
        return value==null||value.intValue()<0;
    }
    /**
     * Get time string string.
     *
     * @param dateformat String
     * @return String string
     */
    public static String getTimeString(String dateformat){
        SimpleDateFormat format = new SimpleDateFormat(dateformat);
        Date now = new Date();
        return format.format(now);
    }

    /**
     * Get date format cn str string.
     *
     * @param date    Date
     * @param pattern String
     * @return String string
     */
    public static String getDateFormatCnStr(Date date,String pattern){
        if(date==null){
            return "";
        }
        String result = null;
        try{
            SimpleDateFormat sdf = new SimpleDateFormat(pattern, Locale.SIMPLIFIED_CHINESE);
            result = sdf.format(date);
        }catch(Exception e){
            log.error("时间转换出错：Date"+date.toString()+",pattern"+pattern, e);
        }
        if(!isNull(result)){
            return result;
        }
        return "";
    }
    /**
     * 获得时间对象，输入时间为“2007-12-12”*/
    /**
     * Get cn date date.
     *
     * @param dateStr String
     * @param patt    String
     * @return Date date
     */
    public static Date getCnDate(String dateStr,String patt){
        if(isNull(dateStr)){
            return null;
        }
        String pattern = "yyyy-MM-dd";
        if(!isNull(patt)){
            pattern=patt;
        }
        Date result=null;
        try{
            SimpleDateFormat sdf = new SimpleDateFormat(pattern, Locale.SIMPLIFIED_CHINESE);
            result = sdf.parse(dateStr);
        }catch(Exception e){
            log.error("时间转换出错：Date:"+dateStr+",pattern:"+patt, e);
        }
        return result;
    }
    /** 获得时间对象，支持两种格式的输入时间*/
    /**
     * Get cn date new date.
     *
     * @param dateStr String
     * @return Date date
     */
    public static Date getCnDateNew(String dateStr){
        String pattern = "yyyy-MM-dd";
        if (!Util.isNull(dateStr) && dateStr.indexOf('-') ==-1){
            pattern = "yyyyMMdd";
        }
        return getCnDate(dateStr, pattern);
    }
}
