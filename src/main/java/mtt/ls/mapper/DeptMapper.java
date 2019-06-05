/**
 * 版权所有 (C) 2019-2029 长沙新时科技发展有限公司。保留所有权利。
 * 版本：
 * 修改记录：
 * 1、2019年06月04天，劉松创建。
 */
package mtt.ls.mapper;

import mtt.ls.model.Dept;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

public interface DeptMapper
{
    Dept selectDeptById(Integer id);
    @Delete("delete from tbl_dept where dept_id=#{id}")
    int deleteDeptById(Integer id);
    @Insert("insert into tbl_dept()")
    int insertDept(@Param("dept")Dept dept);
}
