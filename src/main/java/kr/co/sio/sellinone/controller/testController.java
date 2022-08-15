package kr.co.sio.sellinone.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {

    @GetMapping("/")
    public String test(){
        return "이게 보인다면 깃허브 푸시할때 젠킨스가 정상적으로 작동한거다!!";
    }
}
