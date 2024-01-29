package com.entity.view;

import com.entity.ZuoweiyuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 座位预约
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-27 14:50:32
 */
@TableName("zuoweiyuyue")
public class ZuoweiyuyueView  extends ZuoweiyuyueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZuoweiyuyueView(){
	}
 
 	public ZuoweiyuyueView(ZuoweiyuyueEntity zuoweiyuyueEntity){
 	try {
			BeanUtils.copyProperties(this, zuoweiyuyueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
