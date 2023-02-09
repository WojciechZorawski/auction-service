package com.example.auctionservice.auction;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuctionService {

  private final AuctionRepository auctionRepository;

  public Auction createAuction(final Auction auction){
    return auctionRepository.save(auction);
  }

  public List<Auction> listTenNewestAuctions(){
    return auctionRepository.findFirst10OrderByDate();
  }

  public List<Auction> listTenOldestAuctions(){
    return auctionRepository.findLast10OrderByDate();
  }

}
