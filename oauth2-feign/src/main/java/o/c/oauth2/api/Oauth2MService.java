package o.c.oauth2.api;

import o.c.gj.gf.oauth2.Client;
import o.c.gj.gf.oauth2.Scope;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient("oauth2")
@RequestMapping("/api/client")
@RestController
public interface Oauth2MService {

    @PostMapping("/init")
    Client init(@RequestBody Client client);

    @PostMapping("/update")
    Client update(@RequestBody Client client);

    @PostMapping("/{clientId}/auth")
    Client auth(@RequestBody List<Scope> scope, @PathVariable("clientId") String clientId);
}
