package com.example.demo

import org.springframework.cache.annotation.EnableCaching
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@EnableCaching
class RateLimitController {
	@GetMapping( "/test")
	fun rateLimitTest(): ResponseEntity<String> {
		return ResponseEntity.ok("Successful request")
	}
}
