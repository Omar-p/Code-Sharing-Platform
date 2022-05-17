package platform.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Code {
  private String code;
  @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss")
  private LocalDateTime date;

  public Code() {
  }

  public Code(String code) {
    this.code = code;
    this.date = LocalDateTime.now();
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getDate() {
    return date.format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));
  }

  public void setDate(LocalDateTime date) {
    this.date = date;
  }
}
