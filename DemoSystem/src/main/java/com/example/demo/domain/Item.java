package com.example.demo.domain;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * <dd>商品のドメイン（Bean）クラス
 * <dl>商品テーブルの各種情報を管理するための型
 * @author yuya
 */
public class Item {
	/** <dl>商品ID */
	private Long id;

	/** <dl>商品名 */
	@NotBlank(message = "商品名を記入してください。")
	private String name;

	/** <dl>価格 */
	@Min(value = 10, message = "10以上の数値を入力してください。")
	@Max(value = 10000, message = "10000以下の数値を入力してください。")
	private float price;

	/** <dl>ベーダ―名 */
	@Size(max = 50, message = "ベーダー名は50文字を超えないでください。")
	private String vendor;

	/**
	 * <dd>商品ID取得
	 * <dl>商品IDを取得する
	 * @return Long 商品ID
	 */
	public Long getId() {
		return id;
	}

	
	/**
	 * <dd>商品ID設定処理
	 * <dl>商品IDを設定する
	 * @param id 商品ID
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * <dd>商品名取得処理
	 * <dl>商品名を取得する
	 * @return String 商品名
	 */
	public String getName() {
		return name;
	}

	/**
	 * <dd>商品名設定処理
	 * <dl>商品名を設定する
	 * @param name 商品名
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * <dd>商品価格取得処理
	 * <dl>商品価格を取得する
	 * @return float 商品価格
	 */
	public float getPrice() {
		return price;
	}

	/**
	 * <dd>商品価格設定処理
	 * <dl>商品価格を設定する
	 * @param price 商品価格
	 */
	public void setPrice(float price) {
		this.price = price;
	}

	/**
	 * <dd>出品者名取得処理
	 * <dl>出品者名を取得する
	 * @return String 出品者名
	 */
	public String getVendor() {
		return vendor;
	}

	/**
	 * <dd>出品者名設定処理
	 * <dl>出品者名を設定する
	 * @param vendor 出品者名
	 */
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
}
