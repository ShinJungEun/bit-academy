package com.douzone.aoptest.service;

import org.springframework.stereotype.Service;

import com.douzone.aoptest.vo.ProductVo;

@Service
public class ProductService {
	public ProductVo find(String name) {
		
		System.out.println("[ProductService] finding...");

		// 예외 발생
//		if(1-1 == 0) {
//			throw new RuntimeException("Finding Exception");
//		}
		
		return new ProductVo(name);
		
	}
}
