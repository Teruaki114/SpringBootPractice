package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.User;

@Controller
public class HomeController {

	@GetMapping("/form")
	private String readForm(@ModelAttribute User user) {
		return "form";
	}

	@PostMapping("/form")
	private String confirm(@ModelAttribute User user) {
		return "confirm";
	}

	/*@ModelAttribute・・・
	 * モデル属性にバインドします。
	 * バインドとは、日本語で「結び付ける」「関連付ける」などの意味。
	 * ここでは、入力画面の「氏名」が
	 * <input type="text" name="name">の場合、リクエストを受け付けたタイミングで
	 * Springが自動でUserクラスのnameプロパティに画面入力値を設定してくれます。
	 * これは、データバインディングと呼ばれ、パラメータ取得コードの記述が不要となります
	*/

}
