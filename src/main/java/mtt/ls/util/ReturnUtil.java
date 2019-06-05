/**
 * 版权所有 (C) 2019-2029 长沙新时科技发展有限公司。保留所有权利。
 * 版本：
 * 修改记录：
 * 1、2019年06月04天，劉松创建。
 */
package mtt.ls.util;

import java.util.HashMap;

public class ReturnUtil
{
    //请求成功
    public static final int SUCCESE = 0;

    //请求失败
    public static final int ERROR = 1001;


    public static ResponseData getResponse(int state,String msg,Object data){
        return new ResponseData(state,msg,data);
    }
    public static ResponseData getResponse(int state,String msg){
        return new ResponseData(state,msg,new HashMap<String,Object>());
    }
}
