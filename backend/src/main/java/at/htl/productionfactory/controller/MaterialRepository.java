package at.htl.productionfactory.controller;

import at.htl.productionfactory.entity.Material;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;

@ApplicationScoped
public class MaterialRepository implements PanacheRepository<Material> {

    @Transactional
    public Material save(Material material) {
        return getEntityManager().merge(material);
    }

}
