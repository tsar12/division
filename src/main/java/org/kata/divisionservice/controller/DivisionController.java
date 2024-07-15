package org.kata.divisionservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/division")
public class DivisionController {

  @GetMapping("/divide")
  public ResponseEntity<Double> divide(@RequestParam double a, @RequestParam double b) {
    if (b == 0) {
      return ResponseEntity.badRequest().body(null);
    }
    double result = a / b;
    return ResponseEntity.ok(result);
  }
}