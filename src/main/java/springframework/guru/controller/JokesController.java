package springframework.guru.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import springframework.guru.service.JokesService;

@Controller
public class JokesController {
	
	@Autowired
	private JokesService jokesService;
	
	@RequestMapping("/")
	public String getJoke(Model model) {
		
		
		model.addAttribute("joke", jokesService.getChuckNorrisString());
		
		System.out.println(jokesService.getChuckNorrisString());
		
		
		return "chucknorris";
		
		
	}

}
