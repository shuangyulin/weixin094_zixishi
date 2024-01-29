package com.entity.view;

import com.entity.ZixishifenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 自习室分类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-27 14:50:32
 */
@TableName("zixishifenlei")
public class ZixishifenleiView  extends ZixishifenleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZixishifenleiView(){
	}
 
 	public ZixishifenleiView(ZixishifenleiEntity zixishifenleiEntity){
 	try {
			BeanUtils.copyProperties(this, zixishifenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
