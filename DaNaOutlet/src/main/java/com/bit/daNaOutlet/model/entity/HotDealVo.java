package com.bit.daNaOutlet.model.entity;

public class HotDealVo {
	private int price;
	private int hotDealNum;
	private String link;
	private String productName;
	private String productIntro;
	
	public HotDealVo() {
		// TODO Auto-generated constructor stub
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getHotDealNum() {
		return hotDealNum;
	}

	public void setHotDealNum(int hotDealNum) {
		this.hotDealNum = hotDealNum;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductIntro() {
		return productIntro;
	}

	public void setProductIntro(String productIntro) {
		this.productIntro = productIntro;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hotDealNum;
		result = prime * result + ((link == null) ? 0 : link.hashCode());
		result = prime * result + price;
		result = prime * result + ((productIntro == null) ? 0 : productIntro.hashCode());
		result = prime * result + ((productName == null) ? 0 : productName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HotDealVo other = (HotDealVo) obj;
		if (hotDealNum != other.hotDealNum)
			return false;
		if (link == null) {
			if (other.link != null)
				return false;
		} else if (!link.equals(other.link))
			return false;
		if (price != other.price)
			return false;
		if (productIntro == null) {
			if (other.productIntro != null)
				return false;
		} else if (!productIntro.equals(other.productIntro))
			return false;
		if (productName == null) {
			if (other.productName != null)
				return false;
		} else if (!productName.equals(other.productName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "HotDealVo [price=" + price + ", hotDealNum=" + hotDealNum + ", link=" + link + ", productName="
				+ productName + ", productIntro=" + productIntro + "]";
	}

	public HotDealVo(int price, int hotDealNum, String link, String productName, String productIntro) {
		super();
		this.price = price;
		this.hotDealNum = hotDealNum;
		this.link = link;
		this.productName = productName;
		this.productIntro = productIntro;
	}
	
	
}
