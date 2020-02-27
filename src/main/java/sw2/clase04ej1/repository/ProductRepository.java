package sw2.clase04ej1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sw2.clase04ej1.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

}

