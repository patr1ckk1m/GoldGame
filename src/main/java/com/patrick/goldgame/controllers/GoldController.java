package com.patrick.goldgame.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import java.util.Random;

@Controller
public class GoldController {
	@RequestMapping(path = "/Gold", method = RequestMethod.GET)
	public String index(HttpSession session) {
		Integer gold = (Integer) session.getAttribute("gold");
		if (gold == null) {
			gold = 0;
			session.setAttribute("gold", gold);
		}
		else {
			session.setAttribute("gold", gold);
		}
		return "goldpage.jsp";
	}
	@RequestMapping(path = "/process_money", method = RequestMethod.POST)
	public String posting(@RequestParam(value = "building") String building, HttpSession session) {
		Integer gold = (Integer) session.getAttribute("gold");
		Random rand = new Random();
		if (building.equals("cave")) {
			gold += rand.nextInt(10) + 5;
			
		} else if (building.equals("farm")) {
			gold += rand.nextInt(20) + 10;
			
		} else if (building.equals("casino")) {
			int win = rand.nextInt(1) + 0;
			if (win == 0) {
				gold += rand.nextInt(50) + 1;

			}
			else {
				gold -= rand.nextInt(50) + 1;
			}

		} else if (building.equals("house")) {
			gold += rand.nextInt(5) + 2;
		}
		
		session.setAttribute("gold", gold);
		return "redirect:/Gold";
	}

}
