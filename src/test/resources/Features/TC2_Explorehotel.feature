Feature: Verify the Adactin hotel with explore automation
@Explore
  Scenario Outline: Verifying hotel booking with all fields filled
    Given User is on the Hotel page
    When User Enter the "<username>" and "<password>"
    Then User Should verify the login success message "Welcome to Adactin Group of Hotels"
    When User Enter the "<Location>", "< Hotels>","<Room Type>","<Number of Room>","<Checkin>","<Checkout>","<adultRoom>" and "<ChildrenNum>"
    Then User should verify the Select Hotel Success message "Select Hotel"

    Examples: 
      | username  | password | Location | Hotels         | Room Type | Number of Room | Checkin    | Checkout   | adultRoom | ChildrenNum |
      | vignesh94 | ED1P32   | Sydney   | Hotel Sunshine | Double    | 4 - Four       | 10/12/2023 | 11/12/2023 | 3 - Three | 2 - Two     |
