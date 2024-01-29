package com.entity.vo;

import com.entity.ZuoweixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 座位信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-27 14:50:32
 */
public class ZuoweixinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 自习室
	 */
	
	private String zixishi;
		
	/**
	 * 座位状态
	 */
	
	private String zuoweizhuangtai;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
				
	
	/**
	 * 设置：自习室
	 */
	 
	public void setZixishi(String zixishi) {
		this.zixishi = zixishi;
	}
	
	/**
	 * 获取：自习室
	 */
	public String getZixishi() {
		return zixishi;
	}
				
	
	/**
	 * 设置：座位状态
	 */
	 
	public void setZuoweizhuangtai(String zuoweizhuangtai) {
		this.zuoweizhuangtai = zuoweizhuangtai;
	}
	
	/**
	 * 获取：座位状态
	 */
	public String getZuoweizhuangtai() {
		return zuoweizhuangtai;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
			
}
