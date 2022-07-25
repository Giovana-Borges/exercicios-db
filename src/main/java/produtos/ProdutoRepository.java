package produtos;

public interface ProdutoRepository {

    Produto findById(Long id);
    Produto save(Produto produto);
}
