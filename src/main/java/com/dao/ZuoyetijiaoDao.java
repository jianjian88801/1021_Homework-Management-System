package com.dao;

import com.entity.ZuoyetijiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZuoyetijiaoVO;
import com.entity.view.ZuoyetijiaoView;


/**
 * 作业提交
 * 
 * @author 
 * @email 
 * @date 2021-03-04 10:22:19
 */
public interface ZuoyetijiaoDao extends BaseMapper<ZuoyetijiaoEntity> {
	
	List<ZuoyetijiaoVO> selectListVO(@Param("ew") Wrapper<ZuoyetijiaoEntity> wrapper);
	
	ZuoyetijiaoVO selectVO(@Param("ew") Wrapper<ZuoyetijiaoEntity> wrapper);
	
	List<ZuoyetijiaoView> selectListView(@Param("ew") Wrapper<ZuoyetijiaoEntity> wrapper);

	List<ZuoyetijiaoView> selectListView(Pagination page,@Param("ew") Wrapper<ZuoyetijiaoEntity> wrapper);
	
	ZuoyetijiaoView selectView(@Param("ew") Wrapper<ZuoyetijiaoEntity> wrapper);
	
}
