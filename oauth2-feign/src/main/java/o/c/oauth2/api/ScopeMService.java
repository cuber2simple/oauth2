package o.c.oauth2.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import o.c.gj.gf.oauth2.Scope;

import java.util.List;

@FeignClient("oauth2")
@RequestMapping("/api/scope")
@RestController
public interface ScopeMService {

    @PostMapping("/display")
    List<Scope> display();
}
