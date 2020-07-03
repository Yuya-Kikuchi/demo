package com.example.demo.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.example.demo.domain.Item;

/**
 * <dd>SQLについての操作を行う
 * @author yuya
 */
@Mapper
public interface ItemMapper {
	
	/**
	 * <dd>全商品取得処理
	 * <dl>全ての商品を取得する
	 * @return List<Item> 商品リスト
	 */
	List<Item> findAll();

	/**
	 * <dd>商品IDから商品情報取得処理
	 * <dl>指定したIDの商品を取得する
	 * @param id 商品ID
	 * @return Item 商品情報
	 */
	Item findOne(Long id);

	/**
	 * <dd>商品情報登録処理
	 * <dl>商品情報を登録する。
	 * @param item 商品情報
	 */
	void save(Item item);

	/**
	 * <dd>商品情報更新処理
	 * <dl>商品情報を上書き（更新）する。
	 * @param item 商品情報
	 */
	void update(Item item);

	/**
	 * <dd>商品情報削除処理
	 * <dl>商品情報を削除する
	 * @param id 商品ID
	 */
	void delete(Long id);
}
