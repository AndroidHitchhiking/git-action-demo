package git.action.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public ResponseEntity<String> helloMessage(){
        return ResponseEntity.ok("Hello Guys, Git action demo message");
    }
}
