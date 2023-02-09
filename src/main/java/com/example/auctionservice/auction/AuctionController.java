package com.example.auctionservice.auction;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AuctionController {

  private final AuctionService auctionService;

  @GetMapping("/getNewestAuctions")
  public List<Auction> listTenNewestAuctions(){
    return auctionService.listTenNewestAuctions();
  }

  @GetMapping("/getOldestAuctions")
  public List<Auction> listTenOldestAuctions(){return auctionService.listTenOldestAuctions();}
}
