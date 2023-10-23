package io.stock.trades.stocktrades.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class StockTradesController {
  @GetMapping("/trades")
  public ResponseEntity<?> getTrades() {
    return ResponseEntity.ok().body("Hi this is trades analytics");
  }
}
