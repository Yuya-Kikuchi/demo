package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.domain.Item;
import com.example.demo.mapper.ItemMapper;

/**
 * <dd>DBアクセスクラス
 * <dl>トランザクション処理、関連機能を部品としてまとめる。
 * @author yuya
 */
@Service
public class ItemService {

	/** Mapper。初期化しなくても使える。 */
	@Autowired
	private ItemMapper itemMapper;

	/**
	 * <dd>全取得SQL実行
	 * <dl>SQL「findAll」を実行する。
	 * @return findAll実行結果
	 */
	@Transactional
	public List<Item> findAll() {
		return itemMapper.findAll();
	}

	/**
	 * <dd>商品情報取得SQL実行
	 * <dl>SQL「findOne」を実行する。
	 * @param id 商品ID
	 * @return findOne実行結果
	 */
	@Transactional
	public Item findOne(Long id) {
		return itemMapper.findOne(id);
	}

	/**
	 * <dd>商品新規登録SQL実行
	 * <dl>SQL「save」を実行する。
	 * @param item 登録対象商品情報
	 */
	@Transactional
	public void save(Item item) {
		itemMapper.save(item);
	}

	/**
	 * <dd>商品情報更新SQL実行
	 * <dl>SQL「update」を実行する。
	 * @param item 更新対象商品情報
	 */
	@Transactional
	public void update(Item item) {
		itemMapper.update(item);
	}

	/**
	 * <dd>商品情報削除SQL実行
	 * <dl>SQL「delete」を実行する。
	 * @param id 削除対象商品ID
	 */
	@Transactional
	public void delete(Long id) {
		itemMapper.delete(id);
	}
}
