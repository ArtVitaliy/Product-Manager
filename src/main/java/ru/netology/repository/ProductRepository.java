package ru.netology.repository;

import ru.netology.product.Product;

public class ProductRepository {
    private Product[] items = new Product[0];


    public void add(Product product) {                //сохранение
        Product[] tmp = new Product[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];

        }
        tmp[tmp.length - 1] = product;
        items = tmp;
    }

    public Product[] findAll() {
        return items;
    } //получение всех сохраненных

    public void removeById(int removeId) {                     //удаление по id
        Product[] tmp = new Product[items.length - 1];
        int copyToIndex = 0;
        for (Product product : items) {
            if (product.getId() != removeId) {
                tmp[copyToIndex] = product;
                copyToIndex++;
            }

        }
        items = tmp;


    }
}
