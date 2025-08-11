# IPL SQL Practice Project

## 📌 Overview
This project contains an **IPL-themed SQL database** with two tables:  
- `IPL_Matches` — match-level details  
- `IPL_Player_Stats` — player performance stats  

It includes **20 SQL queries** (10 single-table + 10 join-based) along with explanations so you can learn SQL from beginner to advanced.

---

## 📂 Database Schema

### 1️⃣ IPL_Matches
| Column         | Type         | Description                       |
|----------------|--------------|-----------------------------------|
| match_id       | INT (PK)     | Unique match identifier           |
| season         | INT          | Year of IPL season                |
| team1          | VARCHAR(50)  | First batting team                 |
| team2          | VARCHAR(50)  | Second batting team                |
| winner         | VARCHAR(50)  | Match winner                       |
| venue          | VARCHAR(100) | Match venue                        |
| runs_team1     | INT          | Runs scored by team1               |
| runs_team2     | INT          | Runs scored by team2               |
| wickets_team1  | INT          | Wickets lost by team1              |
| wickets_team2  | INT          | Wickets lost by team2              |

```sql
CREATE TABLE IPL_Matches (
    match_id INT PRIMARY KEY,
    season INT,
    team1 VARCHAR(50),
    team2 VARCHAR(50),
    winner VARCHAR(50),
    venue VARCHAR(100),
    runs_team1 INT,
    runs_team2 INT,
    wickets_team1 INT,
    wickets_team2 INT
);

INSERT INTO IPL_Matches VALUES
(1, 2022, 'MI', 'CSK', 'MI', 'Wankhede Stadium', 180, 175, 5, 6),
(2, 2022, 'RCB', 'KKR', 'KKR', 'Eden Gardens', 150, 151, 8, 7),
(3, 2023, 'CSK', 'GT', 'GT', 'Narendra Modi Stadium', 200, 201, 4, 3),
(4, 2023, 'MI', 'RCB', 'MI', 'Wankhede Stadium', 190, 185, 3, 5),
(5, 2023, 'GT', 'KKR', 'GT', 'Eden Gardens', 170, 165, 6, 7);
