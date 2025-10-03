package vn.iotstar.service;

import vn.iotstar.entity.Product;
import vn.iotstar.repository.ProductRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductServices {
    private final ProductRepository repo;

    public ProductServiceImpl(ProductRepository repo) {
        this.repo = repo;
    }

    @Override
    public List<Product> listAll() { return repo.findAll(); }

    @Override
    public Product save(Product product) { return repo.save(product); }

    @Override
    public Product get(Long id) { return repo.findById(id).get(); }

    @Override
    public void delete(Long id) { repo.deleteById(id); }
}