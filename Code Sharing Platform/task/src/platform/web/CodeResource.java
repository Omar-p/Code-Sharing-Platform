package platform.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/code")
public class CodeResource {
  @GetMapping
  public ResponseEntity<?> getCode() {
    Map<String, String> body = Map.of("code",
        "public static void main(String[] args) {\n    SpringApplication.run(CodeSharingPlatform.class, args);\n}");
    return ResponseEntity.ok(body);
  }
}
