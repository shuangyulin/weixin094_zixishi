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


import com.dao.XueyuanfenleiDao;
import com.entity.XueyuanfenleiEntity;
import com.service.XueyuanfenleiService;
import com.entity.vo.XueyuanfenleiVO;
import com.entity.view.XueyuanfenleiView;

@Service("xueyuanfenleiService")
public class XueyuanfenleiServiceImpl extends ServiceImpl<XueyuanfenleiDao, XueyuanfenleiEntity> implements XueyuanfenleiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XueyuanfenleiEntity> page = this.selectPage(
                new Query<XueyuanfenleiEntity>(params).getPage(),
                new EntityWrapper<XueyuanfenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XueyuanfenleiEntity> wrapper) {
		  Page<XueyuanfenleiView> page =new Query<XueyuanfenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XueyuanfenleiVO> selectListVO(Wrapper<XueyuanfenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XueyuanfenleiVO selectVO(Wrapper<XueyuanfenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XueyuanfenleiView> selectListView(Wrapper<XueyuanfenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XueyuanfenleiView selectView(Wrapper<XueyuanfenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
