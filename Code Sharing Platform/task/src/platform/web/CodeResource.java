package platform.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import platform.code.Code;
import platform.code.CodeService;

@RestController
@RequestMapping("/api/code")
public class CodeResource {

  private final CodeService codeService;

  public CodeResource(CodeService codeService) {
    this.codeService = codeService;
  }

  @GetMapping("{id}")
  public ResponseEntity<?> getCode(@PathVariable("id") long id) {
    return ResponseEntity.ok(this.codeService.getCodeById(id));
  }
  @GetMapping("latest")
  public ResponseEntity<?> getLatestCode() {
    return ResponseEntity.ok(this.codeService.getLatestCodeSnippets());
  }

  @PostMapping("/new")
  public ResponseEntity<?> submitCode(@RequestBody Code code) {
    return ResponseEntity.ok(this.codeService.createNewCode(code));
  }

}
