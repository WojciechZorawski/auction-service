CREATE TABLE auction(
  id bigint,
  title varchar(50),
  description varchar(50),
  images bytea,
  auction_category varchar(50),
  minimal_price double precision,
  buy_now_price double precision,
  is_promoted boolean,
  location varchar(50),
  auction_issue_date date,
  auction_end_date date,
  auction_visits bigint
);

CREATE TABLE bidding(
  id bigint,
  auction_id bigint,
  user_id bigint,
  price double precision
)

CREATE TABLE account(
  id bigint,
  login varchar(50),
  password char(50),
  account_name varchar(50),
  voivodeship varchar(50),
  city varchar(50),
  address varchar(50),
  account_registration_date date,
  account_status varchar(50),
  avatar bytea,
  account_type varchar(50)
)

