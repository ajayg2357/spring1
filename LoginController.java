package asdf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LoginController {
	
	@RequestMapping(value="/showPage", method=RequestMethod.GET)
	public String showPage(Model model)throws Exception{
		
		String username="girish";
		model.addAttribute("uname", username);
		return "success";
		
	}
	@RequestMapping("/servlet1")
	public String test(@RequestParam("name") String n,@RequestParam("pwd") String pass,Model m){
		m.addAttribute("uname", n);
		m.addAttribute("pwd", pass);
		return "success";
		
	}

}
