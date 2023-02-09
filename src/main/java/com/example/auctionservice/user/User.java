package com.example.auctionservice.user;

import com.example.auctionservice.utils.AccountStatus;
import com.example.auctionservice.utils.AccountType;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String login;
  private char[] password;
  private String accountName;
  private String voivodeship;
  private String city;
  private String address;
  private Date accountRegistrationDate;
  @Enumerated(EnumType.STRING)
  private AccountStatus accountStatus;
  private byte[] avatar;
  @Enumerated(EnumType.STRING)
  private AccountType accountType;

}
