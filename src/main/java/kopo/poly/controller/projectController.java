package kopo.poly.controller;

import kopo.poly.service.IUserInfoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@RequestMapping(value = "/project")
@RequiredArgsConstructor
@Controller
public class projectController {

    private final IUserInfoService userInfoService;

    @GetMapping(value = "userRegForm")
    public String example() {

        log.info(this.getClass().getName() + ".project/userRegForm Start!");

        log.info(this.getClass().getName() + ".project/userRegForm End!");

        return "project/userRegForm";
    }

    @GetMapping(value = "login")
    public String login() {
        log.info(this.getClass().getName() + ".project/login Start!");

        log.info(this.getClass().getName() + ".project/login End!");

        return "project/login";
    }

    @GetMapping(value = "idsearch")
        public String idsearch() {
            log.info(this.getClass().getName() + ".project/login Start!");

            log.info(this.getClass().getName() + ".project/login End!");

            return "project/idsearch";
    }

    @GetMapping(value = "pwdsearch")
        public String pwdsearch() {
        log.info(this.getClass().getName() + ".project/login Start!");

        log.info(this.getClass().getName() + ".project/login End!");

        return "project/pwdsearch";
    }
    @GetMapping(value = "index")
        public String index() {
            log.info(this.getClass().getName() + ".project/index Start!");

            log.info(this.getClass().getName() + ".project/index End!");

            return "project/index";
    }

    @GetMapping(value = "userexit")
    public String userexit() {
        log.info(this.getClass().getName() + ".project/index Start!");

        log.info(this.getClass().getName() + ".project/index End!");

        return "project/userexit";
    }

    @GetMapping(value = "bookSearch")
    public String bookSearch() {
        log.info(this.getClass().getName() + ".project/bookSearch Start!");

        log.info(this.getClass().getName() + ".project/bookSearch End!");

        return "project/bookSearch";
    }

    @GetMapping(value = "bookSearch2")
    public String bookSearch2() {
        log.info(this.getClass().getName() + ".project/bookSearch2 Start!");

        log.info(this.getClass().getName() + ".project/bookSearch2 End!");

        return "project/bookSearch2";
    }


}
