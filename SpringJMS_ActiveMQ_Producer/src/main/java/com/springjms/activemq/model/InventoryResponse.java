package com.springjms.activemq.model;

import java.io.Serializable;

/**
 * Created by krishna1bhat on 8/13/17.
 */
public class InventoryResponse implements Serializable{

	private String productId;
	private int returnCode;
	private String comment;

	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public int getReturnCode() {
		return returnCode;
	}
	public void setReturnCode(int returnCode) {
		this.returnCode = returnCode;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	@Override
	public String toString() {
		return "InventoryResponse [productId=" + productId + ", returnCode=" + returnCode + ", comment=" + comment
				+ "]";
	}


	
}
