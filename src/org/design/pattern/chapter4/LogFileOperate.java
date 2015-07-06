package org.design.pattern.chapter4;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

/**
 * 实现对日志文件的操作
 * 
 * @author YAO
 * 
 */
public class LogFileOperate implements LogFileOperateApi {
	/**
	 * 日志文件的路径和文件名称，默认是当前项目根下的AdapterLog.log
	 */
	private String logFilePathName = "AdapterLog.log";

	public LogFileOperate(String logFilePathName) {
		// 先判断是否传入了文件的路径和名称，如果是，
		// 就重新设置操作的日志文件的路径和名称
		if (logFilePathName != null && logFilePathName.trim().length() > 0) {
			this.logFilePathName = logFilePathName;
		}
	}

	@Override
	public List<LogModel> readLogFile() {
		List<LogModel> list = null;
		ObjectInputStream oin = null;
		try {
			File f = new File(logFilePathName);
			if (f.exists()) {
				oin = new ObjectInputStream(new BufferedInputStream(
						new FileInputStream(f)));
				list = (List<LogModel>) oin.readObject();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (oin != null) {
					oin.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return list;
	}

	@Override
	public void writeLogFile(List<LogModel> list) {
		File f = new File(logFilePathName);
		ObjectOutputStream oout = null;
		try {
			oout = new ObjectOutputStream(new BufferedOutputStream(
					new FileOutputStream(f)));
			oout.writeObject(list);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				oout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
