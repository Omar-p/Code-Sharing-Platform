package platform.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import platform.services.CodeService;

@Controller
@RequestMapping("/code")
public class CodeController {

  private final CodeService codeService;

  public CodeController(CodeService codeService) {
    this.codeService = codeService;
  }

  @GetMapping
  public String getCode(Model model) {
    model.addAttribute("code", this.codeService.getCode());
    return "code";
  }

  @GetMapping("new")
  public String newCode() {
    return "newCode";
  }

  @PostMapping("new")
  public String processNewCode() {
    return "redirect:/code/new";
  }
}
