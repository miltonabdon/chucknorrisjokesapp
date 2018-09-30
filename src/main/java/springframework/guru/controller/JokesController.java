package springframework.guru.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import springframework.guru.service.JokesServiceImpl;

@Controller
public class JokesController {
	
	@Autowired
	private JokesServiceImpl jokesService;
	
	@RequestMapping({"/",""})
	public String getJoke(Model model) {
		
		
		model.addAttribute("joke", jokesService.getJoke());
		
		System.out.println(jokesService.getJoke());
		
		
		return "chucknorris";
		
		
	}

}
