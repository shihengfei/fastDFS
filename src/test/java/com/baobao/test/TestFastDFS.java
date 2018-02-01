package com.baobao.test;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.csource.common.MyException;
import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.StorageClient;
import org.csource.fastdfs.StorageServer;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;
import org.junit.Test;

/**
 * 测试图片服务器
 * <p>Company: www.qinmei.com</p> 
 * @author 史恒飞 ，tel ： 18516417728
 * @version 1.0 ， 2018年2月1日下午1:37:06
 */
public class TestFastDFS {

	@Test
	public void testUpload() throws FileNotFoundException, IOException, MyException{
		// 加载配置文件
		ClientGlobal.init("D:/用户目录/我的资料/01.参考资料/FastDFS/bin/fastdfs_client/src/main/resources/fdfs_client.conf");
		// new TrackerClient 对象
		TrackerClient client = new TrackerClient();
		// 使用TrackerClient对象创建连接，获得一个TrackerServer对象
		TrackerServer trackerServer = client.getConnection();
		// 创建一个StorageServer的引用，值为null
		StorageServer storageServer = null;
		// 创建一个StorageClient对象，需要两个参数TrackerServer对象、StorageServer的引用
		StorageClient StorageClient = new StorageClient(trackerServer,storageServer);
		// 使用对象上传文件   扩展名不带“.”
		String[] strings = StorageClient.upload_file("D:/timg.jpg","jpg",null);
		// 返回结果包含图片路径信息
		for (String string : strings) {
			// 通过 ip 地址+组名+图片路径访问图片   http://192.168.25.133/group1/M00/00/00/wKgZhVpyrW6AP8TIAAAryD_Em7A887.jpg
			System.out.println(string);
		}
	}
	
	@Test
	public void testUtil() throws Exception{
		FastDFSClient fastDFSClient = new FastDFSClient("D:/用户目录/我的资料/01.参考资料/FastDFS/bin/fastdfs_client/src/main/resources/fdfs_client.conf");
		String file = fastDFSClient.uploadFile("D:/ti.jpg");
		System.out.println(file);
	}
	
}
