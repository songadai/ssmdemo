/**
 * 版权所有 (C) 2019-2029 长沙新时科技发展有限公司。保留所有权利。
 * 版本：
 * 修改记录：
 * 1、2019年06月04天，劉松创建。
 */
package mtt.ls.controller;

import mtt.ls.model.Dept;
import mtt.ls.service.IDeptService;
import mtt.ls.util.ReturnUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/dept")
public class DeptControlller
{
    @Autowired
    private IDeptService deptService;
    @RequestMapping("/query")
    @ResponseBody
    public Object selectDeptById(){
       return ReturnUtil.getResponse(ReturnUtil.SUCCESE,"返回成功",deptService.selectDeptById(1));
    }
    @ResponseBody
    @RequestMapping(value="/test",method = RequestMethod.GET)
    public Object test(){
        Dept dept = new Dept();
        dept.setDeptId(2);
        dept.setDeptLeader("liusong");
        dept.setDeptName("市场部");

        return ReturnUtil.getResponse(ReturnUtil.SUCCESE,"返回成功",dept);
    }

}
