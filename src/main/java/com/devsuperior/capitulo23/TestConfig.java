package com.devsuperior.capitulo23;

import com.devsuperior.capitulo23.domain.entities.Category;
import com.devsuperior.capitulo23.domain.dto.OrderAllDTO;
import com.devsuperior.capitulo23.domain.dto.UserAllDTO;
import com.devsuperior.capitulo23.domain.entities.User;
import com.devsuperior.capitulo23.domain.enums.OrderStatus;
import com.devsuperior.capitulo23.services.CategoryServices;
import com.devsuperior.capitulo23.services.OrderServices;
import com.devsuperior.capitulo23.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;


import static java.util.Arrays.asList;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserServices userServices;

    @Autowired
    private OrderServices orderServices;

    @Autowired
    private CategoryServices categoryServices;

    @Override
    public void run(String... args) throws Exception {
        UserAllDTO user01 = new UserAllDTO(null, "lucas rocha dos santos", "lucasrocharsx@outlook.com", "38-9-99864484", "123456", LocalDate.of(1995, 4, 1));
        UserAllDTO user02 = new UserAllDTO(null, "anna clara bernardino rocha", "annaclaradr@outlook.com", "38-9-99864484", "123456", LocalDate.of(2021, 3, 10));
        UserAllDTO user03 = new UserAllDTO(null, "luciene jose dos santos", "lucienesantosjp@outlook.com", "38-9-99293599", "123456", LocalDate.of(1973, 1, 5));

        OrderAllDTO order1 = new OrderAllDTO(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.DELIVERED, new User(user01));
        OrderAllDTO order2 = new OrderAllDTO(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.SHIPPED, new User(user02));
        OrderAllDTO order3 = new OrderAllDTO(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.SHIPPED, new User(user03));

        Category cat1 = new Category(null, "Electronics");
        Category cat2 = new Category(null, "Books");
        Category cat3 = new Category(null, "Computers");

        userServices.saveAll(Arrays.asList(user01, user02, user03));
        orderServices.saveAll(Arrays.asList(order1, order2, order3));
        categoryServices.saveAll(Arrays.asList(cat1, cat2, cat3));



    }
}
