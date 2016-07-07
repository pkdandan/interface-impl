package com.zj.rd.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.reward.service.IBannerService;
import org.springframework.stereotype.Service;

import com.alibaba.dubbo.rpc.RpcContext;
import com.zj.reward.pojo.BannerVO;

@Service("bannerService")
public class BannerServiceImpl implements IBannerService{

	public BannerVO getBannerById(int id) {
		System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + id + ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        System.out.println("response form provider: " + RpcContext.getContext().getLocalAddress());
		BannerVO vo =new BannerVO();
		vo.setId(id);
		vo.setName("Robert");
		vo.setType("reward");
		vo.setDescription("this is a instant reward,you can redeem it anytime at our merchant.");
		vo.setCreateDate(new Date());
		return vo;
	}

	
}
