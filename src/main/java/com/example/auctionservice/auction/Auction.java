package com.example.auctionservice.auction;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Auction {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String title;
  private String description;
  private byte[] images;
  private String auctionCategory;
  private double minimalPrice;
  private double buyNowPrice;
  private boolean isPromoted;
  private String location;
  private Date auctionIssueDate;
  private Date auctionEndDate;
  private Integer auctionVisits;

}
