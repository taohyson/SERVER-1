/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.domain.json;

/**
 * 
 * 对应baidu lbs Json
 * 
 * @author wu_hc date: 2017年8月2日 下午2:44:02 <br/>
 */
public class BaiduLBSJsonModel {

	private String address;
	private Content content;
	private int status;
	private String message;

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the content
	 */
	public Content getContent() {
		return content;
	}

	/**
	 * @param content
	 *            the content to set
	 */
	public void setContent(Content content) {
		this.content = content;
	}

	/**
	 * @return the status
	 */
	public int getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(int status) {
		this.status = status;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message
	 *            the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	public static class Content {
		private String address;
		private AddressDetail address_detail;
		private Point point;

		/**
		 * @return the address
		 */
		public String getAddress() {
			return address;
		}

		/**
		 * @param address
		 *            the address to set
		 */
		public void setAddress(String address) {
			this.address = address;
		}

		/**
		 * @return the address_detail
		 */
		public AddressDetail getAddress_detail() {
			return address_detail;
		}

		/**
		 * @param address_detail
		 *            the address_detail to set
		 */
		public void setAddress_detail(AddressDetail address_detail) {
			this.address_detail = address_detail;
		}

		/**
		 * @return the point
		 */
		public Point getPoint() {
			return point;
		}

		/**
		 * @param point
		 *            the point to set
		 */
		public void setPoint(Point point) {
			this.point = point;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "Content [address=" + address + ", address_detail=" + address_detail + ", point=" + point + "]";
		}

	}

	public static class AddressDetail {
		private String city;
		private int city_code;
		private String district;
		private String province;
		private String street;
		private String street_number;

		/**
		 * @return the city
		 */
		public String getCity() {
			return city;
		}

		/**
		 * @param city
		 *            the city to set
		 */
		public void setCity(String city) {
			this.city = city;
		}

		/**
		 * @return the city_code
		 */
		public int getCity_code() {
			return city_code;
		}

		/**
		 * @param city_code
		 *            the city_code to set
		 */
		public void setCity_code(int city_code) {
			this.city_code = city_code;
		}

		/**
		 * @return the district
		 */
		public String getDistrict() {
			return district;
		}

		/**
		 * @param district
		 *            the district to set
		 */
		public void setDistrict(String district) {
			this.district = district;
		}

		/**
		 * @return the province
		 */
		public String getProvince() {
			return province;
		}

		/**
		 * @param province
		 *            the province to set
		 */
		public void setProvince(String province) {
			this.province = province;
		}

		/**
		 * @return the street
		 */
		public String getStreet() {
			return street;
		}

		/**
		 * @param street
		 *            the street to set
		 */
		public void setStreet(String street) {
			this.street = street;
		}

		/**
		 * @return the street_number
		 */
		public String getStreet_number() {
			return street_number;
		}

		/**
		 * @param street_number
		 *            the street_number to set
		 */
		public void setStreet_number(String street_number) {
			this.street_number = street_number;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "AddressDetail [city=" + city + ", city_code=" + city_code + ", district=" + district + ", province=" + province + ", street="
					+ street + ", street_number=" + street_number + "]";
		}

	}

	public static class Point {
		private double x;
		private double y;

		/**
		 * @return the x
		 */
		public double getX() {
			return x;
		}

		/**
		 * @param x
		 *            the x to set
		 */
		public void setX(double x) {
			this.x = x;
		}

		/**
		 * @return the y
		 */
		public double getY() {
			return y;
		}

		/**
		 * @param y
		 *            the y to set
		 */
		public void setY(double y) {
			this.y = y;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "Point [x=" + x + ", y=" + y + "]";
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BaiduLBSJsonModel [address=" + address + ", content=" + content + ", status=" + status + ", message=" + message + "]";
	}

}
