package com.entity.view;

import com.entity.XueyuanfenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 学院分类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-27 14:50:32
 */
@TableName("xueyuanfenlei")
public class XueyuanfenleiView  extends XueyuanfenleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XueyuanfenleiView(){
	}
 
 	public XueyuanfenleiView(XueyuanfenleiEntity xueyuanfenleiEntity){
 	try {
			BeanUtils.copyProperties(this, xueyuanfenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
