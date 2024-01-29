package com.dao;

import com.entity.ZixishifenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZixishifenleiVO;
import com.entity.view.ZixishifenleiView;


/**
 * 自习室分类
 * 
 * @author 
 * @email 
 * @date 2021-03-27 14:50:32
 */
public interface ZixishifenleiDao extends BaseMapper<ZixishifenleiEntity> {
	
	List<ZixishifenleiVO> selectListVO(@Param("ew") Wrapper<ZixishifenleiEntity> wrapper);
	
	ZixishifenleiVO selectVO(@Param("ew") Wrapper<ZixishifenleiEntity> wrapper);
	
	List<ZixishifenleiView> selectListView(@Param("ew") Wrapper<ZixishifenleiEntity> wrapper);

	List<ZixishifenleiView> selectListView(Pagination page,@Param("ew") Wrapper<ZixishifenleiEntity> wrapper);
	
	ZixishifenleiView selectView(@Param("ew") Wrapper<ZixishifenleiEntity> wrapper);
	
}
