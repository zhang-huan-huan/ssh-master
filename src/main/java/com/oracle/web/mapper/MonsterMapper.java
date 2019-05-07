package com.oracle.web.mapper;

import com.oracle.web.bean.Monster;
import com.oracle.web.bean.SubMonster;
import com.oracle.web.bean.pageBean;

import java.util.List;

public interface MonsterMapper {
	
    int deleteByPrimaryKey(Integer monsterId);

    int insert(Monster record);

    Monster selectByPrimaryKey(Integer monsterId);

    List<SubMonster> selectAll();

    int updateByPrimaryKey(Monster record);
    
    List<SubMonster> selectAllWithOneSQL();

	int selectCounts();

	//List<SubMonster> findByPage(int index);

	List<SubMonster> selectAllByPageHelper();
    
}