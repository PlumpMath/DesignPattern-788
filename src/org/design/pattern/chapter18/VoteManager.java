package org.design.pattern.chapter18;

import java.util.HashMap;
import java.util.Map;

/**
 * 投票管理
 * @author YAO
 *
 */
public class VoteManager {
	/**
	 * 持有状态处理对象
	 */
	private VoteState state = null;
	/**
	 * 记录当前每个用户对应的状态处理对象，每个用户当前的状态时不同的
	 */
	private Map<String, VoteState> mapState = new HashMap<>();
	/**
	 * 记录用户投票的结果，Map<String, String>对应Map<用户名称, 投票的选项>
	 */
	private Map<String, String> mapVote = new HashMap<>();
	/**
	 * 记录用户投票次数，Map<String, Integer>对应Map<用户名称, 投票的次数>
	 */
	private Map<String, Integer> mapVoteCount = new HashMap<>();
	
	/**
	 * 获得记录用户投票结果的Map
	 * @return
	 */
	public Map<String, String> getMapVote() {
		return mapVote;
	}
	
	/**
	 * 获取记录每个用户对应的状态处理对象的Map
	 * @return
	 */
	public Map<String, VoteState> getMapState() {
		return mapState;
	}
	
	/**
	 * 获取记录每个用户对应的投票次数的Map
	 * @return
	 */
	public Map<String, Integer> getMapVoteCount() {
		return mapVoteCount;
	}
	
	/**
	 * 投票
	 * @param user
	 * @param voteItem
	 */
	public void vote(String user, String voteItem) {
		//1.先为该用户增加投票的次数
		//从记录中取出已有的投票次数
		Integer oldVoteCount = mapVoteCount.get(user);
		if (oldVoteCount == null) {
			oldVoteCount = 0;
		}
		
		oldVoteCount = oldVoteCount + 1;
		mapVoteCount.put(user, oldVoteCount);
		
		//2.获取该用户的投票状态
		VoteState state = mapState.get(user);
		//如果没有投票状态，说明还没有投过票，就初始化一个正常投票状态
		if (state == null) {
			state = new NormalVoteState();
		}
		
		//然后转掉状态对象来进行相应的操作
		state.vote(user, voteItem, this);
	}
}























