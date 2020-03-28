package springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Homecontroller {
	 @RequestMapping("/")
	public String show()
	{
		return "main-menu";
	}
	 @RequestMapping("/index")
	 public String showIndex()
		{
			return "index";
		}
	 @RequestMapping("/showForm")
	 public String showForm() {
		 return "hello-world";
	 }
	 @RequestMapping("/processForm")
	 public String processForm() {
		 return "helloworld";
	 }
	 @RequestMapping("/processForm2")
	 public String processForm2(@RequestParam("studentName") String name,Model model) {
		 name=name.toUpperCase();
		 model.addAttribute("message",name);
		 return "helloworld";
	 }
}
