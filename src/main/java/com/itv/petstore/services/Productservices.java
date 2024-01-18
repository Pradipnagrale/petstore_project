package com.itv.petstore.services;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.springframework.stereotype.Service;
import com.itv.petstore.entities.Product;



@Service
public class Productservices {
    private Map<Integer,Product>product=new HashMap<>();
    private AtomicInteger atomic=new AtomicInteger();

    public Productservices()
    {
        Product p=new Product();
        p.setId(atomic.incrementAndGet());
        p.setName("Kennel Kitchen Sparky Barky");
        p.setPrice("22323");
        p.setManufacture("Cinammon, Parsley, Cranberry & Yucca");
        p.setDescription("Kennel Kitchen Sparky Barky Dental Sticks For Dogs | 180g, 7 Stick");
        product.put(p.getId(),p);


        Product p2=new Product();
        p2.setId(atomic.incrementAndGet());
        p2.setName(" Sparky Barky");
        p2.setPrice("223");
        p2.setManufacture("Cinammon, Parsley, ");
        p2.setDescription("y Dental Sticks For Dogs | 180g, 7 Stick");
        product.put(p2.getId(),p2);
    }
   public Collection<Product>getAllProducts()
    {
        return product.values();
    }

    public Product getProductById(Integer id)
    {
        return product.get(id);
    }

    public Product addProduct(Product products)
    {
        products.setId(atomic.incrementAndGet());
        product.put(products.getId(), products);
        return products;
    }

    public String deleteProduct(Integer id)
    {
        Product productexists=product.get(id);
        if(productexists!=null)
        {
            product.remove(id);
            return "product delete succesefully";
        }
        else{
            return "no such product";
        }

    }
    public String updateProduct(Integer id, Product  p)
     {
        
        Product productexists=product.get(id);
         if(productexists!=null)
         p.setId(id);
         product.put(id,p);
         return "product updates succesefully";
    }





}
