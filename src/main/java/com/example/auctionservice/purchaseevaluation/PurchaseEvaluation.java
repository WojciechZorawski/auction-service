package com.example.auctionservice.purchaseevaluation;

import com.example.auctionservice.purchase.Purchase;
import com.example.auctionservice.utils.Rate;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
public class PurchaseEvaluation {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @ManyToOne
  @JoinColumn(name = "purchase_id", referencedColumnName = "id")
  private Purchase purchase;
  @Enumerated(EnumType.STRING)
  private Rate sellerRate;
  private String sellerComment;
  @Enumerated(EnumType.STRING)
  private Rate buyerRate;
  private String buyerComment;

}
