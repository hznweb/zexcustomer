/*
package com.zexcustomer.sprinboot.web.action.plugins.ueditor;

import com.baidu.ueditor.ActionEnter;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Api(tags = "百度编辑器ueditor服务端")
@Controller
@RequestMapping(value = "/api/backstage")
public class UEditorController {
    @Value("${myFile.uploadFolder}")
    private String uploadFolder;  //上传路径（物理路径）

    */
/**
     * @param action
     * @param upfile
     * @param request
     * @param response
     *//*

    @ApiOperation(value = "ueditor默认访问接口",notes = "未更改名字")
    @RequestMapping(value = "/ueditor")
    public void config(@RequestParam("action") String action, MultipartFile upfile, HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("application/json");
        String rootPath = uploadFolder;
        try {
            String exec = new ActionEnter(request, rootPath).exec();
            if (action != null) {
                String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath();//获取项目根目录网址
                basePath = basePath + "upload";//访问上传文件路径，专门替换config.json中图片前缀网址的步骤
                if (action.startsWith("list")) {
                    String root = new String(rootPath);
                    //如果请求的方法是listfile和listimage，就把文件路径替换一下，绝对路径替换成相对路径，否则返回的图片和文件地址是错误的，将无法访问。
                    root = root.substring(0, root.length() - 1);//c:/ebuy_springboot/upload/，最后的“/”不要
                    exec = exec.replaceAll(root, "");
                    exec=exec.replaceAll("\"url\":\"","\"url\":\""+basePath);//专门替换config.json中图片前缀网址的步骤;//专门替换config.json中图片前缀网址的步骤

                }else {
                    exec=exec.replaceAll("\":\"","\"url\":\""+basePath);//专门替换config.json中图片前缀网址的步骤

                }
            }
            PrintWriter write=response.getWriter();
            write.write(exec);
            write.flush();
            write.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
*/
