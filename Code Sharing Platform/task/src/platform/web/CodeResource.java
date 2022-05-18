package platform.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import platform.code.CodeService;

import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/api/code")
public class CodeResource {

  private final CodeService codeService;

  public CodeResource(CodeService codeService) {
    this.codeService = codeService;
  }

  @GetMapping("{id}")
  public ResponseEntity<?> getCode(@PathVariable("id") UUID id) {
    var snippet = this.codeService.getCodeByIdProxy(id);
    return ResponseEntity.ok(snippet);
  }
  @GetMapping("latest")
  public ResponseEntity<?> getLatestCode() {
    return ResponseEntity.ok(this.codeService.getLatestCodeSnippets());
  }

  @PostMapping("/new")
  public ResponseEntity<?> submitCode(@RequestBody Map<String, String> codeSnippet) {
    return ResponseEntity.ok(this.codeService.createNewCode(codeSnippet));
  }

}
