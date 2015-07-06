package org.design.pattern.chapter16;

/**
 * 登录控制的模板
 * @author YAO
 *
 */
public class LoginTemplate {
	/**
	 * 判断登录数据是否正确，也就是是否能登录成功
	 * @param lm
	 * @return
	 */
	public final boolean login(LoginModel lm, LoginCallback callback) {
		//1.根据登录人员的编号区获取相应的数据
		LoginModel dbLm = callback.findLoginUser(lm.getLoginId());
		if (dbLm != null) {
			//2.对密码进行加密
			String encryptPwd = callback.encryptPwd(lm.getPwd(), this);
			//把加密后的密码设置回到登录数据模型中
			lm.setPwd(encryptPwd);
			//3.判断是否匹配
			return callback.match(lm, dbLm, this);
		}
		return false;
	}

	/**
	 * 根据登录编号来查找和获取存储中相应的数据
	 * @param loginId
	 * @return
	 */
	
	public String encryptPwd(String pwd) {
		return pwd;
	}
	
	public boolean match(LoginModel lm, LoginModel dbLm) {
		if (lm.getLoginId().equals(dbLm.getLoginId())
				&& lm.getPwd().equals(dbLm.getPwd())) {
			return true;
		}
		return false;
	}

}
