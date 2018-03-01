package com.lzkj.lxzb.core.util;

import com.alibaba.fastjson.JSON;
import com.lzkj.lxzb.core.exception.LZKJException;
import com.lzkj.lxzb.core.exception.LZKJExceptionEnum;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 渲染工具类
 *
 * @author jiangzh
 * @date 2018年01月24日
 */
public class RenderUtil {

    /**
     * 渲染json对象
     */
    public static void renderJson(HttpServletResponse response, Object jsonObject) {
        try {
            response.setContentType("application/json");
            response.setCharacterEncoding("UTF-8");
            PrintWriter writer = response.getWriter();
            writer.write(JSON.toJSONString(jsonObject));
        } catch (IOException e) {
            throw new LZKJException(LZKJExceptionEnum.WRITE_ERROR);
        }
    }
}
