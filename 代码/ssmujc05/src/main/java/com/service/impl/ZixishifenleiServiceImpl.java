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


import com.dao.ZixishifenleiDao;
import com.entity.ZixishifenleiEntity;
import com.service.ZixishifenleiService;
import com.entity.vo.ZixishifenleiVO;
import com.entity.view.ZixishifenleiView;

@Service("zixishifenleiService")
public class ZixishifenleiServiceImpl extends ServiceImpl<ZixishifenleiDao, ZixishifenleiEntity> implements ZixishifenleiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZixishifenleiEntity> page = this.selectPage(
                new Query<ZixishifenleiEntity>(params).getPage(),
                new EntityWrapper<ZixishifenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZixishifenleiEntity> wrapper) {
		  Page<ZixishifenleiView> page =new Query<ZixishifenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZixishifenleiVO> selectListVO(Wrapper<ZixishifenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZixishifenleiVO selectVO(Wrapper<ZixishifenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZixishifenleiView> selectListView(Wrapper<ZixishifenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZixishifenleiView selectView(Wrapper<ZixishifenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
