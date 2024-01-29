package com.entity.view;

import com.entity.ZuoweixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 座位信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-27 14:50:32
 */
@TableName("zuoweixinxi")
public class ZuoweixinxiView  extends ZuoweixinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZuoweixinxiView(){
	}
 
 	public ZuoweixinxiView(ZuoweixinxiEntity zuoweixinxiEntity){
 	try {
			BeanUtils.copyProperties(this, zuoweixinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
