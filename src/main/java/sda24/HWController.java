package sda24;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by RENT on 2017-03-01.
 */

@RestController
public class HWController {

    @GetMapping
    public String showHW(){
        return "Hello World!";
    }

}
