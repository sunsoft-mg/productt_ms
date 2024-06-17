package sunsoft.mg.services;

import org.springframework.stereotype.Service;
import sunsoft.mg.common.CommonService;
import sunsoft.mg.models.Color;
import sunsoft.mg.repositories.ColorRepo;

import java.util.List;

@Service
public class ColorService extends CommonService<Color, ColorRepo> {
    protected ColorService(ColorRepo repository) {
        super(repository);
    }

    @Override
    public List<Color> findByFilter(String filter) {
        return this.repository.findByDescriptionContainingOrReferenceContaining(filter,filter);
    }
}
