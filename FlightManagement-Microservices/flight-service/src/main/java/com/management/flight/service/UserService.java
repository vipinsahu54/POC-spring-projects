//package com.tapandeat.foodtray.service;
//
//import java.util.List;
//
//import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import com.tapandeat.foodtray.model.User;
//
//
//@FeignClient(value="USER-SERVICE", fallback=UserServiceFallback.class)
//public interface UserService {
//
//	@RequestMapping(method = RequestMethod.GET, value = "/user/{id}")
//	public List<User> findAll(@PathVariable("id") Long id);
//	
//}
