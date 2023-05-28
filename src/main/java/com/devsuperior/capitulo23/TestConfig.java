package com.devsuperior.capitulo23;

import com.devsuperior.capitulo23.domain.entities.User;
import com.devsuperior.capitulo23.domain.dto.OrderAllDTO;
import com.devsuperior.capitulo23.domain.dto.UserAllDTO;
import com.devsuperior.capitulo23.domain.enums.OrderStatus;
import com.devsuperior.capitulo23.services.OrderServices;
import com.devsuperior.capitulo23.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.time.LocalDate;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserServices userServices;

    @Autowired
    private OrderServices orderServices;

    @Override
    public void run(String... args) throws Exception {
        UserAllDTO userAllDTO01 = new UserAllDTO(null, "lucas rocha dos santos", "lucasrocharsx@outlook.com", "38-9-99864484", "123456", LocalDate.of(1995, 4, 1));
        UserAllDTO userAllDTO02 = new UserAllDTO(null, "anna clara bernardino rocha", "annaclaradr@outlook.com", "38-9-99864484", "123456", LocalDate.of(2021, 3, 10));
        UserAllDTO userAllDTO03 = new UserAllDTO(null, "luciene jose dos santos", "lucienesantosjp@outlook.com", "38-9-99293599", "123456", LocalDate.of(1973, 1, 5));

        OrderAllDTO o1 = new OrderAllDTO(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.DELIVERED, new User(userAllDTO01));
        OrderAllDTO o2 = new OrderAllDTO(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.DELIVERED, new User(userAllDTO02));
        OrderAllDTO o3 = new OrderAllDTO(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.PAID, new User(userAllDTO03));



        orderServices.save(o1);
        orderServices.save(o2);
        orderServices.save(o3);
    }
}
