package at.htl.productionfactory.controller;

import at.htl.productionfactory.entity.Product;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;

@ApplicationScoped
public class ProductRepository implements PanacheRepository<Product> {

    @Transactional
    public Product save(Product product) {
        return getEntityManager().merge(product);
    }

}
