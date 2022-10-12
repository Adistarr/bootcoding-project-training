package com.bootcoding.restaurant.app;

import com.bootcoding.restaurant.Customer;
import com.bootcoding.restaurant.Order;
import com.bootcoding.restaurant.Vendor;

import java.util.Date;

public class Application {
    public static void main(String[] args) {
        Customer aditya = new Customer();
        aditya.setName("Aditya");
        aditya.setCity("Nagpur");
        aditya.setAddress("New nandanwan, Nagpur");
        aditya.setState("Maharashtra");
        aditya.setEmailId("abc@gmail.com");
        aditya.setPhoneNumber(9876543201L);

        System.out.println("Customer Details :");
        System.out.println("Name : " + aditya.getName());
        System.out.println("City : " + aditya.getCity());
        System.out.println("Address : " + aditya.getAddress());
        System.out.println("State : " + aditya.getState());
        System.out.println("EmailId : " + aditya.getEmailId());
        System.out.println("Phone : = " + aditya.getPhoneNumber());




        Vendor cwiggy =new Vendor();
        cwiggy.setName("cwiggy veg restorent");
        cwiggy.setAddress("Nandanwan , Nagpur");
        cwiggy.setCategory("Veg");
        cwiggy.setPhoneNumber(9876573201L);
        cwiggy.setRating(5.0);
        cwiggy.setState("Maharashtra");
        cwiggy.setCity("Nagpur");

        System.out.println();
        System.out.println("Vender Details :");
        System.out.println("Name : " + cwiggy.getName());
        System.out.println("Address : " + cwiggy.getCity());
        System.out.println("Category : " + cwiggy.getAddress());
        System.out.println("Phone : " + cwiggy.getPhoneNumber());
        System.out.println("Rating : " + cwiggy.getRating());
        System.out.println("State : = " + cwiggy.getState());
        System.out.println("City : = " + cwiggy.getCity());



        Order order= new Order();
        order.setCustomer(aditya);
        order.setVendor(cwiggy);
        order.setTotalAmount(999.00);
        order.setOrderDate(new Date());
        order.setDeliveryAddress("101,civil line, nagpur");

        System.out.println();
        System.out.println("Vender Details :");
        System.out.println("Total Amount : " + order.getTotalAmount());
        System.out.println("Order Date : " + order.getOrderDate());
        System.out.println("Order Delivery Address : " + order.getDeliveryAddress());


    }
}
