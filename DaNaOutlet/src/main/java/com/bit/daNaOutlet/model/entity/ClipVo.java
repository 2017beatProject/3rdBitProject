package com.bit.daNaOutlet.model.entity;
import java.util.Date;
import java.util.List;
public class ClipVo {
	int danaClipLog;//클립 로그
	int clipSort;//클립 종류
	String clipName;//클립 이름
	String clipInfo;//클립 설명
	Date writeNalja;//클립 작성일
	String productUrl1;
	String productUrl2;
	String productUrl3;
	String productUrl4;
	String productUrl5;
	String productUrl6;
	String productUrl7;
	String productUrl8;
	
	
	public ClipVo() {
		// TODO Auto-generated constructor stub
	}


	public ClipVo(int danaClipLog, int clipSort, String clipName, String clipInfo, Date writeNalja, String productUrl1,
			String productUrl2, String productUrl3, String productUrl4, String productUrl5, String productUrl6,
			String productUrl7, String productUrl8) {
		super();
		this.danaClipLog = danaClipLog;
		this.clipSort = clipSort;
		this.clipName = clipName;
		this.clipInfo = clipInfo;
		this.writeNalja = writeNalja;
		this.productUrl1 = productUrl1;
		this.productUrl2 = productUrl2;
		this.productUrl3 = productUrl3;
		this.productUrl4 = productUrl4;
		this.productUrl5 = productUrl5;
		this.productUrl6 = productUrl6;
		this.productUrl7 = productUrl7;
		this.productUrl8 = productUrl8;
	}


	public int getDanaClipLog() {
		return danaClipLog;
	}


	public void setDanaClipLog(int danaClipLog) {
		this.danaClipLog = danaClipLog;
	}


	public int getClipSort() {
		return clipSort;
	}


	public void setClipSort(int clipSort) {
		this.clipSort = clipSort;
	}


	public String getClipName() {
		return clipName;
	}


	public void setClipName(String clipName) {
		this.clipName = clipName;
	}


	public String getClipInfo() {
		return clipInfo;
	}


	public void setClipInfo(String clipInfo) {
		this.clipInfo = clipInfo;
	}


	public Date getWriteNalja() {
		return writeNalja;
	}


	public void setWriteNalja(Date writeNalja) {
		this.writeNalja = writeNalja;
	}


	public String getProductUrl1() {
		return productUrl1;
	}


	public void setProductUrl1(String productUrl1) {
		this.productUrl1 = productUrl1;
	}


	public String getProductUrl2() {
		return productUrl2;
	}


	public void setProductUrl2(String productUrl2) {
		this.productUrl2 = productUrl2;
	}


	public String getProductUrl3() {
		return productUrl3;
	}


	public void setProductUrl3(String productUrl3) {
		this.productUrl3 = productUrl3;
	}


	public String getProductUrl4() {
		return productUrl4;
	}


	public void setProductUrl4(String productUrl4) {
		this.productUrl4 = productUrl4;
	}


	public String getProductUrl5() {
		return productUrl5;
	}


	public void setProductUrl5(String productUrl5) {
		this.productUrl5 = productUrl5;
	}


	public String getProductUrl6() {
		return productUrl6;
	}


	public void setProductUrl6(String productUrl6) {
		this.productUrl6 = productUrl6;
	}


	public String getProductUrl7() {
		return productUrl7;
	}


	public void setProductUrl7(String productUrl7) {
		this.productUrl7 = productUrl7;
	}


	public String getProductUrl8() {
		return productUrl8;
	}


	public void setProductUrl8(String productUrl8) {
		this.productUrl8 = productUrl8;
	}


	@Override
	public String toString() {
		return "ClipVo [danaClipLog=" + danaClipLog + ", clipSort=" + clipSort + ", clipName=" + clipName
				+ ", clipInfo=" + clipInfo + ", writeNalja=" + writeNalja + ", productUrl1=" + productUrl1
				+ ", productUrl2=" + productUrl2 + ", productUrl3=" + productUrl3 + ", productUrl4=" + productUrl4
				+ ", productUrl5=" + productUrl5 + ", productUrl6=" + productUrl6 + ", productUrl7=" + productUrl7
				+ ", productUrl8=" + productUrl8 + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clipInfo == null) ? 0 : clipInfo.hashCode());
		result = prime * result + ((clipName == null) ? 0 : clipName.hashCode());
		result = prime * result + clipSort;
		result = prime * result + danaClipLog;
		result = prime * result + ((productUrl1 == null) ? 0 : productUrl1.hashCode());
		result = prime * result + ((productUrl2 == null) ? 0 : productUrl2.hashCode());
		result = prime * result + ((productUrl3 == null) ? 0 : productUrl3.hashCode());
		result = prime * result + ((productUrl4 == null) ? 0 : productUrl4.hashCode());
		result = prime * result + ((productUrl5 == null) ? 0 : productUrl5.hashCode());
		result = prime * result + ((productUrl6 == null) ? 0 : productUrl6.hashCode());
		result = prime * result + ((productUrl7 == null) ? 0 : productUrl7.hashCode());
		result = prime * result + ((productUrl8 == null) ? 0 : productUrl8.hashCode());
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
		ClipVo other = (ClipVo) obj;
		if (clipInfo == null) {
			if (other.clipInfo != null)
				return false;
		} else if (!clipInfo.equals(other.clipInfo))
			return false;
		if (clipName == null) {
			if (other.clipName != null)
				return false;
		} else if (!clipName.equals(other.clipName))
			return false;
		if (clipSort != other.clipSort)
			return false;
		if (danaClipLog != other.danaClipLog)
			return false;
		if (productUrl1 == null) {
			if (other.productUrl1 != null)
				return false;
		} else if (!productUrl1.equals(other.productUrl1))
			return false;
		if (productUrl2 == null) {
			if (other.productUrl2 != null)
				return false;
		} else if (!productUrl2.equals(other.productUrl2))
			return false;
		if (productUrl3 == null) {
			if (other.productUrl3 != null)
				return false;
		} else if (!productUrl3.equals(other.productUrl3))
			return false;
		if (productUrl4 == null) {
			if (other.productUrl4 != null)
				return false;
		} else if (!productUrl4.equals(other.productUrl4))
			return false;
		if (productUrl5 == null) {
			if (other.productUrl5 != null)
				return false;
		} else if (!productUrl5.equals(other.productUrl5))
			return false;
		if (productUrl6 == null) {
			if (other.productUrl6 != null)
				return false;
		} else if (!productUrl6.equals(other.productUrl6))
			return false;
		if (productUrl7 == null) {
			if (other.productUrl7 != null)
				return false;
		} else if (!productUrl7.equals(other.productUrl7))
			return false;
		if (productUrl8 == null) {
			if (other.productUrl8 != null)
				return false;
		} else if (!productUrl8.equals(other.productUrl8))
			return false;
		return true;
	}
}
