package platform.services;

import org.springframework.stereotype.Service;
import platform.model.Code;

import java.time.LocalDateTime;

@Service
public class CodeService {

  private Code code = new Code("public static void main(String[] args) {\n" +
      "    SpringApplication.run(CodeSharingPlatform.class, args);\n}");

  public Code getCode() {
    return code;
  }

  public void setCode(Code code) {
    code.setDate(LocalDateTime.now());
    this.code = code;
  }
}
