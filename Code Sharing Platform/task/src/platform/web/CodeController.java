package platform.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/code")
public class CodeController {

  @GetMapping
  public String getCode(Model model) {
    model.addAttribute("code",
        "public static void main(String[] args) {\n    SpringApplication.run(CodeSharingPlatform.class, args);\n}");
    return "code";
  }
}
