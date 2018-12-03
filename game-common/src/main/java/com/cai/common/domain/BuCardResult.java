package com.cai.common.domain;

import java.util.Arrays;

/***
 * 补牌结果
 */
public class BuCardResult {
	public int cbCardCount;//手上能补的牌的数量
	public int cbCardData[][];
	public int type[];//补的类型
	public int card[];//手上能补的牌
	public BuCardResult(){
		cbCardData =  new int[5][16];
		type = new int[14];
		card = new int[14];
	}
	
	public BuCardResult(int count){
		cbCardData =  new int[5][16];
		type = new int[14];
		card = new int[14]; 
	}
	public void ResetData(){
		cbCardCount = 0;
		for(int i = 0;i < 14;i++){
			type[i] = 0;
			card[i] = 0;
		}
		for(int i = 0;i < 5;i++){
			for(int j = 0;j < 16;j++){
				cbCardData[i][j] = 0;
			}
		}

	}
}
