package org.design.pattern.chapter18;

public class NormalVoteState2 extends NormalVoteState {
	
	@Override
	public void vote(String user, String voteItem, VoteManager voteManager) {
		//先调用已有的功能
		super.vote(user, voteItem, voteManager);
		//给予积分奖励，示意一下
		System.out.println("奖励积分10分");
	}

}
