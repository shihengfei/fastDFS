package com.baobao.test;
/*
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.baobao.utils.FastDFSClient;
import com.baobao.utils.JsonUtils;*/

/**
 * 图片上传控制器
 * <p>Company: www.qinmei.com</p> 
 * @author 史恒飞 ，tel ： 18516417728
 * @version 1.0 ， 2018年2月1日下午3:02:57
 */
/*@Controller
public class FileUploadController {

	*//** 加载配置文件 *//*
	@Value("${IMG_SERVER_URL}")
	private String IMG_SERVER_URL;
	
	*//**
	 * KindEditor 图片上传插件对 json 支持好，设置为Content-Type:text/plan;charset=UTF-8 返回格式
	 * <p>Title: fileUpload</p>
	 * <p>Description: </p>
	 * @param uploadFile
	 * @return
	 *//*
	@RequestMapping(value="/pic/upload",produces=MediaType.TEXT_PLAIN_VALUE+";charset=utf-8")
	@ResponseBody
	public String  fileUpload(MultipartFile uploadFile){
		try {
			//1、取文件的扩展名
			String originalFilename = uploadFile.getOriginalFilename();
			String extName = originalFilename.substring(originalFilename.lastIndexOf(".") + 1);
			//2、创建一个FastDFS的客户端
			FastDFSClient fastDFSClient = new FastDFSClient("classpath:conf/fdfs_client.conf");
			//3、执行上传处理
			String path = fastDFSClient.uploadFile(uploadFile.getBytes(), extName);
			//4、拼接返回的url和ip地址，拼装成完整的url
			String url = IMG_SERVER_URL + path;
			//5、返回map
			Map result = new HashMap<>();
			result.put("error", 0);
			result.put("url", url);
			String json = JsonUtils.objectToJson(result);
			return json;
		} catch (Exception e) {
			e.printStackTrace();
			//5、返回map
			Map result = new HashMap<>();
			result.put("error", 1);
			result.put("message", "图片上传失败");
			String json = JsonUtils.objectToJson(result);
			return json;
		}
	}
		
}*/
