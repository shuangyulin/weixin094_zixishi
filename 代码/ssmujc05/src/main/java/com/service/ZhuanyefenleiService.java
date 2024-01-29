package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhuanyefenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhuanyefenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhuanyefenleiView;


/**
 * 专业分类
 *
 * @author 
 * @email 
 * @date 2021-03-27 14:50:32
 */
public interface ZhuanyefenleiService extends IService<ZhuanyefenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhuanyefenleiVO> selectListVO(Wrapper<ZhuanyefenleiEntity> wrapper);
   	
   	ZhuanyefenleiVO selectVO(@Param("ew") Wrapper<ZhuanyefenleiEntity> wrapper);
   	
   	List<ZhuanyefenleiView> selectListView(Wrapper<ZhuanyefenleiEntity> wrapper);
   	
   	ZhuanyefenleiView selectView(@Param("ew") Wrapper<ZhuanyefenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhuanyefenleiEntity> wrapper);
   	
}

