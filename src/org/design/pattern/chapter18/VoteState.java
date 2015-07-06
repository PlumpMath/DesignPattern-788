package org.design.pattern.chapter18;

/**
 * 封装一个投票状态相关的行为
 * @author YAO
 *
 */
public interface VoteState {

	/**
	 * 处理状态对应的行为
	 * @param user
	 * @param voteItem
	 * @param voteManager
	 */
	public void vote(String user, String voteItem, VoteManager voteManager);
}
