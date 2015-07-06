package org.design.pattern.chapter13;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * 读写文件的辅助工具类
 * 
 * @author YAO
 * 
 */
public class FileOpeUtil {
	/**
	 * 私有化构造方法，避免外部无谓的创建实例 这个工具类不需要创建类实例
	 */
	private FileOpeUtil() {

	}

	/**
	 * 读文件，从文件中获取存储的List对象
	 * 
	 * @param pathName
	 *            文件路径和文件名
	 * @return
	 */
	public static List readFile(String pathName) {
		List list = new ArrayList();
		ObjectInputStream oin = null;
		try {
			File f = new File(pathName);
			if (f.exists()) {
				oin = new ObjectInputStream(new BufferedInputStream(
						new FileInputStream(f)));
				list = (List) oin.readObject();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (oin != null) {
					oin.close();
				}
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}

		return list;
	}

	public static void writeFile(String pathName, List list) {
		File f = new File(pathName);
		ObjectOutputStream oout = null;
		try {
			oout = new ObjectOutputStream(new BufferedOutputStream(
					new FileOutputStream(f)));

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (oout != null) {
					oout.close();
				}
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}

}
