/**
 * 版权所有 (C) 2019-2029 长沙新时科技发展有限公司。保留所有权利。
 * 版本：
 * 修改记录：
 * 1、2019年06月04天，劉松创建。
 */
package mtt.ls.service;

import mtt.ls.mapper.DeptMapper;
import mtt.ls.model.Dept;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class DeptService implements IDeptService
{
    @Resource
    private DeptMapper deptMapper;
    @Override
    public Dept selectDeptById(Integer id)
    {
        return deptMapper.selectDeptById(id);
    }

    @Override
    public int deleteDeptById(Integer id)
    {
        return deptMapper.deleteDeptById(id);
    }
}
