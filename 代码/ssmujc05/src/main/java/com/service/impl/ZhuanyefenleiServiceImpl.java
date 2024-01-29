package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ZhuanyefenleiDao;
import com.entity.ZhuanyefenleiEntity;
import com.service.ZhuanyefenleiService;
import com.entity.vo.ZhuanyefenleiVO;
import com.entity.view.ZhuanyefenleiView;

@Service("zhuanyefenleiService")
public class ZhuanyefenleiServiceImpl extends ServiceImpl<ZhuanyefenleiDao, ZhuanyefenleiEntity> implements ZhuanyefenleiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhuanyefenleiEntity> page = this.selectPage(
                new Query<ZhuanyefenleiEntity>(params).getPage(),
                new EntityWrapper<ZhuanyefenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhuanyefenleiEntity> wrapper) {
		  Page<ZhuanyefenleiView> page =new Query<ZhuanyefenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhuanyefenleiVO> selectListVO(Wrapper<ZhuanyefenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhuanyefenleiVO selectVO(Wrapper<ZhuanyefenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhuanyefenleiView> selectListView(Wrapper<ZhuanyefenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhuanyefenleiView selectView(Wrapper<ZhuanyefenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
