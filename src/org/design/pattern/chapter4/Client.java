package org.design.pattern.chapter4;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		// //准备日志内容，也就是测试的数据
		// LogModel lml = new LogModel();
		// lml.setLogId("001");
		// lml.setOperatorUser("admin");
		// lml.setOperateTime("2010-03-02 10:08:18");
		// lml.setLogContent("这是一个测试");
		
		//
		// //创建操作日志文件的对象
		// LogFileOperateApi logFileApi = new LogFileOperate("");
		//
		// //创建新版操作日志的接口对象
		// LogDbOperateApi api = new Adapter(logFileApi);
		//
		// //保存日志文件
		// api.createLog(lml);
		// api.createLog(lml2);
		// //读取日志文件的内容
		// List<LogModel> allLog = api.getAllLog();
		// System.out.println("allLog = " + allLog);
		

		 LogModel lml = new LogModel();
		 lml.setLogId("001");
		 lml.setOperatorUser("admin");
		 lml.setOperateTime("2010-03-02 10:08:18");
		 lml.setLogContent("这是一个测试");
		 
		 List<LogModel> list = new ArrayList<>();
		 list.add(lml);
		 
		 //创建操作日志文件的对象
		 LogFileOperateApi fileLogApi = new LogFileOperate("");
		 LogDbOperateApi dbLogApi = new LogDbOperate();
		 
		 //创建经过双向适配后的操作日志的接口对象
		 LogFileOperateApi fileLogApi2 = new TwoDirectAdapter(fileLogApi, dbLogApi);
		 LogDbOperateApi dbLogApi2 = new TwoDirectAdapter(fileLogApi, dbLogApi);
		 
		 //先测试从文件操作适配到第二版
		 //虽然调用的第二版的接口，其实是文件操作在实现
		 dbLogApi2.createLog(lml);
		 List<LogModel> allLog = dbLogApi2.getAllLog();
		 System.out.println("allLog = " + allLog);
		 
		 //再测试从数据库存储适配成第一版接口
		 //也就算调用第一版的接口，其实是数据实现
		 fileLogApi2.writeLogFile(list);
		 fileLogApi2.readLogFile();
		
	}
}























