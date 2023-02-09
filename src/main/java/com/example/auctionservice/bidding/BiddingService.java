package com.example.auctionservice.bidding;

import com.example.auctionservice.auction.Auction;
import com.example.auctionservice.user.User;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BiddingService {

  private final BiddingRepository biddingRepository;

  public Bidding createBidding(final Bidding bidding){
    return biddingRepository.save(bidding);
  }

  public List<Bidding> listBiddingsForUser(final Long userId){
    return biddingRepository.findBiddingByUserId(userId);
  }

}
