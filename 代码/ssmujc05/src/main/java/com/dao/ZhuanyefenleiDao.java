package com.dao;

import com.entity.ZhuanyefenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhuanyefenleiVO;
import com.entity.view.ZhuanyefenleiView;


/**
 * 专业分类
 * 
 * @author 
 * @email 
 * @date 2021-03-27 14:50:32
 */
public interface ZhuanyefenleiDao extends BaseMapper<ZhuanyefenleiEntity> {
	
	List<ZhuanyefenleiVO> selectListVO(@Param("ew") Wrapper<ZhuanyefenleiEntity> wrapper);
	
	ZhuanyefenleiVO selectVO(@Param("ew") Wrapper<ZhuanyefenleiEntity> wrapper);
	
	List<ZhuanyefenleiView> selectListView(@Param("ew") Wrapper<ZhuanyefenleiEntity> wrapper);

	List<ZhuanyefenleiView> selectListView(Pagination page,@Param("ew") Wrapper<ZhuanyefenleiEntity> wrapper);
	
	ZhuanyefenleiView selectView(@Param("ew") Wrapper<ZhuanyefenleiEntity> wrapper);
	
}
