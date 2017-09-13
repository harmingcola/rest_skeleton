package skeleton.dao;

import org.springframework.stereotype.Repository;
import skeleton.model.Skull;

@Repository
public class SkullDao {

    public Skull read(Integer id) {
        Skull skull = new Skull();
        skull.setNumberOfTeeth(id);
        skull.setNumberOfEyes(2);
        skull.setNumberOfFractures(0);
        return skull;
    }
}