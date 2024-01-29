package com.entity.view;

import com.entity.ZhuanyefenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 专业分类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-27 14:50:32
 */
@TableName("zhuanyefenlei")
public class ZhuanyefenleiView  extends ZhuanyefenleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhuanyefenleiView(){
	}
 
 	public ZhuanyefenleiView(ZhuanyefenleiEntity zhuanyefenleiEntity){
 	try {
			BeanUtils.copyProperties(this, zhuanyefenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
