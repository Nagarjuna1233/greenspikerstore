package com.gs.store.controller.pages;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.gs.store.GsStoreConstants;

@Controller
public class HomePageController {

	@GetMapping("/")
	public String home() {

		return GsStoreConstants.Pages.HOME_PAGE;
	}

}
