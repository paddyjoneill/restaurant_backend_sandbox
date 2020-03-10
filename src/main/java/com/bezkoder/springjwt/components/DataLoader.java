package com.bezkoder.springjwt.components;

import com.bezkoder.springjwt.models.Booking;
import com.bezkoder.springjwt.models.ERole;
import com.bezkoder.springjwt.models.Role;
import com.bezkoder.springjwt.models.User;
import com.bezkoder.springjwt.repository.BookingRepository;
import com.bezkoder.springjwt.repository.RoleRepository;
import com.bezkoder.springjwt.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    RoleRepository roleRepository;

    public DataLoader() {

        }

    public void run(ApplicationArguments args){

//        User steve = new User("steve", "steve@gmail.com", "Steve", "07327183213", "password" );
//        userRepository.save(steve);
//
//        Booking booking = new Booking("20/03/2020", "17:30", 4, steve);
//        bookingRepository.save(booking);

//        steve.addBooking(booking);
//        userRepository.save(steve);

//        Role user = new Role(ERole.ROLE_USER);
//        roleRepository.save(user);
//
//        Role mod = new Role(ERole.ROLE_MODERATOR);
//        roleRepository.save(mod);
//
//        Role admin = new Role(ERole.ROLE_ADMIN);
//        roleRepository.save(admin);



    }

}
