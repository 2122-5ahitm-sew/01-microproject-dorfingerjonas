package at.htl.productionfactory.controller;

import at.htl.productionfactory.entity.Product;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

public class ProductRepository implements PanacheRepository<Product> {
}
