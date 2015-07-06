package org.design.pattern.chapter17;

public class LogClient {
	public static void main(String[] args) {
		LogContext log = new LogContext();
		log.log("记录日志");
		log.log("再次记录日志");
	}
}
