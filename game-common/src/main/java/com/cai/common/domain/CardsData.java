package com.cai.common.domain;

import com.cai.common.constant.GameConstants;
/**
 * 杆完之后 发的牌
 */
public class CardsData {

	private int _cards[];
	
	private int _card_count;
	
	
	public CardsData(int maxCount){
		_cards = new int[maxCount];
		
		_card_count = 0;
	}
	
	
	public void add_card(int card){
		_cards[_card_count] = card;
		
		_card_count++;
	}
	
	public void clean_cards(){
		_card_count=0;
	}
	
	public int get_card(int index){
		if(index>=_card_count){
			
			return GameConstants.INVALID_VALUE;
		}
		
		return _cards[index];
	}


	public int[] get_cards() {
		return _cards;
	}


	public void set_cards(int[] _cards) {
		this._cards = _cards;
	}


	public int get_card_count() {
		return _card_count;
	}


	public void set_card_count(int _card_count) {
		this._card_count = _card_count;
	}
	
	
}
