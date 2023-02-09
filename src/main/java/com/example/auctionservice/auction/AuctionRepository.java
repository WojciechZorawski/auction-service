package com.example.auctionservice.auction;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AuctionRepository extends JpaRepository<Auction, Long> {

  @Query(
      value = "SELECT * FROM auction a ORDER BY a.auction_issue_date DESC LIMIT 10",
      nativeQuery = true
  )
  List<Auction> findFirst10OrderByDate();

  @Query(
      value = "SELECT * FROM auction a ORDER BY a.auction_end_date ASC LIMIT 10",
      nativeQuery = true
  )
  List<Auction> findLast10OrderByDate();

}
