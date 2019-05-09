Feature: BirthDate
  BirthDates per person

#  Scenario: Data table without header one row
#    Given Data table without header
#      | Annie M. G. | Schmidt  | 1911-03-20 |
#
#
#  Scenario: Data table with header one row
#    Given Data table with header
#      | firstName   | lastName | birthDate  |
#      | Annie M. G. | Schmidt  | 1911-03-20 |

  Scenario: Data table with header multipe rows
    Given Data table with header multiple rows
      | firstName | lastName | birthDate  |
      | Annie M.G | Schmidt  | 1911-03-20 |
      | Roald     | Dahl     | 1916-09-13 |
      | Astrid    | Lindgren | 1907-11-14 |