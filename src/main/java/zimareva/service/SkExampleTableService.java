package zimareva.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import zimareva.model.SkExampleTable;
import zimareva.model.dto.ModifyRequest;
import zimareva.model.dto.ModifyResponse;
import zimareva.repository.SkExampleTableRepository;

import javax.transaction.Transactional;
import java.text.MessageFormat;

@Service
public class SkExampleTableService {
    private final SkExampleTableRepository repository;

    @Autowired
    public SkExampleTableService(SkExampleTableRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public ModifyResponse modifyCurrent(ModifyRequest request) {
        SkExampleTable tableToEdit = getSkExampleTableById(request.getId());
        Double result = tableToEdit.getObj().getCurrent() + request.getAdd();
        tableToEdit.getObj().setCurrent(result);
        return new ModifyResponse(tableToEdit.getObj().getCurrent());
    }

    public SkExampleTable getSkExampleTableById(Long id) {
        return repository.findById(id).orElseThrow(() ->
                new ResponseStatusException(
                        HttpStatus.I_AM_A_TEAPOT,
                        MessageFormat.format("Could not find entity {0} with id: {1} ",
                                SkExampleTable.class.getName(), id)));
    }
}
