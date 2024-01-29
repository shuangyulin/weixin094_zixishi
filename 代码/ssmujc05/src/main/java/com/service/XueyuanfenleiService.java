package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XueyuanfenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XueyuanfenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XueyuanfenleiView;


/**
 * 学院分类
 *
 * @author 
 * @email 
 * @date 2021-03-27 14:50:32
 */
public interface XueyuanfenleiService extends IService<XueyuanfenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XueyuanfenleiVO> selectListVO(Wrapper<XueyuanfenleiEntity> wrapper);
   	
   	XueyuanfenleiVO selectVO(@Param("ew") Wrapper<XueyuanfenleiEntity> wrapper);
   	
   	List<XueyuanfenleiView> selectListView(Wrapper<XueyuanfenleiEntity> wrapper);
   	
   	XueyuanfenleiView selectView(@Param("ew") Wrapper<XueyuanfenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XueyuanfenleiEntity> wrapper);
   	
}

