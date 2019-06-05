/**
 * 版权所有 (C) 2019-2029 长沙新时科技发展有限公司。保留所有权利。
 * 版本：
 * 修改记录：
 * 1、2019年06月04天，劉松创建。
 */
package mtt.ls.model;

public class Dept
{
    private Integer deptId;
    private String deptName;
    private String deptLeader;

    @Override
    public String toString()
    {
        return "Dept{" +
                "deptId=" + deptId +
                ", deptName='" + deptName + '\'' +
                ", deptLeader='" + deptLeader + '\'' +
                '}';
    }

    public Integer getDeptId()
    {
        return deptId;
    }

    public void setDeptId(Integer deptId)
    {
        this.deptId = deptId;
    }

    public String getDeptName()
    {
        return deptName;
    }

    public void setDeptName(String deptName)
    {
        this.deptName = deptName;
    }

    public String getDeptLeader()
    {
        return deptLeader;
    }

    public void setDeptLeader(String deptLeader)
    {
        this.deptLeader = deptLeader;
    }
}
