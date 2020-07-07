package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.Item;
import com.example.demo.service.ItemService;

/**
 * <dd>コントローラークラス
 * <dl>フォームに表示する情報をDBから取得する。
 * @author yuya
 *
 */
@Controller
@RequestMapping("/items")
public class ItemController {
	
	/** <dl>DBアクセスクラスのインスタンス */
	@Autowired
	private ItemService itemService;

	/**
	 * <dd>商品全取得処理
	 * <dl>商品リストに表示するための商品情報を全て取得する。
	 * @param model モデル
	 * @return 遷移先URL
	 */
	@GetMapping
	public String index(Model model) {
		model.addAttribute("items", itemService.findAll());
		return "index";
	}

	/**
	 * <dd>商品情報詳細表示処理
	 * <dl>商品情報の詳細を表示する。
	 * @param id 商品ID
	 * @param model モデル
	 * @return 遷移先URL
	 */
	@GetMapping("{id}")
	public String show(@PathVariable Long id, Model model) {
		model.addAttribute("item", itemService.findOne(id));
		return "show";
	}

	/**
	 * <dd>商品リスト画面の「新規」ﾎﾞﾀﾝ押下時処理
	 * <dl>商品追加画面に遷移する
	 * @param item 商品情報
	 * @param model モデル
	 * @return 遷移先Mapping
	 */
	@GetMapping("new")
	public String newItem(@ModelAttribute("item") Item item, Model model) {
		return "new";
	}

	/**
	 * <dd>商品情報編集処理
	 * <dl>商品情報を更新する。
	 * @param id 編集対象商品ID
	 * @param item 編集対象商品ID
	 * @param model モデル
	 * @return 遷移先URL
	 */
	@GetMapping("{id}/edit")
	public String edit(@PathVariable Long id, @ModelAttribute("item") Item item, Model model) {
		model.addAttribute("item", itemService.findOne(id));
		return "edit";
	}

	/**
	 * <dd>商品追加処理
	 * <dl>商品情報を新規登録する
	 * @param item 商品情報
	 * @param result SQL実行結果
	 * @param model モデル
	 * @return 遷移先URL
	 */
	@PostMapping
	public String create(@ModelAttribute("item") @Validated Item item, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "new";
		}
		itemService.save(item);
		return "redirect:/items";
	}

	/**
	 * <dd>商品情報更新処理
	 * <dl>商品情報を更新する。
	 * @param id 更新対象商品ID
	 * @param item 更新対象商品情報
	 * @param result SQL実行結果
	 * @param model モデル
	 * @return 遷移先URL
	 */
	@PutMapping("{id}")
	public String update(@PathVariable Long id, @ModelAttribute("item") @Validated Item item, BindingResult result,
			Model model) {
		if (result.hasErrors()) {
			model.addAttribute("item", item);
			return "edit";
		}
		item.setId(id);
		itemService.update(item);
		return "redirect:/items";
	}

	/**
	 * <dd>商品情報削除処理
	 * <dl>商品を削除する。
	 * @param id 削除対象商品ID
	 * @return 遷移先URL
	 */
	@DeleteMapping("{id}")
	public String delete(@PathVariable Long id) {
		itemService.delete(id);
		return "redirect:/items";
	}
}
