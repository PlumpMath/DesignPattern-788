package org.design.pattern.chapter18;

public class AuditOverState implements LeaveRequestState {

	@Override
	public void doWork(StateMachine request) {
		// 先把业务对象造型出来
		LeaveRequestModel lrm = (LeaveRequestModel) request.getBusinessVO();

		System.out.println(lrm.getUser() + ",你的请假申请已经审核结束，结果是:" + lrm.getResult());

	}

}
