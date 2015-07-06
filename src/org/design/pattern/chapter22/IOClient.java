package org.design.pattern.chapter22;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class IOClient {

	public static void main(String[] args) throws Exception {
		// 流式输出文件
		DataOutputStream dout = new DataOutputStream(new BufferedOutputStream(
				new EncryptOutputStream(new FileOutputStream("MyEncrypt.txt"))));
		
		//然后就可以输出内容了
		dout.write("abcdxyz".getBytes());
		dout.close();
	}

}
