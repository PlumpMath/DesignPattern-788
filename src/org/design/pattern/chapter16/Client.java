package org.design.pattern.chapter16;

public class Client {
	public static void main(String[] args) {
		// 准备登录人的信息
		LoginModel lm = new LoginModel();
		lm.setLoginId("admin");
		lm.setPwd("workerpwd");

		// LoginTemplate lt2 = new NormalLogin();
		//
		// //进行登录测试
		// boolean flag = lt.login(lm);
		// System.out.println("可以登录工作平台 = " + flag);
		//
		// boolean flag2 = lt2.login(lm);
		// System.out.println("可以进行普通人员登录 = " + flag2);

		
		 //准备用来进行判断的对象
		LoginTemplate lt = new LoginTemplate();
		
		//进行登录测试，先测试普通人员登录
		boolean flag = lt.login(lm, new LoginCallback() {
			
			@Override
			public boolean match(LoginModel lm, LoginModel dbLm, LoginTemplate template) {
				// 自己不需要实现这个功能，直接转调模板中的默认实现
				return template.match(lm, dbLm);
			}
			
			@Override
			public LoginModel findLoginUser(String loginId) {
				//这里省略具体的处理，仅作示意，返回一个有默认数据的对象
				LoginModel lm = new LoginModel();
				lm.setLoginId(loginId);
				lm.setPwd("testpwd");
				return lm;
			}
			
			@Override
			public String encryptPwd(String pwd, LoginTemplate template) {
				// 自己不需要实现这个功能，直接转调模板中的默认实现
				return template.encryptPwd(pwd);
			}
		});
		
		System.out.println("可以进行普通人员登录=" + flag);
		
		boolean flag2 = lt.login(lm, new LoginCallback() {
			
			@Override
			public boolean match(LoginModel lm, LoginModel dbLm, LoginTemplate template) {
				// 自己不需要实现这个功能，直接转调模板中的默认实现
				return template.match(lm, dbLm);
			}
			
			@Override
			public LoginModel findLoginUser(String loginId) {
				//这里省略具体的处理，仅作示意，返回一个有默认数据的对象
				LoginModel lm = new LoginModel();
				lm.setLoginId(loginId);
				lm.setPwd("workerpwd");
				return lm;
			}
			
			@Override
			public String encryptPwd(String pwd, LoginTemplate template) {
				System.out.println("使用MD5进行密码加密");
				return pwd;
			}
		});
		
		System.out.println("可以登录工作平台=" + flag2);

	}

}






















