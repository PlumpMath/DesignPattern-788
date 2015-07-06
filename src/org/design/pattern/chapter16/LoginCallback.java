package org.design.pattern.chapter16;

/**
 * 登陆控制的模板方法需要的回调接口，需要把所有需要的接口方法都定义出来
 * 或者说是所有可以被扩展的方法都需要被定义出来
 * @author YAO
 *
 */
public interface LoginCallback {
	/**
	 * 根据登录编号来查找和获取存储中相应的数据
	 * @param loginId
	 * @return
	 */
	public LoginModel findLoginUser(String loginId);
	
	/**
	 * 对密码数据进行加密
	 * @param pwd
	 * @param template
	 * @return
	 */
	public String encryptPwd(String pwd, LoginTemplate template);
	
	/**
	 * 判断用户填写的登录数据和存储中对应的数据是否匹配的上
	 * @param lm
	 * @param dbLm
	 * @param template
	 * @return
	 */
	public boolean match(LoginModel lm, LoginModel dbLm, LoginTemplate template);

}
