package com.cai.common.domain;


/***
 * 亮牌结果
 */
public class LiangCardResult {
	public int cbCardCount;//扑克数目
	public int cbCardData[][] ;//扑克数据
	public int isPublic[] ;//
	public int type[] ;//杆的类型
	public int index[];
	public int indexcount[];
	public LiangCardResult(){
		cbCardData =  new int[4][4];
		isPublic = new int[4];
		type = new int[4];
		index = new int[4];
		indexcount = new int[4];
	}
	
	public LiangCardResult(int count){
		cbCardData =  new int[count][4];
		isPublic = new int[count];
		type = new int[count];
		index = new int[count];
		indexcount = new int[count];
	}
	
	public void ResetData(){
		for(int i = 0; i < 4;i++){
			isPublic[i] = 0;
			type[i] = 0;
			index[i] = 0;
			indexcount[i] = 0;
			for(int j = 0; j < 4;j++){
				cbCardData[i][j] = 0;
			}
		}
	}
	
	public void ResetData(int count){
		for(int i = 0; i < count;i++){
			isPublic[i] = 0;
			type[i] = 0;
			index[i] = 0;
			indexcount[i] = 0;
			for(int j = 0; j < 4;j++){
				cbCardData[i][j] = 0;
			}
		}
	}
}
