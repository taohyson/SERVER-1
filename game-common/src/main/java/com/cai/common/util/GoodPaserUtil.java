package com.cai.common.util;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.cai.common.domain.ItemDTO;

public class GoodPaserUtil {

	/**
	 * 
	 * 将游戏内部统一的字符串解析成 通用物品奖励格式传输对象 2030301,4|2030401,4此格式的item转换成List<ItemDTO>
	 * 
	 * @param itemList
	 * @return
	 */
	public static List<ItemDTO> turnItemDTOs(String itemList) {
		if (StringUtils.isBlank(itemList)) {
			return new ArrayList<ItemDTO>(0);
		}
		if (!StringUtils.contains(itemList, ",")) {
			return new ArrayList<ItemDTO>(0);
		}
		String[] items = null;
		if (StringUtils.contains(itemList, "|")) {
			items = StringUtils.split(itemList, "|");
		} else if (StringUtils.contains(itemList, "#")) {
			items = StringUtils.split(itemList, "#");
		} else {
			items = StringUtils.split(itemList, "丨");
		}

		if (null == items || items.length == 0) {
			return new ArrayList<ItemDTO>(0);
		}
		List<ItemDTO> itemDTOs = new ArrayList<ItemDTO>(items.length);
		for (String item : items) {
			String[] ids = StringUtils.split(item, ",");
			if (ids.length < 2) {
				continue;
			}
			itemDTOs.add(new ItemDTO(Integer.parseInt(ids[0]), Integer.parseInt(ids[1])));
		}
		return itemDTOs;
	}

	/**
	 * 
	 * item List<ItemDTO>转换成2030301,4|2030401,4
	 * 
	 * @param itemList
	 * @return
	 */
	public static String turnItems(List<ItemDTO> itemList) {
		if (itemList == null || itemList.size() == 0) {
			return "";
		}
		StringBuffer sb = new StringBuffer();
		for (ItemDTO itemDTO : itemList) {
			sb.append(itemDTO.getId()).append(",").append(itemDTO.getNumber()).append("|");
		}
		if (sb.toString().endsWith("|")) {
			sb.deleteCharAt(sb.length() - 1);
		}
		return sb.toString();
	}

}
