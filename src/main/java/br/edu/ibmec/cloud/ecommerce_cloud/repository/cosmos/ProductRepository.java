package br.edu.ibmec.cloud.ecommerce_cloud.repository.cosmos;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.azure.spring.data.cosmos.repository.CosmosRepository;

import br.edu.ibmec.cloud.ecommerce_cloud.model.Product;

@Repository
public interface ProductRepository extends CosmosRepository<Product, String> {
    
    // NOVO MÉTODO - Busca produtos que contenham o nome (case insensitive)
    Optional<List<Product>> findByProductNameContains(String productName);
}