package com.learn.demorest.restful.user;

import com.learn.demorest.restful.exception.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;
import java.util.Locale;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class UserController {

    @Autowired
    private UserDAOService userDAOService;


    @Autowired
    private MessageSource messageSource;

    @GetMapping(path = "hello-world-internationalized")
    public String helloWorldInternationalized(@RequestHeader(name = "Accept-Language", required = false) Locale locale){
        return messageSource.getMessage("good.morning.message",null,locale);
    }

    // we don't need to pass the location LocaleContextHolder handles it
    @GetMapping(path = "hello-world-internationalized-holder")
    public String helloWorldInternationalizedNoPassing(@RequestHeader(name = "Accept-Language", required = false) Locale locale){
        return messageSource.getMessage("good.morning.message",null, LocaleContextHolder.getLocale());
    }

    @PostMapping(path = "/users")
    public ResponseEntity createUser(@Valid @RequestBody User user) {
        User savedUser = userDAOService.save(user);
        System.out.println(savedUser.toString());
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedUser.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }

    @GetMapping(path = "/users")
    public List<User> retriveAllUsers() {
        return userDAOService.findAll();
    }

    @GetMapping(path = "/users/{id}")
    public EntityModel<User> retriveUserById(@PathVariable int id) {
        User usr = userDAOService.findOne(id);
        if (usr == null) {
            throw new UserNotFoundException("id:" + id);
        }
        //"all-users", SERVER_PATH+"/users"   //HATEOS

        // OLD HATEOS implementation
//        Resource<User> resource = new Resource<User>(usr);
//        ControllerLinkBuilder linkTo = linkTo(methodOn(this.getClass()).retriveAllUsers());
//        resource.add(linkTo.withRel("all-users"));

        EntityModel<User> resource = EntityModel.of(usr);
        WebMvcLinkBuilder linkTo = linkTo(methodOn(this.getClass()).retriveAllUsers());
        resource.add(linkTo.withRel("all-users"));
        return resource;
    }

    @DeleteMapping(path = "/users/{id}")
    public void deleteUser(@PathVariable int id) {
        User usr = userDAOService.deleteById(id);
        if (usr == null) {
            throw new UserNotFoundException("id:" + id);
        }
    }
}
