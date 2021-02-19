package com.mmc.core.dao.mapper;

import com.mmc.core.dao.po.TestTablePO;
import com.mmc.core.dao.po.TestTablePOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestTablePOMapper {


    int countByExample(TestTablePOExample example);

    int deleteByExample(TestTablePOExample example);

    int deleteByPrimaryKey(Integer runoobId);

    int insert(TestTablePO record);

    int insertSelective(TestTablePO record);

    List<TestTablePO> selectByExample(TestTablePOExample example);

    TestTablePO selectByPrimaryKey(Integer runoobId);

    int updateByExampleSelective(@Param("record") TestTablePO record, @Param("example") TestTablePOExample example);

    int updateByExample(@Param("record") TestTablePO record, @Param("example") TestTablePOExample example);

    int updateByPrimaryKeySelective(TestTablePO record);

    int updateByPrimaryKey(TestTablePO record);
}