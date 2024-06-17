package com.entity.view;

import com.entity.BanjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;


/**
 * 班级
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author
 * @email
 * @date 2021-03-04 10:22:19
 */
@TableName("banji")
public class BanjiView  extends BanjiEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    public BanjiView(){
    }

    public BanjiView(BanjiEntity banjiEntity){
        try {
            BeanUtils.copyProperties(this, banjiEntity);
        } catch (IllegalAccessException | InvocationTargetException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
