package com.example.auctionservice.bidding;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class BiddingControler {

  private final BiddingService biddingService;

  @GetMapping("/{userId}/getBiddingsForUser")
  public List<Bidding> listBidingsForUser(@PathVariable Long userId){
    return biddingService.listBiddingsForUser(userId);
  }
}
