package com.seungchan.newbie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seungchan.newbie.mapper.HelloMapper;
import com.seungchan.newbie.model.Player;

@Service
public class HelloService {

	@Autowired
	private HelloMapper helloMapper;
	
	public List<Player> getHelloDaoAll() {
		return helloMapper.getPlayerList();
	}
}
