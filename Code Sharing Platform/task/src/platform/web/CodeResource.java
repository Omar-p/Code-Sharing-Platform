package platform.web;

import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import platform.model.Code;
import platform.services.CodeService;

import java.util.Map;

@RestController
@RequestMapping("/api/code")
public class CodeResource {

  private final CodeService codeService;

  public CodeResource(CodeService codeService) {
    this.codeService = codeService;
  }

  @GetMapping
  public ResponseEntity<?> getCode() {
    return ResponseEntity.ok(this.codeService.getCode());
  }

  @PostMapping("/new")
  public ResponseEntity<?> submitCode(@RequestBody Code code) {
    this.codeService.setCode(code);
    return ResponseEntity.ok("{}");
  }

}
