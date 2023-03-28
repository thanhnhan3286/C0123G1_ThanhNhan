package ss17_io_binary_file_serialization.bai_tap.quan_ly_san_pham_luu_ra_file_nhi_phan.repository;

import ss17_io_binary_file_serialization.bai_tap.quan_ly_san_pham_luu_ra_file_nhi_phan.model.Product;

import java.util.List;

public interface IProductRepo {
    List<Product> getAll();
    void add(List<Product> productList);
    void search(int id);
}
