package com.seungchan.newbie.model;

public class Player {

	private Integer serverId;
	private Long playerId;
	private String name;
	public Integer getServerId() {
		return serverId;
	}
	public void setServerId(Integer serverId) {
		this.serverId = serverId;
	}
	public Long getPlayerId() {
		return playerId;
	}
	public void setPlayerId(Long playerId) {
		this.playerId = playerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "HelloDao [serverId=" + serverId + ", playerId=" + playerId + ", name=" + name + "]";
	}
}
