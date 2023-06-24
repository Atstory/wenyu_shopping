package com.yuan.newbeecopy.utils;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
public class BeanUtil {
    public static Object copyProperties(Object source,Object target,String... ignoreProperties){
        if(source == null){
            return target;
        }
        BeanUtils.copyProperties(source, target, ignoreProperties);
        return target;
    }
    public static <T> List<T> copyList(List sources, Class<T> clazz){
        return copyList(sources,clazz,null);
    }
    public static <T> List<T> copyList(List sources, Class<T> clazz, Callback<T> callback) {
        List<T> targetList = new ArrayList<>();
        if (sources != null) {
            try {
                for (Object source : sources) {
                    T target = clazz.newInstance();
                    Object o = copyProperties(source, target);
                    if(callback != null){
                        callback.set(source,target);
                    }
//                    log.info("target为->{}",target);
                    targetList.add(target);
                }
            } catch (InstantiationException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
        return targetList;
    }

    public static interface Callback<T> {
        void set(Object source, T target);
    }
}
