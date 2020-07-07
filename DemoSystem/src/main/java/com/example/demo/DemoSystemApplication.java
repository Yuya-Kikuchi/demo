package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <dd>プロジェクト エントリ クラス
 * <dl>Springアプリケーション起動を行うクラス
 * @author yuya
 */
@SpringBootApplication
public class DemoSystemApplication {

	/**
	 * <dd>商品管理デモアプリケーション起動
	 * <dl>商品管理デモアプリケーションを起動する。
	 * @param args 実行パラメータ
	 */
	public static void main(String[] args) {
		SpringApplication.run(DemoSystemApplication.class, args);
	}
}
