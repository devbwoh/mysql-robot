# 데이터베이스 2025

https://nano5.notion.site/Spring-Data-JPA-MySQL-1abdaf211d42817581b9e3dd2ed9d21f?pvs=4

```mermaid
erDiagram
    mechanic ||--o{ equipment : "장착"
    weapon ||--o{ equipment : "장착"

    mechanic {
        INT id PK "로봇 ID"
        VARCHAR name "이름"
        VARCHAR model "모델명"
        VARCHAR manufacturer "제조사"
        VARCHAR class "전투 등급"
    }

    equipment {
        INT mechanic_id PK,FK "로봇 ID"
        INT weapon_id PK,FK "무기 ID"
        VARCHAR location "장착 부위"
        INT quantity "수량"
    }

    weapon {
        INT id PK "무기 ID"
        VARCHAR name "무기 이름"
        VARCHAR type "유형"
        INT damage "피해량"
        VARCHAR ability "특수 능력"
    }
```


![image](https://github.com/user-attachments/assets/621c79a3-2c25-403f-9ca6-e817988d02d8)

![image](https://github.com/user-attachments/assets/00c855ac-4217-4990-a5ee-58fda447e2fa)

