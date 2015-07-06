package org.design.pattern.chapter8;

import java.util.Collection;
import java.util.Map;

/**
 * 生成器接口，定义创建一个输出文件对象所需的各个部件的操作
 * 
 * @author YAO
 * 
 */
public interface Builder {
	/**
	 * 构建输出文件的Header部分
	 * 
	 * @param ehm
	 */
	public void buildHeader(ExportHeaderModel ehm);

	/**
	 * 构建输出文件的Body部分
	 * 
	 * @param ehm
	 */
	public void buildBody(Map<String, Collection<ExportDataModel>> mapData);

	/**
	 * 构建输出文件的Footer部分
	 * 
	 * @param ehm
	 */
	public void buildFooter(ExportFooterModel efm);
}
