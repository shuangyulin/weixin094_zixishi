package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZixishifenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZixishifenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZixishifenleiView;


/**
 * 自习室分类
 *
 * @author 
 * @email 
 * @date 2021-03-27 14:50:32
 */
public interface ZixishifenleiService extends IService<ZixishifenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZixishifenleiVO> selectListVO(Wrapper<ZixishifenleiEntity> wrapper);
   	
   	ZixishifenleiVO selectVO(@Param("ew") Wrapper<ZixishifenleiEntity> wrapper);
   	
   	List<ZixishifenleiView> selectListView(Wrapper<ZixishifenleiEntity> wrapper);
   	
   	ZixishifenleiView selectView(@Param("ew") Wrapper<ZixishifenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZixishifenleiEntity> wrapper);
   	
}

