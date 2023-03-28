package ss17_io_binary_file_serialization.bai_tap.quan_ly_san_pham_luu_ra_file_nhi_phan.repository;

import ss17_io_binary_file_serialization.bai_tap.quan_ly_san_pham_luu_ra_file_nhi_phan.model.Product;
import ss17_io_binary_file_serialization.bai_tap.quan_ly_san_pham_luu_ra_file_nhi_phan.util.ReadAndWrite;

import java.util.List;

public class ProductRepo implements IProductRepo {
    List<Product> productList = ReadAndWrite.readFileBinary(PATH);
    private static final String PATH = "src\\ss17_io_binary_file_serialization\\bai_tap\\quan_ly_san_pham_luu_ra_file_nhi_phan\\data\\product.dat";

    @Override
    public List<Product> getAll() {
        return productList;
    }

    @Override
    public void add(List<Product> productList) {

    }

    @Override
    public void search(int id) {
        boolean flag = true;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                System.out.println("Sản phẩm cần tìm là: "+productList.get(i));
                flag = false;
            }
        }
        if (flag) {
            System.out.println("Không tìm thấy");
        }
    }
    public void save(List<Product> productList){
        ReadAndWrite.writeListProductToFileDat(PATH, productList);
    }
}
