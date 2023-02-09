package com.example.auctionservice.bidding;

import com.example.auctionservice.user.User;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BiddingRepository extends JpaRepository<Bidding, Long> {

  List<Bidding> findBiddingByUserId(Long userId);

}
