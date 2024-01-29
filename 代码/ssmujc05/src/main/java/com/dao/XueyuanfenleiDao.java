package com.dao;

import com.entity.XueyuanfenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XueyuanfenleiVO;
import com.entity.view.XueyuanfenleiView;


/**
 * 学院分类
 * 
 * @author 
 * @email 
 * @date 2021-03-27 14:50:32
 */
public interface XueyuanfenleiDao extends BaseMapper<XueyuanfenleiEntity> {
	
	List<XueyuanfenleiVO> selectListVO(@Param("ew") Wrapper<XueyuanfenleiEntity> wrapper);
	
	XueyuanfenleiVO selectVO(@Param("ew") Wrapper<XueyuanfenleiEntity> wrapper);
	
	List<XueyuanfenleiView> selectListView(@Param("ew") Wrapper<XueyuanfenleiEntity> wrapper);

	List<XueyuanfenleiView> selectListView(Pagination page,@Param("ew") Wrapper<XueyuanfenleiEntity> wrapper);
	
	XueyuanfenleiView selectView(@Param("ew") Wrapper<XueyuanfenleiEntity> wrapper);
	
}
