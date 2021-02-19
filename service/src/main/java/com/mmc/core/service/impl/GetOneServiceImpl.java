package com.mmc.core.service.impl;

import com.alibaba.druid.pool.DruidDataSource;
import com.mmc.core.dao.mapper.TestTablePOMapper;
import com.mmc.core.dao.po.TestTablePO;
import com.mmc.core.dao.po.TestTablePOExample;
import com.mmc.core.service.GetOneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * TODO
 *
 * @author zhiqiang_zhao
 * @date 2021/2/18 10:47
 */
@Service
public class GetOneServiceImpl implements GetOneService {
    @Autowired
    private DataSource dataSource;
    @Autowired
    private TestTablePOMapper mapper;
    @Override
    public Integer getOne (String name){
        TestTablePOExample example = new TestTablePOExample();
        TestTablePOExample.Criteria criteria = example.createCriteria();
        criteria.andRunoobIdEqualTo(1);
        List<TestTablePO> testTablePOS = mapper.selectByExample(example);
        testTablePOS.forEach(o->{
            System.out.println("mybatis--------------------"+o.getRunoobAuthor());
        });
        return 1;
    }
}
