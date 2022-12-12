package zimareva.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zimareva.model.dto.ModifyRequest;
import zimareva.model.dto.ModifyResponse;
import zimareva.service.SkExampleTableService;

@RestController
@RequestMapping("/modify")
public class SkExampleTableController {
    private final SkExampleTableService service;

    @Autowired
    public SkExampleTableController(SkExampleTableService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<ModifyResponse> modifyCurrent(@RequestBody ModifyRequest request) {
        ModifyResponse response = service.modifyCurrent(request);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
