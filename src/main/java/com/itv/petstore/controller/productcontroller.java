package com.itv.petstore.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.itv.petstore.entities.Product;
import com.itv.petstore.services.Productservices;

import jakarta.validation.Valid;

@RestController
public class productcontroller {
    // @RequestMapping("/")
    // public String getName()
    // {
    //     return "my name is pradip";
    // }

    //  @RequestMapping("/surname")
    // public String getsurname()
    // {
    //     return "my surname is nagrale";
    // }

    //  @RequestMapping("/marks")
    // public int getmarks()
    // {
    //     return 90;
    // }
   @Autowired
private Productservices productService;
@GetMapping("/products")
// @RequestMapping("/products")
public Collection<Product>getProduct()
{
    return this.productService.getAllProducts();
}

// retrive data
@GetMapping("/products/{id}")
// @RequestMapping("/products/{id}")
public Product getProductById(@PathVariable Integer id)
{
    return this.productService.getProductById(id);
}

// add
@PostMapping("/products")
// @RequestMapping(path="/products",method=RequestMethod.POST)
public Product addProduct(@RequestBody @Valid Product product)
{
   return this.productService.addProduct(product);
}

// delete

@DeleteMapping("/products/{id}")
// @RequestMapping(path="/products/{id}",method=RequestMethod.DELETE)
public String deleteProduct(@PathVariable  Integer id)
{
   return this.productService.deleteProduct(id);
}


// updation"s controller

@PutMapping("/products/{id}")
//  @RequestMapping(path="/products/{id}",method=RequestMethod.PUT)
public String updateProduct (@PathVariable  Integer id,@RequestBody Product product)
{
   return this.productService.updateProduct(id,product);
}


}
