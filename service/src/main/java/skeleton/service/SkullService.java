package skeleton.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import skeleton.dao.SkullDao;
import skeleton.model.Skull;

@Service
public class SkullService {

    @Autowired
    private SkullDao skullDao;

    public Skull read(Integer id) {
        return skullDao.read(id);
    }
}
